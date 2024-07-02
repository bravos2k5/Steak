package utils.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class XJdbc {

    private static PreparedStatement getStatement(String sql, Object...args) {
        Connection connection = DatabaseConnector.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            if(sql.startsWith("{")) {
                ps = connection.prepareCall(sql);
            } else {
                ps = connection.prepareStatement(sql);
            }
            for(int i = 0; i < args.length; i++) {
                ps.setObject(i + 1,args[i]);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ps;
    }

    public static int update(String sql, Object...args) {
        try(PreparedStatement ps = getStatement(sql,args)) {
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return -1;
        }
    }

    public static ResultSet getResultSet(String sql, Object...args) {
        try {
            PreparedStatement ps = getStatement(sql,args);
            return ps.executeQuery();
        } catch (SQLException e) {
            return null;
        }
    }

}
