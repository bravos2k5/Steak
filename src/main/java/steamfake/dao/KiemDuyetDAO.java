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

public class KiemDuyetDAO {

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
        String sql = "SELECT * FROM PHIEU_KIEM_DUYET WHERE MONTH(ngay_tao) = ? AND YEAR(ngay_tao) = ?";
        return selectBySQL(sql, monthYear.getMonth(), monthYear.getYear());
    }

}
