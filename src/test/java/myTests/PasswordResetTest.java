package myTests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import mypages.HomePageTKT;
import mypages.LoginPageTKT;
import mypages.PasswordReset;
import myservices.PasswordResetService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.mongodb.util.MyAsserts.assertTrue;

public class PasswordResetTest extends AbstractTest {

    WebDriver webDriver;
    @Test
    public void Pwreset(){
        HomePageTKT homePageTKT = new HomePageTKT(getDriver());
        homePageTKT.open();
        LoginPageTKT loginPageTKT = homePageTKT.clickLoginBtn();
        assertTrue(loginPageTKT.isLoginButtonPresent(),"Login Button Is Not Present");
        loginPageTKT.clickRestoreBtn();
        PasswordResetService passwordResetService = new PasswordResetService(getDriver());
        passwordResetService.PasswordReset();
    }
}
