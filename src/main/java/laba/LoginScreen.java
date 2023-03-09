package laba;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginScreen extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(),'Вход')]")
    private List < ExtendedWebElement> LoginBtn;
    public LoginScreen(WebDriver driver) {
        super(driver);
    }
    public boolean isLoginBtnPresent(){

        return LoginBtn.get(0).isElementPresent();
    }
}
