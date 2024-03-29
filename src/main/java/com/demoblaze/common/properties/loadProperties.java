package com.demoblaze.common.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class loadProperties {
    // Load the properties file from the folder
    public static Properties userData = LoadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\properties\\userdata.properties");

    private static Properties LoadProperties(String path) {
        Properties pro = new Properties();
        //stream for reading file
        try {
            FileInputStream stream = new FileInputStream(path);
            pro.load(stream);
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error occurred : " + e.getMessage());
        }
        return pro;
    }
}
