package myservices;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.db.models.TktUser;
import mypages.LoginPageTKT;
import org.openqa.selenium.WebDriver;

import static com.mongodb.util.MyAsserts.assertTrue;

public class LoginService extends AbstractPage {
    TktUser tktUser = new TktUser();

    public LoginService(WebDriver driver) {
        super(driver);
    }

    public void Login(){
        LoginPageTKT loginPageTKT = new LoginPageTKT(getDriver());
        loginPageTKT.enterUserEmail(tktUser.getEmail());
        loginPageTKT.enterUserPassword(tktUser.getPassword());
        loginPageTKT.clickLogintBtn();
//        assertTrue(loginPageTKT.isLoginButtonPresent(),"Login Button Is Not Present");
    }
}
