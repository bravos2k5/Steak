package steamfake.dao;

import steamfake.model.Account;
import steamfake.model.BankAccount;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BankAccountDAO implements DataAccessObject<BankAccount> {

    private static BankAccountDAO instance;

    public static BankAccountDAO gI() {
        if(instance == null) {
            instance = new BankAccountDAO();
        }
        return instance;
    }

    @Override
    public int insert(BankAccount object) {
        String sql = "INSERT INTO BANK_ACCOUNT VALUES(?,?,?,?)";
        return XJdbc.update(sql,object.getAccountID(),object.getBankID(),
                object.getSoTaiKhoan(),object.getId());
    }

    @Override
    public int update(BankAccount object) {
        String sql = "UPDATE BANK_ACCOUNT " +
                "SET " +
                "bank_id = ?," +
                "so_tai_khoan = ? " +
                "WHERE id = ?";
        return XJdbc.update(sql,object.getBankID(),object.getSoTaiKhoan(),object.getId());
    }

    @Override
    public int delete(BankAccount object) {
        String sql = "DELETE FROM BANK_ACCOUNT " +
                "WHERE id = ?";
        return XJdbc.update(sql,object.getId());
    }

    @Override
    public BankAccount selectByID(BankAccount object) {
        String sql = "SELECT * FROM BANK_ACCOUNT WHERE id = ?";
        List<BankAccount> bankAccountList = selectBySQL(sql,object.getId());
        return bankAccountList.isEmpty() ? null : bankAccountList.getFirst();
    }

    @Override
    public List<BankAccount> selectAll() {
        return selectBySQL("SELECT * FROM BANK_ACCOUNT");
    }

    public List<BankAccount> selectByAccount(Account account) {
        String sql = "SELECT * FROM BANK_ACCOUNT WHERE account_id = ?";
        return selectBySQL(sql,account.getId());
    }

    @Override
    public List<BankAccount> selectBySQL(String sql, Object... args) {
        List<BankAccount> bankAccountList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)) {
            while (rs.next()) {
                BankAccount bankAccount = new BankAccount();
                bankAccount.setId(UUID.fromString(rs.getString("id")));
                bankAccount.setAccountID(UUID.fromString(rs.getString("account_id")));
                bankAccount.setBankID(rs.getInt("bank_id"));
                bankAccount.setSoTaiKhoan(rs.getString("so_tai_khoan"));
                bankAccountList.add(bankAccount);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bankAccountList;
    }
}
