package mypages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PasswordReset extends AbstractPage {
    @FindBy(xpath ="//input[@type='email']")
    private ExtendedWebElement userEmailInput;
    @FindBy(xpath = "//button[text()='Password Reset']")
    private ExtendedWebElement passwordResetBtn;
    public PasswordReset(WebDriver driver) {
        super(driver);
    }
    public boolean isPasswordResetButtonPresent() {
        return passwordResetBtn.isElementPresent();

    }
    public void enterUserEmail(String userEmail) {
        userEmailInput.type(userEmail);
    }
    public void clickPasswordResetBtn(){passwordResetBtn.click();}
}
