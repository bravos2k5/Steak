package steamfake.dao;

import steamfake.model.NapCK;
import steamfake.model.NapCard;
import steamfake.model.NapTien;

import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

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
        String sql = "INSERT INTO PHIEU_NAP VALUES(?,?,?,?,?)";
        if (XJdbc.update(sql,
                object.getId(),
                object.getAccountID(),
                object.getMethod(),
                object.getNgayNap(),
                object.getStatus()) > 0) {
            if (object instanceof NapCard napCard) {
                sql = "INSERT INTO CARD VALUES(?,?,?,?)";
                return XJdbc.update(sql,
                        napCard.getId(),
                        napCard.getSecretKey(),
                        napCard.getSeri(),
                        napCard.getMenhGia());
            } else if (object instanceof NapCK napCK) {
                sql = "INSERT INTO NAP_CHUYEN_KHOAN VALUES(?,?)";
                return XJdbc.update(sql, napCK.getId(), napCK.getSoTien());
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
      return List.of();
    }


}
