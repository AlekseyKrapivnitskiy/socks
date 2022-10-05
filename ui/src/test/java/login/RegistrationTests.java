package login;

import elements.pages.HomePage;
import entities.Customer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.passwordGenerator.PasswordPolicy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static java.util.Locale.ENGLISH;
import static testDataGenerators.CustomerGenerator.generatedAllFieldsCustomer;
import static utils.ConfigProperties.getProperty;
import static utils.passwordGenerator.PasswordGenerator.generatePassword;

public class RegistrationTests extends BaseTest {

    private HomePage homePage;
    private Customer customer;

    @BeforeMethod
    void beforeMethod() {
        homePage = page(HomePage.class);
        String password = generatePassword(PasswordPolicy.builder().build());
        customer = generatedAllFieldsCustomer(ENGLISH, password);
        open(getProperty("homePageUrl"));
    }

    @Test
    void registerPositive() {
        homePage.openRegisterModal();
        homePage.fillRegisterModalClickOnRegisterButton(customer);
        homePage.checkCustomerLoggedIn(customer);

        homePage.logout();

        homePage.openCustomerLoginModal();
        homePage.fillCustomerLoginModalClickOnLogInButton(customer);
        homePage.checkCustomerLoggedIn(customer);
    }
}