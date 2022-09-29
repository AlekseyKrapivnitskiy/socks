package elements.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import elements.modals.CustomerLoginModal;
import org.openqa.selenium.support.FindBy;

public class HeaderFragment extends ElementsContainer {

    @FindBy(css = "#login")
    private SelenideElement loginButton;

    @FindBy(css = "#register")
    private SelenideElement registerButton;

    @FindBy(css = "#tabIndex")
    private SelenideElement homeButton;

    @FindBy(css = "#tabCatalogue")
    private SelenideElement catalogueButton;

    @FindBy(css = ".modal-content")
    private CustomerLoginModal customerLoginModal;

    @FindBy(css = ".modal-content")
    private CustomerLoginModal registerModal;
}
