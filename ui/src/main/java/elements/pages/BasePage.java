package elements.pages;

import elements.fragments.NavigationBarFragment;
import elements.fragments.TopBarFragment;
import elements.modals.CustomerLoginModal;
import elements.modals.RegisterModal;
import entities.Customer;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static systemAlerts.RegistrationAlerts.REGISTRATION_SUCCESSFUL;

public class BasePage {

    @FindBy(css = "#topbar")
    private TopBarFragment topBar;

    @FindBy(css = "#navbar")
    private NavigationBarFragment navigationBar;

    @FindBy(css = "#login-modal")
    private CustomerLoginModal customerLoginModal;

    @FindBy(css = "#register-modal")
    private RegisterModal registerModal;

    @Step("Open the 'Customer login' modal")
    public void openCustomerLoginModal() {
        topBar.clickOnLoginButton();
    }

    @Step("Fill the 'Customer login' modal and click on the 'Log in' button")
    public void fillCustomerLoginModalClickOnLogInButton(Customer customer) {
        customerLoginModal.fillUsernameInput(customer.getUsername());
        customerLoginModal.fillPasswordInput(customer.getPassword());
        customerLoginModal.clickOnLoginButton();
    }

    @Step("Open the 'Register' modal")
    public void openRegisterModal() {
        topBar.clickOnRegisterButton();
    }

    @Step("Fill the 'Register' modal and click on the 'Register' button")
    public void fillRegisterModalClickOnRegisterButton(Customer customer) {
        registerModal.fillUsernameInput(customer.getUsername());
        registerModal.fillFirstNameInput(customer.getFirstName());
        registerModal.fillLastNameInput(customer.getLastName());
        registerModal.fillEmailInput(customer.getEmail());
        registerModal.fillPasswordInput(customer.getPassword());
        registerModal.clickRegisterButton();
        checkRegistrationMessage(REGISTRATION_SUCCESSFUL);
    }

    @Step("Check that customer logged in")
    public void checkCustomerLoggedIn(Customer customer) {
        assertThat(topBar.getUsername(), containsString(customer.getFirstName() + " " + customer.getLastName()));
    }

    @Step("Check registration message")
    public void checkRegistrationMessage(String message) {
        assertThat(registerModal.getRegistrationMessage(), containsString(message));
    }
}
