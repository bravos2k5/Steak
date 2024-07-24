package steamfake.dao;

import steamfake.model.PendingGame;
import steamfake.model.PhieuKiemDuyet;
import steamfake.utils.MonthYear;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class KiemDuyetDAO implements DataAccessObject<PhieuKiemDuyet> {

    private static KiemDuyetDAO instance;

    private KiemDuyetDAO() {
    }

    public static KiemDuyetDAO getInstance() {
        if (instance == null) {
            instance = new KiemDuyetDAO();
        }
        return instance;
    }

    public int createGame(PhieuKiemDuyet phieuKiemDuyet, PendingGame pendingGame) {
        String sql = "{CALL SP_TAO_PHIEU_KIEM_DUYET(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        return XJdbc.update(sql,
                phieuKiemDuyet.getId(), phieuKiemDuyet.getPublisherID(), phieuKiemDuyet.getMoTa(),
                phieuKiemDuyet.getThongBao(),pendingGame.getGameID(),pendingGame.getName(),
                pendingGame.getAvatar(),pendingGame.getGiaTien(),pendingGame.getAge(),
                pendingGame.getImages(),pendingGame.getMoTa(),pendingGame.getRam(),
                pendingGame.getRom(),pendingGame.getVersion(),pendingGame.getExecPath());
    }

    public int acceptGame(PhieuKiemDuyet phieuKiemDuyet) {
        String sql = "{CALL SP_ACCEPT_GAME(?)}";
        return XJdbc.update(sql, phieuKiemDuyet.getId());
    }

    public int rejectGame(PhieuKiemDuyet phieuKiemDuyet) {
        String sql = "{CALL SP_REJECT_GAME(?,?)}";
        return XJdbc.update(sql, phieuKiemDuyet.getId(),phieuKiemDuyet.getThongBao());
    }

    @Override
    public int insert(PhieuKiemDuyet object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(PhieuKiemDuyet object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(PhieuKiemDuyet object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<PhieuKiemDuyet> selectAll() {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET";
        return selectBySQL(sql);
    }

    public PhieuKiemDuyet selectByID(PhieuKiemDuyet phieuKiemDuyet) {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE id = ?";
        List<PhieuKiemDuyet> phieuKiemDuyetList = selectBySQL(sql, phieuKiemDuyet.getId());
        return phieuKiemDuyetList.isEmpty() ? null : phieuKiemDuyetList.get(0);
    }

    public List<PhieuKiemDuyet> selectByPublisherID(UUID publisherID) {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE publisher_id = ?";
        return selectBySQL(sql, publisherID);
    }

    public List<PhieuKiemDuyet> selectBySQL(String sql, Object... args) {
        List<PhieuKiemDuyet> phieuKiemDuyetList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql, args)) {
            while (rs.next()) {
                PhieuKiemDuyet phieuKiemDuyet = new PhieuKiemDuyet();
                phieuKiemDuyet.setId(rs.getObject("id", java.util.UUID.class));
                phieuKiemDuyet.setPublisherID(rs.getObject("publisher_id", java.util.UUID.class));
                phieuKiemDuyet.setMoTa(rs.getString("mo_ta"));
                phieuKiemDuyet.setStatus(rs.getInt("trang_thai"));
                phieuKiemDuyet.setThongBao(rs.getString("thong_bao"));
                phieuKiemDuyet.setNgayTao(rs.getDate("ngay_tao"));
                phieuKiemDuyetList.add(phieuKiemDuyet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return phieuKiemDuyetList;
    }

    public List<PhieuKiemDuyet> selectByStatus(PhieuKiemDuyet phieuKiemDuyet) {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE status = ?";
        return selectBySQL(sql, phieuKiemDuyet.getStatus());
    }

    public List<PhieuKiemDuyet> selectByStatusAndPublisherID(PhieuKiemDuyet phieuKiemDuyet) {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE status = ? AND publisher_id = ?";
        return selectBySQL(sql, phieuKiemDuyet.getStatus(), phieuKiemDuyet.getPublisherID());
    }

    public List<Integer> selectListYear() {
        String sql = "SELECT DISTINCT YEAR(ngay_tao) FROM PHIEU_KIEM_DUYET";
        List<Integer> listYear = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql)) {
            while (rs.next()) {
                listYear.add(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listYear;
    }

    public List<PhieuKiemDuyet> selectByMonthAndYear(MonthYear monthYear) {
        int month = monthYear.getMonth();
        int year = monthYear.getYear();
        if(month == 0 && year == 0) {
            return selectAll();
        }
        if(month == 0) {
            return selectByYear(year);
        }
        if(year == 0) {
            return selectByMonth(month);
        }
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE MONTH(ngay_tao) = ? AND YEAR(ngay_tao) = ?";
        return selectBySQL(sql, monthYear.getMonth(), monthYear.getYear());
    }

    public List<PhieuKiemDuyet> selectByYear(int year) {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE YEAR(ngay_tao) = ?";
        return selectBySQL(sql, year);
    }

    public List<PhieuKiemDuyet> selectByMonth(int month) {
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE MONTH(ngay_tao) = ?";
        return selectBySQL(sql, month);
    }

    public PendingGame selectPendingGameById(PhieuKiemDuyet phieuKiemDuyet) {
        String sql = "SELECT * FROM PENDING_GAMES WHERE review_id = ?";
        try(ResultSet rs = XJdbc.getResultSet(sql, phieuKiemDuyet.getId())) {
            if(rs.next()) {
                PendingGame pendingGame = new PendingGame();
                pendingGame.setGameID(rs.getObject("game_id", java.util.UUID.class));
                pendingGame.setName(rs.getString("name"));
                pendingGame.setAvatar(rs.getString("avatar"));
                pendingGame.setGiaTien(rs.getDouble("gia_tien"));
                pendingGame.setAge(rs.getInt("age"));
                pendingGame.setImages(rs.getString("images"));
                pendingGame.setMoTa(rs.getString("mo_ta"));
                pendingGame.setRam(rs.getInt("ram"));
                pendingGame.setRom(rs.getInt("rom"));
                pendingGame.setVersion(rs.getString("version"));
                pendingGame.setExecPath(rs.getString("exec_file"));
                return pendingGame;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
