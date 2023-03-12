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

    //restore btn
    @FindBy(xpath = "//span[text()='Restore']")
    private ExtendedWebElement restoreBtn;



    public LoginPageTKT(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginButtonPresent() {
        return loginBtn.isElementPresent();

    }

    public PasswordReset clickRestoreBtn(){
        restoreBtn.click();
        return new PasswordReset(getDriver());
    }

    public void enterUserEmail(String userEmail) {
        userEmailInput.type(userEmail);
    }

    public void enterUserPassword(String userPassword) {
        userPasswordInput.type(userPassword);
    }

    public void clickLogintBtn() {
        loginBtn.click();
    }
}
