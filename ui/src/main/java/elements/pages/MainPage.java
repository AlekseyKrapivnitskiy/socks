package elements.pages;

import elements.fragments.NavigationBarFragment;
import elements.fragments.TopBarFragment;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(css = "#topbar")
    private TopBarFragment topBar;

    @FindBy(css = "#navbar")
    private NavigationBarFragment navigationBar;
}
