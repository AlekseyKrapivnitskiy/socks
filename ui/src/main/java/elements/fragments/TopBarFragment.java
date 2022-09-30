package elements.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;

public class TopBarFragment extends ElementsContainer {

    @FindBy(css = "#login")
    private SelenideElement loginButton;

    @FindBy(css = "#register")
    private SelenideElement registerButton;

    @FindBy(css = "#howdy")
    private SelenideElement username;

    @FindBy(css = "#logout")
    private SelenideElement logoutButton;

    @Step("Click on the 'Login' button")
    public void clickOnLoginButton() {
        loginButton.click();
    }

    @Step("Click on the 'Register' button")
    public void clickOnRegisterButton() {
        registerButton.click();
    }

    @Step("Get username")
    public String getUsername() {
        return username.shouldBe(visible).getText().replace("Logged in as ", "");
    }

    @Step("Click on the 'Logout' button")
    public void clickOnLogoutButton() {
        logoutButton.click();
    }
}
