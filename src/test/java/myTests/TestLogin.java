package myTests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import mypages.HomePg;
import mypages.LoginPg;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.mongodb.util.MyAsserts.assertTrue;

public class TestLogin extends AbstractTest {
    WebDriver webDriver;

    @Test()

    @MethodOwner(owner = "Gango")

    public void TestLogin(){
        HomePg homePg = new HomePg(getDriver());
        homePg.open();
        LoginPg loginPg = homePg.clickInternetTickets();
//        assertTrue(loginPg.isLoginButtonPresent(), "Login Button Is Not Present");
        loginPg.enterUserName("maria");
        loginPg.enterUserPassword("lala");


        loginPg.clickLogintBtn();
//        assertTrue(loginPg.isLoginButtonPresent(), "Login Button Is Not Present");
    }
}
