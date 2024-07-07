package steamfake.dao;

import steamfake.model.PhieuRutNganHang;
import steamfake.model.PhieuRutTien;
import steamfake.utils.database.XJdbc;

import java.util.List;

public class RutTienDAO implements DataAccessObject<PhieuRutTien> {

    private static RutTienDAO instance;

    private RutTienDAO() {
    }

    public static RutTienDAO getInstance() {
        if (instance == null) {
            instance = new RutTienDAO();
        }
        return instance;
    }


    @Override
    public int insert(PhieuRutTien object) {
        if(object instanceof PhieuRutNganHang phieuRut) {
            String sql = "{CALL SP_TAO_RUT_TIEN_BANK(?,?,?,?,?)}";
            return XJdbc.update(sql, phieuRut.getId(), phieuRut.getAccountID(),
                    phieuRut.getSoTienRut(), phieuRut.getBankID(), phieuRut.getSoTaiKhoan());
        }
        else {
            String sql = "INSERT INTO PHIEU_RUT_TIEN(id,account_id,so_tien_rut,method,trang_thai) VALUES(?,?,?,?,?)";
            return XJdbc.update(sql, object.getId(), object.getAccountID(), object.getSoTienRut(),
                    object.getMethod(), object.isTrangThai());
        }
    }


    @Override
    public int update(PhieuRutTien object) {

        return 0;
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
        return List.of();
    }

}
