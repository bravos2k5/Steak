package steamfake.dao;

import steamfake.model.NapCK;
import steamfake.model.NapCard;
import steamfake.model.NapTien;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NapTienDAO implements DataAccessObject<NapTien> {

    private static NapTienDAO instance;

    public static NapTienDAO getInstance() {
        if (instance == null) {
            instance = new NapTienDAO();
        }
        return instance;
    }

    private NapTienDAO() {
    }


    @Override
    public int insert(NapTien object) {
        String sql = "INSERT INTO PHIEU_NAP VALUES(?,?,?,?,?,?)";
        if (XJdbc.update(sql,
                object.getId(),
                object.getAccountID(),
                object.getMethod(),
                object.getNgayNap(),
                object.getStatus(),
                object.getSoTien()) > 0) {
            if (object instanceof NapCard napCard) {
                sql = "INSERT INTO CARD VALUES(?,?,?,?)";
                return XJdbc.update(sql,
                        napCard.getId(),
                        napCard.getSecretKey(),
                        napCard.getSeri(),
                        napCard.getNhaMang());
            } else if (object instanceof NapCK napCK) {
                sql = "INSERT INTO NAP_CHUYEN_KHOAN VALUES(?,?)";
                return XJdbc.update(sql, napCK.getId(), napCK.getHinhThuc());
            }
        }
        return -1;
    }

    /**
     * Chỉ cập nhật trạng thái
     *
     * @param object napcard or napck
     * @return result
     */
    @Override
    public int update(NapTien object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(NapTien object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NapTien selectByID(NapTien object) {
        return null;
    }

    @Override
    public List<NapTien> selectAll() {
        return List.of();
    }

    @Override
    public List<NapTien> selectBySQL(String sql, Object... args) {
        List<NapTien> list = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql, args)) {
            while(rs.next()) {
                int method = rs.getInt("method");
                NapTien napTien;
                if(method == NapTien.NAP_CARD) {
                    napTien = new NapCard();
                    ((NapCard) napTien).setSecretKey(rs.getString("secret_key"));
                    ((NapCard) napTien).setSeri(rs.getString("seri"));
                    ((NapCard) napTien).setNhaMang(rs.getInt("nha_mang"));
                }
                else {
                    napTien = new NapCK();
                    ((NapCK) napTien).setHinhThuc(rs.getInt("hinh_thuc"));
                }
                napTien.setId(UUID.fromString(rs.getString("id")));
                napTien.setAccountID(UUID.fromString(rs.getString("account_id")));
                napTien.setMethod(method);
                napTien.setNgayNap(rs.getDate("ngay_nap"));
                napTien.setStatus(rs.getInt("trang_thai"));
                napTien.setSoTien(rs.getDouble("so_tien"));
                list.add(napTien);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<NapTien> selectByMethod(int method) {
        String sql = "{CALL SP_LAY_THONG_TIN_NAP(?)}";
        return selectBySQL(sql, method);
    }

    public List<NapTien> selectByMethodAndAccount(int method, UUID accountID) {
        String sql = "{CALL SP_LAY_THONG_TIN_NAP_BY_ACCOUNT_ID(?, ?)}";
        return selectBySQL(sql, accountID, method);
    }

    public int acceptPhieuNap(NapTien napTien) {
        String sql = "{CALL SP_DUYET_PHIEU_NAP(?,?,?,?,?)}";
        return XJdbc.update(sql, napTien.getId(), napTien.getAccountID(), napTien.getSoTien(),napTien.getMethod(), NapTien.ACCEPTED);
    }

    public int rejectPhieuNap(NapTien napTien) {
        String sql = "{CALL SP_DUYET_PHIEU_NAP(?,?,?,?,?)}";
        return XJdbc.update(sql, napTien.getId(), napTien.getAccountID(), napTien.getSoTien(),napTien.getMethod(), NapTien.REJECTED);
    }

}
