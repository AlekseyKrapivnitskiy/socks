package elements.fragments;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarFragment extends ElementsContainer {

    @FindBy(css = "#tabIndex")
    private SelenideElement homeButton;

    @FindBy(css = "#tabCatalogue")
    private SelenideElement catalogueButton;
}
