package elements.modals;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
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
}
