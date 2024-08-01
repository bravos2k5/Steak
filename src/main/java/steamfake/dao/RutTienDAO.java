package steamfake.dao;

import steamfake.model.Account;
import steamfake.model.PhieuKiemDuyet;
import steamfake.model.PhieuRutNganHang;
import steamfake.model.PhieuRutTien;
import steamfake.utils.MonthYear;
import steamfake.utils.database.XJdbc;

import javax.swing.plaf.PanelUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RutTienDAO implements DataAccessObject<PhieuRutTien> {

    private static RutTienDAO instance;

    private RutTienDAO() {
    }

    public static RutTienDAO gI() {
        if (instance == null) {
            instance = new RutTienDAO();
        }
        return instance;
    }


    @Override
    public int insert(PhieuRutTien object) {
        if (object.getMethod() == PhieuRutTien.METHOD_ATM && object instanceof PhieuRutNganHang phieuRut) {
            String sql = "{CALL SP_TAO_RUT_TIEN_BANK(?,?,?,?,?)}";
            return XJdbc.update(sql, phieuRut.getId(), phieuRut.getAccountID(),
                    phieuRut.getSoTienRut(), phieuRut.getBankID(), phieuRut.getSoTaiKhoan());
        } else {
            String sql = "INSERT INTO PHIEU_RUT_TIEN(id,account_id,so_tien_rut,method,trang_thai) VALUES(?,?,?,?,?)";
            return XJdbc.update(sql, object.getId(), object.getAccountID(), object.getSoTienRut(),
                    object.getMethod(), object.getTrangThai());
        }
    }


    @Override
    public int update(PhieuRutTien object) {
        return -1;
    }

    @Override
    public int delete(PhieuRutTien object) {
        return 0;
    }

    @Override
    public PhieuRutTien selectByID(PhieuRutTien object) {
        return null;
    }

    @Override
    public List<PhieuRutTien> selectAll() {
        return selectBySQL("SELECT * From PHIEU_RUT_TIEN");
    }

    public int rejectWithdraw(PhieuRutTien phieuRutTien) {
        String sql = "{Call SP_TU_CHOI_RUT_BANK(?)}";
        return XJdbc.update(sql,phieuRutTien.getAccountID());
    }

    public List<Integer> selectListYear() {
        String sql = "SELECT DISTINCT YEAR(ngay_rut) FROM PHIEU_RUT_TIEN";
        List<Integer> listYear = new ArrayList<>();
        try (ResultSet rs = XJdbc.getResultSet(sql)) {
            while (rs.next()) {
                listYear.add(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listYear;
    }

    @Override
    public List<PhieuRutTien> selectBySQL(String sql, Object... args) {
        List<PhieuRutTien> phieuRutTienList = new ArrayList<>();
        try (ResultSet rs = XJdbc.getResultSet(sql, args)) {
            while (rs.next()) {
                PhieuRutTien phieuRutTien = new PhieuRutTien();
                phieuRutTien.setId(UUID.fromString(rs.getString("id")));
                phieuRutTien.setAccountID(UUID.fromString(rs.getString("account_id")));
                phieuRutTien.setSoTienRut(rs.getFloat("so_tien_rut"));
                phieuRutTien.setMethod(rs.getInt("method"));
                phieuRutTien.setNgayRut(rs.getDate("ngay_rut"));
                phieuRutTien.setTrangThai(rs.getInt("trang_thai"));
                phieuRutTienList.add(phieuRutTien);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return phieuRutTienList;
    }

    public List<PhieuRutTien> selectByAccountID(Account account) {
        String sql = "SELECT * FROM PHIEU_RUT_TIEN WHERE account_id = ?";
        return selectBySQL(sql, account.getId());
    }

    public int updateStatus(PhieuRutTien object, int status) {
        String sql = "UPDATE PHIEU_RUT_TIEN SET trang_thai = ? WHERE id = ?";
        return XJdbc.update(sql, status, object.getId());
    }

    public List<PhieuRutTien> selectByMonthAndYear(MonthYear monthYear) {
        int month = monthYear.getMonth();
        int year = monthYear.getYear();
        if (month == 0 && year == 0) {
            return selectAll();
        }
        if (month == 0) {
            return selectByYear(year);
        }
        if (year == 0) {
            return selectByMonth(month);
        }
        String sql = "SELECT * FROM PHIEU_RUT_TIEN WHERE MONTH(ngay_rut) = ? AND YEAR(ngay_rut) = ?";
        return selectBySQL(sql, monthYear.getMonth(), monthYear.getYear());
    }

    public List<PhieuRutTien> selectByYear(int year) {
        String sql = "SELECT * FROM PHIEU_RUT_TIEN WHERE YEAR(ngay_rut) = ?";
        return selectBySQL(sql, year);
    }

    public List<PhieuRutTien> selectByMonth(int month) {
        String sql = "SELECT * FROM PHIEU_RUT_TIEN WHERE MONTH(ngay_rut) = ?";
        return selectBySQL(sql, month);
    }
}
