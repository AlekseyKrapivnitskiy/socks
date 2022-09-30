package elements.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import elements.modals.CustomerLoginModal;
import elements.modals.RegisterModal;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class TopBarFragment extends ElementsContainer {

    @FindBy(css = "#login")
    private SelenideElement loginButton;

    @FindBy(css = "#register")
    private SelenideElement registerButton;

    @FindBy(css = ".modal-content")
    private CustomerLoginModal customerLoginModal;

    @FindBy(css = ".modal-content")
    private RegisterModal registerModal;

    @Step("Click on 'Login' button")
    public void clickOnLoginButton() {
        loginButton.click();
    }

    @Step("Click on 'Register' button")
    public void clickOnRegisterButton() {
        registerButton.click();
    }
}
