package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {

    private ConfigProperties() {}

    private static InputStream inputStream;
    public static Properties PROPERTIES;

    static {
        try {
            inputStream = ConfigProperties.class.getClassLoader().getResourceAsStream("config.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
