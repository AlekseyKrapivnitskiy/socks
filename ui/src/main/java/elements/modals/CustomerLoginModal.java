package elements.modals;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginModal extends ElementsContainer {

    @FindBy(css = "#username-modal")
    private SelenideElement usernameInput;

    @FindBy(css = "#password-modal")
    private SelenideElement passwordInput;

    @FindBy(css = ".btn-primary")
    private SelenideElement logInButton;

    @FindBy(css = ".close")
    private SelenideElement closeButton;

    @FindBy(css = "#login-message")
    private SelenideElement loginMessage;

    @Step("Fill the 'Username' input")
    public void fillUsernameInput(String username) {
        usernameInput.setValue(username);
    }

    @Step("Fill the 'Password' input")
    public void fillPasswordInput(String password) {
        passwordInput.setValue(password);
    }

    @Step("Click on the 'Login' button")
    public void clickOnLoginButton() {
        logInButton.click();
    }

    @Step("Get login message")
    public String getLoginMessage() {
        return loginMessage.getText();
    }
}
