package myservices;

import com.qaprosoft.carina.core.gui.AbstractPage;
import mypages.HomePageTKT;
import mypages.LoginPageTKT;
import org.openqa.selenium.WebDriver;

import static com.mongodb.util.MyAsserts.assertTrue;

public class OpenModalService extends AbstractPage {
    public OpenModalService(WebDriver driver) {
        super(driver);
    }
    public void openModal(){
        HomePageTKT homePageTKT = new HomePageTKT(getDriver());
        homePageTKT.open();
        LoginPageTKT loginPageTKT = homePageTKT.clickLoginBtn();
        assertTrue(loginPageTKT.isLoginButtonPresent(),"Login Button Is Not Present");
    }

}
