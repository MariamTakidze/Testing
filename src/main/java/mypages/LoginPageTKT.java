package mypages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPageTKT extends AbstractPage {
    @FindBy(xpath ="//input[@type='text']")
    private ExtendedWebElement userEmailInput;

    @FindBy(xpath = "//input[@type='password']")
    private ExtendedWebElement userPasswordInput;

//    @FindBy(xpath = "//input[@id='continueButton2']")
    @FindBy(xpath = "//button[text()='Login']")
    private ExtendedWebElement loginBtn;

    public LoginPageTKT(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginButtonPresent() {
        return loginBtn.isElementPresent();

    }

    public void enterUserEmail(String userName) {
        userEmailInput.type(userName);
    }

    public void enterUserPassword(String userPassword) {
        userPasswordInput.type(userPassword);
    }

    public void clickLogintBtn() {
        loginBtn.click();
    }
}
