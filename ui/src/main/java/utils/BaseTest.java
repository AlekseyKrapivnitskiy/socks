package utils;

import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.*;
import static utils.ConfigProperties.getProperty;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        baseUrl = getProperty("baseUrl");
        browser = "chrome";
    }
}
