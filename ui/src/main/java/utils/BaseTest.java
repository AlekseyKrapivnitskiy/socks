package utils;

import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;
import static utils.ConfigProperties.getProperty;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        baseUrl = getProperty("baseUrl");
        browser = "chrome";
        browserSize = "1920x1080";
    }
}
