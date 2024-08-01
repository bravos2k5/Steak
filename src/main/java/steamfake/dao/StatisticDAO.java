package steamfake.dao;

import steamfake.utils.XMessage;
import steamfake.utils.database.XJdbc;

import java.sql.ResultSet;
import java.util.TreeMap;

public class StatisticDAO {

    public static TreeMap<Integer,Integer> selectTotalRevenueEachYear() {
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

    public static TreeMap<Integer, Integer> selectTotalRevenueEachMonth(int year) {
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

}
