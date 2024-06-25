package utils.database;

import utils.XProperties;

import java.util.Properties;

public class DatabaseConnector {

    private static DatabaseConnector instance;

    private DatabaseConnector() {
        Properties properties = XProperties.loadProperties("database.properties");
        if(properties == null) {
            // Message here
        }
    }

    public static DatabaseConnector getInstance() {
        if(instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

}
