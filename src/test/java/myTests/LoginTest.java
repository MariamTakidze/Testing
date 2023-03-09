//package myTests;
//
//import com.qaprosoft.carina.core.foundation.AbstractTest;
//import laba.HomePage;
//import laba.LoginScreen;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
//
//import static com.mongodb.util.MyAsserts.assertTrue;
//
//public class LoginTest extends AbstractTest {
//    WebDriver webDriver;
//    @Test
//
//    public void LoginTest(){
//        HomePage homePage = new HomePage(getDriver());
//        homePage.open();
//        LoginScreen loginScreen = homePage.clickEntranceBtn();
//        assertTrue(loginScreen.isLoginBtnPresent(),"LoginBtn is not present");
//    }
//}
