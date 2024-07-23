package steamfake.dao;

import steamfake.model.Account;
import steamfake.model.Game;
import steamfake.model.join.GameDisplay;
import steamfake.utils.SessionManager;
import steamfake.utils.database.XJdbc;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GameDAO implements DataAccessObject<Game> {

    private static GameDAO instance;

    public static GameDAO gI() {
        if(instance == null) {
            instance = new GameDAO();
        }
        return instance;
    }

    private GameDAO() {
    }

    @Override
    public int insert(Game object) {
        String sql = "insert into GAME (id, publisher_id, name, avatar, gia_tien, age," +
                " images, mo_ta, ram, rom, update_date, version, isOpened, exec_file) " +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return XJdbc.update(sql,object.getId(),object.getPublisherID(),object.getName(),
                object.getAvatar(),object.getGiaTien(),object.getAge(),object.getImages(),object.getMoTa(),
                object.getRam(),object.getRom(),object.getUpdateDate(),object.getVersion(),object.isOpened(),object.getExecPath());
    }

    @Override
    public int update(Game object) {
        String sql = "UPDATE Game " +
                "SET " +
                "name = ?, " +
                "avatar = ?, " +
                "gia_tien = ?," +
                "age = ?, " +
                "images = ?, " +
                "mo_ta = ?, " +
                "ram = ?, " +
                "rom = ?, " +
                "version = ?," +
                "exec_file = ?" +
                "WHERE id = ?";
        return XJdbc.update(sql,
                object.getName(),
                object.getAvatar(),
                object.getGiaTien(),
                object.getAge(),
                object.getImages(),
                object.getMoTa(),
                object.getRam(),
                object.getRom(),
                object.getVersion(),
                object.getExecPath(),
                object.getId());
    }

    @Override
    public int delete(Game object) {
        String sql = "DELETE FROM Game WHERE id = ?";
        return XJdbc.update(sql,object.getId());
    }

    @Override
    public Game selectByID(Game object) {
        String sql = "SELECT * FROM Game WHERE id = ?";
        List<Game> gameList = selectBySQL(sql,object.getId());
        return gameList.isEmpty() ? null : gameList.getFirst();
    }

    @Override
    public List<Game> selectAll() {
        String sql = "SELECT * FROM Game";
        return selectBySQL(sql);
    }

    @Override
    public List<Game> selectBySQL(String sql, Object... args) {
        List<Game> gameList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,args)){
            while (rs.next()) {
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
                gameList.add(game);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return gameList;
    }

    public int selectLuotTai(Game game) {
        String sql = "{CALL SP_TINH_LUOT_TAI(?)}";
        try(ResultSet rs = XJdbc.getResultSet(sql,game.getId())) {
            if(rs.next()) {
                return rs.getInt("luot_tai");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public int selectAvgRate(Game game) {
        String sql = "{CALL SP_TINH_DIEM_DANH_GIA(?)}";
        try(ResultSet rs = XJdbc.getResultSet(sql,game.getId())) {
            if(rs.next()) {
                return rs.getInt("diem_tb");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public List<Game> selectTop10Game() {
        String sql = "{CALL SP_TOP10_GAME()}";
        return selectBySQL(sql);
    }

    public List<Game> selectMultiGame(String...ids) {
        StringBuilder sql = new StringBuilder("SELECT * FROM Game WHERE id IN (");
        if (ids.length > 1) {
            sql.append("?,".repeat(ids.length - 1));
        }
        sql.append("?)");
        return selectBySQL(sql.toString(), Arrays.stream(ids).toArray());
    }

    public Game selectMostDownloadedGame() {
        String sql = "{CALL SP_LAY_GAME_TOP1()}";
        List<Game> gameList = selectBySQL(sql);
        return gameList.isEmpty() ? null : gameList.getFirst();
    }

    public List<Game> selectOldGame() {
        String sql = "{CALL SP_LAY_TOP_GAME_CU()}";
        return selectBySQL(sql);
    }

    public List<Game> selectGameByPublisher(Account account) {
        String sql = "SELECT * FROM Game WHERE publisher_id = ?";
        return selectBySQL(sql,account.getId());
    }

    public int muaGame(Game game, Account account) {
        String sql = "{CALL SP_MUA_GAME(?,?)}";
        return XJdbc.update(sql,account.getId(),game.getId());
    }

    public String selectUsernamePublisher(Game game) {
        String sql = "{CALL SP_LAY_TEN_NHA_PHAT_HANH(?)}";
        try(ResultSet rs = XJdbc.getResultSet(sql,game.getId())) {
            if(rs.next()) {
                return rs.getNString("ho_ten");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<GameDisplay> selectListGameDisplay() {
        String sql = "{CALL SP_GET_DISPLAY_GAMES(?)}";
        List<GameDisplay> gameDisplayList = new ArrayList<>();
        int age = 12;
        if(SessionManager.isLogin()) {
            age = new Date(System.currentTimeMillis()).toLocalDate().getYear() - SessionManager.user.getDob().toLocalDate().getYear();
        }
        try(ResultSet rs = XJdbc.getResultSet(sql,age)) {
            while (rs.next()) {
                GameDisplay gameDisplay = new GameDisplay(UUID.fromString(rs.getString("id")));
                gameDisplay.setPublisherID(UUID.fromString(rs.getString("publisher_id")));
                gameDisplay.setName(rs.getNString("name"));
                gameDisplay.setAvatar(rs.getString("avatar"));
                gameDisplay.setGiaTien(rs.getFloat("gia_tien"));
                gameDisplay.setAge(rs.getInt("age"));
                gameDisplay.setImages(rs.getString("images"));
                gameDisplay.setMoTa(rs.getString("mo_ta"));
                gameDisplay.setRam(rs.getInt("ram"));
                gameDisplay.setRom(rs.getInt("rom"));
                gameDisplay.setReleaseDate(rs.getDate("release_date"));
                gameDisplay.setUpdateDate(rs.getDate("update_date"));
                gameDisplay.setVersion(rs.getNString("version"));
                gameDisplay.setOpened(rs.getBoolean("isOpened"));
                gameDisplay.setExecPath(rs.getString("exec_file"));
                gameDisplay.setDownloadCount(rs.getInt("download_count"));
                gameDisplay.setAvgRating(rs.getInt("rate"));
                gameDisplay.setPublisherName(rs.getNString("ho_ten"));
                gameDisplayList.add(gameDisplay);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return gameDisplayList;
    }

}
