package mypages;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageTKT extends AbstractPage {
    @FindBy(xpath ="//*[text()='Login']")
    private ExtendedWebElement loginBtn;

    public HomePageTKT (WebDriver driver){
        super(driver);
    }

    public LoginPageTKT clickLoginBtn(){
        loginBtn.click();
        return new LoginPageTKT(getDriver());
    }
}
