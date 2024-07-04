package dao;

import model.Game;
import utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    @Override
    public int insert(Game object) {
        String sql = "insert into GAME (id, publisher_id, name, avatar, gia_tien, age," +
                " images, mo_ta, ram, rom, update_date, version, isOpened, exec_file)";
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
                game.setPublisherID(UUID.fromString(rs.getString("publish_id")));
                game.setName(rs.getNString("name"));
                game.setAvatar(rs.getString("avatar"));
                game.setGiaTien(rs.getFloat("gia_tien"));
                game.setAge(rs.getInt("age"));
                game.setImages(rs.getString("images"));
                game.setMoTa(rs.getNString("mo_ta"));
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

}
