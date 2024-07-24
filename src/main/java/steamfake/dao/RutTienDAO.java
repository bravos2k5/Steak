package steamfake.dao;

import steamfake.model.Account;
import steamfake.model.PhieuRutNganHang;
import steamfake.model.PhieuRutTien;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
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
        if(object.getMethod() == PhieuRutTien.METHOD_ATM && object instanceof PhieuRutNganHang phieuRut) {
            String sql = "{CALL SP_TAO_RUT_TIEN_BANK(?,?,?,?,?)}";
            return XJdbc.update(sql, phieuRut.getId(), phieuRut.getAccountID(),
                    phieuRut.getSoTienRut(), phieuRut.getBankID(), phieuRut.getSoTaiKhoan());
        }
        else {
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
        return List.of();
    }

    @Override
    public List<PhieuRutTien> selectBySQL(String sql, Object... args) {
        List<PhieuRutTien> phieuRutTienList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql, args)) {
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

    public int updateStatus(PhieuRutTien object) {
        String sql = "UPDATE PHIEU_RUT_TIEN SET trang_thai = ? WHERE id = ?";
        return XJdbc.update(sql, object.getTrangThai(), object.getId());
    }

}
