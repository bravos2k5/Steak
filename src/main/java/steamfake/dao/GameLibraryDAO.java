package steamfake.dao;

import steamfake.model.GameLibrary;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GameLibraryDAO implements DataAccessObject<GameLibrary> {

    private static GameLibraryDAO instance;

    public static GameLibraryDAO gI() {
        if(instance == null) {
            instance = new GameLibraryDAO();
        }
        return instance;
    }

    @Override
    public int insert(GameLibrary object) {
        String sql = "INSERT INTO THU_VIEN_GAME VALUES(?,?,?,?)";
        return XJdbc.update(sql,object.getAccountId(),object.getGameId(),
                object.getGiaMua(),object.getNgayMua());
    }

    @Override
    public int update(GameLibrary object) {
        String sql = "UPDATE THU_VIEN_GAME " +
                "SET " +
                "gia_mua = ?," +
                "ngay_mua = ? " +
                "WHERE account_id = ? and game_id = ?";
        return XJdbc.update(sql,object.getGiaMua(),object.getNgayMua(),
                object.getAccountId(),object.getGiaMua());
    }

    @Override
    public int delete(GameLibrary object) {
        String sql = "DELETE FROM THU_VIEN_GAME WHERE account_id = ? and game_id = ?";
        return XJdbc.update(sql,object.getAccountId(),object.getGameId());
    }

    @Override
    public GameLibrary selectByID(GameLibrary object) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE account_id = ? and game_id = ?";
        List<GameLibrary> gameLibraryList = selectBySQL(sql,object.getAccountId(),object.getGameId());
        return gameLibraryList.isEmpty() ? null : gameLibraryList.getFirst();
    }

    @Override
    public List<GameLibrary> selectAll() {
        String sql = "SELECT * FROM THU_VIEN_GAME";
        return selectBySQL(sql);
    }

    @Override
    public List<GameLibrary> selectBySQL(String sql, Object... args) {
        List<GameLibrary> gameLibraryList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)) {

            while (rs.next()) {
                GameLibrary gameLibrary = new GameLibrary();
                gameLibrary.setAccountId(UUID.fromString(rs.getString("account_id")));
                gameLibrary.setGameId(UUID.fromString(rs.getString("game_id")));
                gameLibrary.setGiaMua(rs.getFloat("gia_mua"));
                gameLibrary.setNgayMua(rs.getDate("ngay_mua"));
                gameLibraryList.add(gameLibrary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return gameLibraryList;
    }

    public List<GameLibrary> selectByAccountID(GameLibrary o) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE account_id = ?";
        return selectBySQL(sql,o.getAccountId());
    }

    public List<GameLibrary> selectByGameID(GameLibrary o) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE game_id = ?";
        return selectBySQL(sql,o.getGameId());
    }

}
