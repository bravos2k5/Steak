package steamfake.dao;

import steamfake.model.Account;
import steamfake.model.Game;
import steamfake.model.GameLibrary;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
                "ngay_mua = ?," +
                "rate = ?," +
                "comment = ? " +
                "WHERE account_id = ? and game_id = ?";
        return XJdbc.update(sql,object.getGiaMua(),object.getNgayMua(), object.getRate(), object.getComment(),
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
                gameLibrary.setRate(rs.getObject("rate",Integer.class));
                gameLibrary.setComment(rs.getNString("comment"));
                gameLibrary.setGiaMua(rs.getFloat("gia_mua"));
                gameLibrary.setNgayMua(rs.getDate("ngay_mua"));
                gameLibraryList.add(gameLibrary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return gameLibraryList;
    }

    public List<GameLibrary> selectByAccountID(UUID id) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE account_id = ?";
        return selectBySQL(sql,id);
    }

    public int updateRateAndComment(GameLibrary object) {
        String sql = "UPDATE THU_VIEN_GAME " +
                "SET " +
                "rate = ?," +
                "comment = ? " +
                "WHERE account_id = ? and game_id = ?";
        return XJdbc.update(sql,object.getRate(),object.getComment().trim(),object.getAccountId(),object.getGameId());
    }

    public GameLibrary selectByGameIdAndAccountId(UUID gameId, UUID accountId) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE game_id = ? and account_id = ?";
        List<GameLibrary> gameLibraryList = selectBySQL(sql,gameId,accountId);
        return gameLibraryList.isEmpty() ? null : gameLibraryList.getFirst();
    }

    public List<GameLibrary> selectByGameID(UUID id) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE game_id = ?";
        return selectBySQL(sql,id);
    }

    public List<GameLibrary> selectCommentByGameID(UUID id) {
        String sql = "SELECT * FROM THU_VIEN_GAME WHERE game_id = ? and comment != ''";
        return selectBySQL(sql,id);
    }

    public HashMap<GameLibrary, Game> selectLibraryMap(Account account) {
        String sql = "{CALL SP_GET_MAP_LIBRARY(?)}";
        HashMap<GameLibrary,Game> libraryGameHashMap = new HashMap<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,account.getId())) {
            while (rs.next()) {
                GameLibrary gameLibrary = new GameLibrary();
                gameLibrary.setAccountId(UUID.fromString(rs.getString("account_id")));
                gameLibrary.setGameId(UUID.fromString(rs.getString("game_id")));
                gameLibrary.setGiaMua(rs.getFloat("gia_mua"));
                gameLibrary.setNgayMua(rs.getDate("ngay_mua"));
                //
                Game game = new Game();
                game.setId(UUID.fromString(rs.getString("id")));
                game.setPublisherID(UUID.fromString(rs.getString("publisher_id")));
                game.setName(rs.getNString("name"));
                game.setAvatar(rs.getString("avatar"));
                game.setGiaTien(rs.getFloat("gia_tien"));
                game.setAge(rs.getInt("age"));
                game.setImages(rs.getString("images"));
                game.setMoTa(rs.getString("mo_ta"));
                game.setRam(rs.getInt("ram"));
                game.setRom(rs.getInt("rom"));
                game.setReleaseDate(rs.getDate("release_date"));
                game.setUpdateDate(rs.getDate("update_date"));
                game.setVersion(rs.getNString("version"));
                game.setOpened(rs.getBoolean("isOpened"));
                game.setExecPath(rs.getString("exec_file"));
                libraryGameHashMap.put(gameLibrary,game);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return libraryGameHashMap;
    }

}
