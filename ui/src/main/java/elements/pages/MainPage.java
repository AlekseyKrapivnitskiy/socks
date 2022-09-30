package elements.pages;

import elements.fragments.NavigationBarFragment;
import elements.fragments.TopBarFragment;
import elements.modals.CustomerLoginModal;
import elements.modals.RegisterModal;
import entities.Customer;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(css = "#topbar")
    private TopBarFragment topBar;

    @FindBy(css = "#navbar")
    private NavigationBarFragment navigationBar;

    @FindBy(css = "#login-modal")
    private CustomerLoginModal customerLoginModal;

    @FindBy(css = "#register-modal")
    private RegisterModal registerModal;

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
    }
}
