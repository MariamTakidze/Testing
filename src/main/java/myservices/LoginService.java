package myservices;

import com.qaprosoft.carina.core.gui.AbstractPage;
import mypages.LoginPageTKT;
import org.openqa.selenium.WebDriver;

import static com.mongodb.util.MyAsserts.assertTrue;

public class LoginService extends AbstractPage {
    public LoginService(WebDriver driver) {
        super(driver);
    }

    public void Login(){
        LoginPageTKT loginPageTKT = new LoginPageTKT(getDriver());
        loginPageTKT.enterUserEmail("maregango18@gmail.com");
        loginPageTKT.enterUserPassword("Gango27");
        loginPageTKT.clickLogintBtn();
        assertTrue(loginPageTKT.isLoginButtonPresent(),"Login Button Is Not Present");
    }
}
