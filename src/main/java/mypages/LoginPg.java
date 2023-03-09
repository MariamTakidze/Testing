package mypages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPg extends AbstractPage {
    @FindBy(xpath = "//input[@type='submit']")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//input[@id='UserName']")
//    @FindBy(xpath = "[input#UserName.form-control]")
//    [input#UserName.form-control]
    private ExtendedWebElement userLoginInput;

    @FindBy(xpath = "//input[@id='Password']")
    private ExtendedWebElement userPasswordInput;


    public LoginPg(WebDriver driver) {
        super(driver);

    }

    public boolean isLoginButtonPresent() {
        return loginBtn.isElementPresent();

    }

    public void enterUserName(String userName) {
        userLoginInput.type(userName);
    }

    public void enterUserPassword(String userPassword) {
        userPasswordInput.type(userPassword);
    }

    public void clickLogintBtn() {
        loginBtn.click();
    }
}
