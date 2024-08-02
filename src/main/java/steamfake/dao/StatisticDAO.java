package steamfake.dao;

import steamfake.model.join.statistic.TopDoiTac;
import steamfake.model.join.statistic.TopNapTien;
import steamfake.utils.XMessage;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class StatisticDAO {

    public static TreeMap<Integer,Integer> selectRevenueEachYear() {
        String sql = "{CALL SP_TINH_DOANH_THU_CTY_EACH_YEAR()}";
        TreeMap<Integer,Integer> map = new TreeMap<>();
        try(ResultSet rs = XJdbc.getResultSet(sql)) {
            while (rs.next()) {
                map.put(rs.getInt("nam"), rs.getInt("total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            XMessage.alert(null,"WTFFFFF");
        }
        return map;
    }

    public static TreeMap<Integer, Integer> selectRevenueEachMonth(int year) {
        String sql = "{CALL SP_TINH_DOANH_THU_CTY_1_YEAR(?)}";
        TreeMap<Integer,Integer> map = new TreeMap<>();
        try(ResultSet rs = XJdbc.getResultSet(sql,year)) {
            while (rs.next()) {
                map.put(rs.getInt("thang"), rs.getInt("total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            XMessage.alert(null,"WTFFFFF");
        }
        return map;
    }

    public static List<TopDoiTac> selectTopDoiTac() {
        String sql = "{CALL SP_TOP_DOI_TAC()}";
        List<TopDoiTac> topDoiTacList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql)) {
            while (rs.next()) {
                TopDoiTac topDoiTac = new TopDoiTac();
                topDoiTac.setUsername(rs.getString("username"));
                topDoiTac.setTongDoanhThu(rs.getDouble("total_lifetime_revenue"));
                topDoiTac.setTongDoanhThuThangNay(rs.getDouble("total_monthly_revenue"));
                topDoiTacList.add(topDoiTac);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return topDoiTacList;
    }

    public static List<TopNapTien> selectTopNapTien() {
        String sql = "{CALL SP_TOP_NAP_TIEN()}";
        List<TopNapTien> topNapTienList = new ArrayList<>();
        try(ResultSet rs = XJdbc.getResultSet(sql)) {
            while (rs.next()) {
                TopNapTien topNapTien = new TopNapTien();
                topNapTien.setUsername(rs.getString("username"));
                topNapTien.setTongNapTien(rs.getDouble("total_deposit"));
                topNapTien.setTongNapTienThangNay(rs.getDouble("total_monthly_deposit"));
                topNapTien.setSoTienDaChiTieu(rs.getDouble("total_spent"));
                topNapTienList.add(topNapTien);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return topNapTienList; }

}
