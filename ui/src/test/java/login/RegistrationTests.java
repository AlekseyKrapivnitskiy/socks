package login;

import elements.pages.HomePage;
import entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.passwordGenerator.PasswordPolicy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static java.util.Locale.ENGLISH;
import static testDataGenerators.CustomerGenerator.generateCustomer;
import static utils.ConfigProperties.getProperty;
import static utils.passwordGenerator.PasswordGenerator.generatePassword;

public class RegistrationTests extends BaseTest {

    private final static Logger log = LoggerFactory.getLogger(RegistrationTests.class);

    private HomePage homePage;
    private Customer customer;

    @BeforeMethod
    void beforeMethod() {
        homePage = page(HomePage.class);
        String password = generatePassword(PasswordPolicy.builder()
                .length(10)
                .useLower(true)
                .useUpper(true)
                .useDigits(true)
                .usePunctuation(true)
                .build());
        customer = generateCustomer(ENGLISH, password);
        open(getProperty("homePageUrl"));

        log.info("Opened " + getProperty("baseUrl") + getProperty("homePageUrl"));
    }

    @Test
    void registerPositive() {
        log.info("Test 'registerPositive()' is started");

        homePage.openRegisterModal();
        homePage.fillRegisterModalClickOnRegisterButton(customer);
        homePage.checkCustomerLoggedIn(customer);

        homePage.logout();

        homePage.openCustomerLoginModal();
        homePage.fillCustomerLoginModalClickOnLogInButton(customer);
        homePage.checkCustomerLoggedIn(customer);

        log.info("Test 'registerPositive()' is finished");
    }
}