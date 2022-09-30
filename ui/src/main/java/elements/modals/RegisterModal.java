package elements.modals;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class RegisterModal extends ElementsContainer {

    @FindBy(css = "#register-username-modal")
    private SelenideElement usernameInput;

    @FindBy(css = "#register-first-modal")
    private SelenideElement firstNameInput;

    @FindBy(css = "#register-last-modal")
    private SelenideElement lastNameInput;

    @FindBy(css = "#register-email-modal")
    private SelenideElement emailInput;

    @FindBy(css = "#register-password-modal")
    private SelenideElement passwordInput;

    @FindBy(css = ".btn-primary")
    private SelenideElement registerButton;

    @FindBy(css = ".close")
    private SelenideElement closeButton;

    @FindBy(css = "#registration-message")
    private SelenideElement registrationMessage;

    @Step("Fill the 'Username' input")
    public void fillUsernameInput(String username) {
        usernameInput.setValue(username);
    }

    @Step("Fill the 'First name' input")
    public void fillFirstNameInput(String firstName) {
        firstNameInput.setValue(firstName);
    }

    @Step("Fill the 'Last name' input")
    public void fillLastNameInput(String lastName) {
        lastNameInput.setValue(lastName);
    }

    @Step("Fill the 'Email' input")
    public void fillEmailInput(String email) {
        emailInput.setValue(email);
    }

    @Step("Fill the 'Password' input")
    public void fillPasswordInput(String password) {
        passwordInput.setValue(password);
    }

    @Step("Click on the 'Register' button")
    public void clickRegisterButton() {
        registerButton.click();
    }

    @Step("Get registration message")
    public String getRegistrationMessage() {
        return registrationMessage.getText();
    }
}
