//package myTests;
//
import com.qaprosoft.carina.core.foundation.AbstractTest;
import laba.HomePage;
import laba.LoginScreen;
import mypages.HomePageTKT;
import mypages.LoginPageTKT;
import myservices.LoginService;
import myservices.OpenModalService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.mongodb.util.MyAsserts.assertTrue;

public class LoginTest extends AbstractTest {
    WebDriver webDriver;
    @Test

    public void LoginTest(){
//        OpenModalService openModalService = new OpenModalService(getDriver());
//        openModalService.open();
//
        HomePageTKT homePageTKT = new HomePageTKT(getDriver());
        homePageTKT.open();
        LoginPageTKT loginPageTKT = homePageTKT.clickLoginBtn();
        assertTrue(loginPageTKT.isLoginButtonPresent(),"Login Button Is Not Present");
        LoginService loginService = new LoginService(getDriver());
        loginService.Login();

    }

    //java -jar selenium-server-4.8.1.jar standalone
}
