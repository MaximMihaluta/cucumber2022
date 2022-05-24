package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
//  1 .Create a path the file
//  2.Properties object (this is comming from java library)
//  3.Open the file using FileInputStream
//  4.Load properties from the file to the properties object
//  5.Read the valus from the object using getProperty()



    private static Properties properties = new Properties();

    static {
        String path = "configuration.properties";
        FileInputStream file;
        {
            try {
                file = new FileInputStream(path);
                properties.load(file);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

        public static String getProperty (String key){
            return properties.getProperty(key);
        }

}
