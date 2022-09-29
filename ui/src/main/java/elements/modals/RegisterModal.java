package elements.modals;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class RegisterModal extends ElementsContainer {

    @FindBy(css = "#register-username-modal")
    private SelenideElement userNameInput;

    @FindBy(css = "#register-first-modal")
    private SelenideElement firstNameInput;

    @FindBy(css = "#register-last-modal")
    private SelenideElement lastNameInput;

    @FindBy(css = "#register-email-modal")
    private SelenideElement emailInput;

    @FindBy(css = "#password-modal")
    private SelenideElement passwordInput;

    @FindBy(css = ".btn-primary")
    private SelenideElement registerButton;

    @FindBy(css = ".close")
    private SelenideElement closeButton;
}
