package steamfake.dao;

import steamfake.model.Bank;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankDAO implements DataAccessObject<Bank> {

    private static BankDAO instance;

    public static BankDAO gI() {
        if(instance == null) {
            instance = new BankDAO();
        }
        return instance;
    }

    private BankDAO() {}

    public Bank selectByID(String id) {
        String sql = "SELECT * FROM Bank WHERE id = ?";
        List<Bank> bankList = selectBySQL(sql,id);
        return bankList.isEmpty() ? null : bankList.getFirst();
    }

    @Override
    public int insert(Bank object) {
        return 0;
    }

    @Override
    public int update(Bank object) {
        return 0;
    }

    @Override
    public int delete(Bank object) {
        return 0;
    }

    @Override
    public Bank selectByID(Bank object) {
        return null;
    }

    public List<Bank> selectAll() {
        return selectBySQL("SELECT * FROM Bank WHERE trang_thai = 1");
    }

    public List<Bank> selectBySQL(String sql, Object...args) {
        List<Bank> bankList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)) {
            while (rs.next()) {
                Bank bank = new Bank();
                bank.setId(rs.getInt("id"));
                bank.setName(rs.getNString("name"));
                bank.setStatus(rs.getBoolean("trang_thai"));
                bankList.add(bank);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bankList;
    }

}
