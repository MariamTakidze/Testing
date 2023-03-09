package laba;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath ="//*[text()='Вход']")
    private ExtendedWebElement EntranceBtn;
    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.onliner.by");
//        setPageAbsoluteURL("https://www.onliner.by/");
    }

    public LoginScreen clickEntranceBtn(){
        EntranceBtn.click();
        return new LoginScreen(getDriver());
    }
}

