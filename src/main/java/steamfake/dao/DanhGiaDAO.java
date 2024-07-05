package steamfake.dao;

import steamfake.model.DanhGia;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DanhGiaDAO implements DataAccessObject<DanhGia> {

    private static DanhGiaDAO instance;

    public static DanhGiaDAO gI() {
        if(instance == null) {
            instance = new DanhGiaDAO();
        }
        return instance;
    }

    private DanhGiaDAO() {}

    @Override
    public int insert(DanhGia object) {
        String sql = "INSERT INTO DANH_GIA VALUES(?,?,?,?)";
        return XJdbc.update(sql,
                object.getAccountID(),
                object.getGameID(),
                object.getRate(),
                object.getComment());
    }

    @Override
    public int update(DanhGia object) {
        String sql = "UPDATE DANH_GIA " +
                "SET " +
                "rate = ?, " +
                "comment = ? " +
                "WHERE account_id = ? and game_id = ?";
        return XJdbc.update(sql,object.getRate(),
                object.getComment(),
                object.getAccountID(),
                object.getGameID());
    }

    @Override
    public int delete(DanhGia object) {
        String sql = "DELETE FROM DANH_GIA WHERE account_id = ? and game_id = ?";
        return XJdbc.update(sql,object.getAccountID(),object.getGameID());
    }

    @Override
    public DanhGia selectByID(DanhGia object) {
        String sql = "SELECT * FROM DANH_GIA WHERE account_id = ? and game_id = ?)";
        List<DanhGia> danhGiaList = selectBySQL(sql,object.getAccountID(),object.getGameID());
        return danhGiaList.isEmpty() ? null : danhGiaList.getFirst();
    }

    @Override
    public List<DanhGia> selectAll() {
        String sql = "SELECT * FROM DANH_GIA";
        return selectBySQL(sql);
    }

    @Override
    public List<DanhGia> selectBySQL(String sql, Object... args) {
        List<DanhGia> danhGiaList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)) {
            while (rs.next()) {
                DanhGia danhGia = new DanhGia();
                danhGia.setAccountID(UUID.fromString(rs.getString("account_id")));
                danhGia.setGameID(UUID.fromString(rs.getString("game_id")));
                danhGia.setRate(rs.getInt("rate"));
                danhGia.setComment(rs.getNString("comment"));
                danhGiaList.add(danhGia);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return danhGiaList;
    }

}
