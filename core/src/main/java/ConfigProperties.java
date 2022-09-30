import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private ConfigProperties() {};

    private static FileInputStream fileInputStream;
    public static Properties PROPERTIES;

    static {
        try {
            PROPERTIES = new Properties();
            fileInputStream = new FileInputStream("config.properties");
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
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
