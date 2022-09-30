package elements.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class TopBarFragment extends ElementsContainer {

    @FindBy(css = "#login")
    private SelenideElement loginButton;

    @FindBy(css = "#register")
    private SelenideElement registerButton;

    @Step("Click on the 'Login' button")
    public void clickOnLoginButton() {
        loginButton.click();
    }

    @Step("Click on the 'Register' button")
    public void clickOnRegisterButton() {
        registerButton.click();
    }
}
