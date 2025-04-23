package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
    public static FileInputStream file;
    public static Properties prop=null;

    /*Method name:loadBaseProperties
    *Author:Sumayya Sultana
    *Description:This method is for load configuration settings from an external properties file
    *Return Type:Properties
    */

    public Properties loadBaseProperties(){
        String propertiesPath = System.getProperty("user.dir") + "/config/browser.properties";
        try {
            file = new FileInputStream(propertiesPath);
            prop = new Properties();
            prop.load(file);
            return prop;

        } catch (Exception e) {
            System.out.println("Can not load properties file "+e.getMessage());
        }
        return prop;
    }
}




