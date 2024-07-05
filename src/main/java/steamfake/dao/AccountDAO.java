package steamfake.dao;

import steamfake.model.Account;
import steamfake.utils.XSecurity;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountDAO implements DataAccessObject<Account> {

    private static AccountDAO instance;

    public static AccountDAO gI() {
        if(instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    private AccountDAO() {}

    @Override
    public int insert(Account object) {
        String sql = "INSERT INTO Account VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return XJdbc.update(sql,object.getId()
                ,object.getUsername()
                ,object.getPassword()
                ,object.getHoTen()
                ,object.getEmail()
                ,object.getGioiTinh()
                ,object.getPhone()
                ,object.isBan()
                ,object.isAdmin()
                ,object.getAvatar()
                ,object.getDob()
                ,object.getSoDuGame()
                ,object.getSoDuThuNhap());
    }

    @Override
    public int update(Account object) {
        String sql = "UPDATE Account " +
                "SET " +
                "ho_ten = ?," +
                "email = ?," +
                "gioi_tinh = ?," +
                "phone = ?," +
                "isBan = ?," +
                "isAdmin = ?," +
                "avatar = ?," +
                "dob = ? " +
                "WHERE ID = ?";
        return XJdbc.update(sql,object.getHoTen(),
                object.getEmail(),
                object.getGioiTinh(),
                object.getPhone(),
                object.isBan(),
                object.isAdmin(),
                object.getAvatar(),
                object.getDob(),
                object.getId());
    }

    @Override
    public int delete(Account object) {
        String sql = "DELETE FROM Account " +
                "WHERE id = ?";
        return XJdbc.update(sql,object.getId());
    }

    @Override
    public Account selectByID(Account object) {
        String sql = "SELECT * FROM Account WHERE id = ?";
        List<Account> accountList = selectBySQL(sql,object.getId());
        return accountList.isEmpty() ? null : accountList.getFirst();
    }

    @Override
    public List<Account> selectAll() {
        String sql = "SELECT * FROM Account";
        return selectBySQL(sql);
    }

    @Override
    public List<Account> selectBySQL(String sql, Object... args) {
        List<Account> accountList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)) {
            while (rs.next()) {
                Account account = new Account();
                account.setId(UUID.fromString(rs.getString("id")));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setHoTen(rs.getNString("ho_ten"));
                account.setEmail(rs.getString("email"));
                account.setGioiTinh(rs.getInt("gioi_tinh"));
                account.setPhone(rs.getString("phone"));
                account.setBan(rs.getBoolean("isBan"));
                account.setAdmin(rs.getBoolean("admin"));
                account.setAvatar(rs.getString("avatar"));
                account.setDob(rs.getDate("dob"));
                account.setSoDuGame(rs.getFloat("so_du_game"));
                account.setSoDuThuNhap(rs.getFloat("so_du_kdoanh"));
                account.setNgayTao(rs.getDate("create_time"));
                accountList.add(account);
            }
        } catch (SQLException e) {
            // Thông báo lỗi ra
            throw new RuntimeException(e);
        }
        return accountList;
    }

    public int register(Account account) {
        String sql = "{call register(?,?,?,?,?,?,?)}";
        return XJdbc.update(sql,account.getId(),
                account.getUsername(),
                account.getPassword(),
                account.getHoTen(),
                account.getEmail(),
                account.getGioiTinh(),
                account.getDob());
    }

    public Account login(String username, String password) {
        String sql = "SELECT * FROM Account WHERE username = ?";
        List<Account> accountList = selectBySQL(sql,username);
        Account account = accountList.isEmpty() ? null : accountList.getFirst();
        if(account == null || !XSecurity.isValidPassword(password,account.getPassword())) return null;
        return account;
    }

    public void updateViGame(Account account, float money) {
        float currentMoney = account.getSoDuGame();
        if(money == 0 || (money < 0 && currentMoney < Math.abs(money))) {
            return;
        }
        account.setSoDuGame(currentMoney + money);
        String sql = "UPDATE Account " +
                "SET so_du_game = ? " +
                "WHERE id = ?";
        XJdbc.update(sql,account.getSoDuGame(),account.getId());
    }

    public void updateViThuNhap(Account account, float money) {
        float currentMoney = account.getSoDuThuNhap();
        if(money == 0 || (money < 0 && currentMoney < Math.abs(money))) {
            return;
        }
        account.setSoDuThuNhap(currentMoney + money);
        String sql = "UPDATE Account " +
                "SET so_du_kdoanh = ? " +
                "WHERE id = ?";
        XJdbc.update(sql,account.getSoDuThuNhap(),account.getId());
    }

    public void khoaTaiKhoan(Account account) {
        String sql = "UPDATE Account " +
                "SET isBan = 1 " +
                "WHERE id = ?";
        XJdbc.update(sql,account.getId());
    }

}