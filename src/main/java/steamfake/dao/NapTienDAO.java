package steamfake.dao;

import steamfake.model.NapCK;
import steamfake.model.NapCard;
import steamfake.model.NapTien;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NapTienDAO implements DataAccessObject<NapTien> {

    private static NapTienDAO instance;

    public static NapTienDAO gI() {
        if(instance == null) {
            instance = new NapTienDAO();
        }
        return instance;
    }

    @Override
    public int insert(NapTien object) {
        String sql;
        if(object instanceof NapCard napCard) {
            sql = "{CALL SP_NAP_CARD(?,?,?,?,?)}";
            return XJdbc.update(sql,napCard.getId(),napCard.getAccountID(), napCard.getSecretKey(),
                    napCard.getSeri(),napCard.getSoTien());
        }
        else if(object instanceof NapCK napCK) {
            sql = "{CALL SP_NAP_CK(?,?,?,?)}";
            return XJdbc.update(sql,napCK.getId(),napCK.getAccountID(),napCK.getSoTien(),napCK.getHinhThuc());
        }
        return -1;
    }

    /**
     * Chỉ cập nhật trạng thái
     * @param object napcard or napck
     * @return result
     */
    @Override
    public int update(NapTien object) {
        String sql = "UPDATE PHIEU_NAP " +
                "SET trang_thai = ? " +
                "WHERE id = ?";
        return XJdbc.update(sql,object.getStatus(),object.getId());
    }

    @Override
    public int delete(NapTien object) {
        String sql = "DELETE FROM PHIEU_NAP WHERE id = ?";
        return XJdbc.update(sql,object.getId());
    }

    @Override
    public NapTien selectByID(NapTien object) {
        String sql = "{CALL LAY_PHIEU_NAP_BY_ID(?,?) }";
        List<NapTien> napTienList = selectBySQL(sql,object.getId(),object.getMethod());
        return napTienList.isEmpty() ? null : napTienList.getFirst();
    }

    @Override
    public List<NapTien> selectAll() {
        String sql = "{CALL LAY_PHIEU_NAP()}";
        return selectBySQL(sql);
    }

    @Override
    public List<NapTien> selectBySQL(String sql, Object... args) {
        List<NapTien> napTienList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)) {
            while (rs.next()) {
                NapTien napTien = null;
                if(rs.getInt("method") == 0) {
                    napTien = new NapCard();
                    ((NapCard) napTien).setNhaMang(rs.getInt("nha_mang"));
                    ((NapCard) napTien).setSecretKey(rs.getString("secret_key"));
                    ((NapCard) napTien).setSeri(rs.getString("seri"));
                }
                else {
                    napTien = new NapCK();
                    ((NapCK) napTien).setHinhThuc(rs.getInt("hinh_thuc"));
                }
                napTien.setId(UUID.fromString(rs.getString("id")));
                napTien.setAccountID(UUID.fromString(rs.getString("account_id")));
                napTien.setMethod(rs.getInt("method"));
                napTien.setNgayNap(rs.getDate("ngay_nap"));
                napTien.setSoTien(rs.getFloat("so_tien"));
                napTien.setStatus(rs.getInt("status"));
                napTienList.add(napTien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return napTienList;
    }

}
