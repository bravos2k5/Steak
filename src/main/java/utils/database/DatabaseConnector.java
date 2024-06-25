package utils.database;

import utils.XProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnector {

    private static DatabaseConnector instance;
    private final String connectionUrl;
    private final String username;
    private final String password;
    private Connection connection;

    private DatabaseConnector() {
        Properties properties = XProperties.loadProperties("database.properties");
        String host = properties.getProperty("database.host");
        String port = properties.getProperty("database.port");
        username = properties.getProperty("database.username");
        password = properties.getProperty("database.password");
        String dbName = properties.getProperty("database.name");
        connectionUrl = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + dbName + "; " +
                "encrypt=false;" +
                "trustServerCertificate=false;" +
                "integratedSecurity=false;";
    }

    public static DatabaseConnector getInstance() {
        if(instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if(connection == null || connection.isClosed()) {
                DriverManager.setLoginTimeout(10);
                connection = DriverManager.getConnection(connectionUrl,username,password);
            }
            return connection;
        } catch (SQLException e) {
            return null;
        }
    }

    public void closeConnection() {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Message here
                throw new RuntimeException(e);
            }
        }
    }


}
