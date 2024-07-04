package utils;

import java.io.*;
import java.util.Date;
import java.util.Properties;

public class XProperties {

    public static Properties loadProperties(String path) {
        try(FileInputStream fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);
            return properties;
        } catch (IOException e) {
            // Message here
            throw new RuntimeException(e);
        }
    }


    public static void saveProperties(Properties properties, String path) {
        try(FileOutputStream fos = new FileOutputStream(path)) {
            File file = new File(path);
            if(file.createNewFile()) {
                System.out.println("Create new properties file at " + file.getAbsolutePath());
            }
            properties.store(fos,"Saved at " + new Date());
        } catch (IOException e) {
            //Message here
            throw new RuntimeException(e);
        }
    }

}
