package myservices;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.db.models.TktUser;
import mypages.PasswordReset;
import org.openqa.selenium.WebDriver;

import static com.mongodb.util.MyAsserts.assertTrue;

public class PasswordResetService extends AbstractPage {
    TktUser tktUser = new TktUser();
    public PasswordResetService(WebDriver driver) {
        super(driver);
    }
    public void PasswordReset(){
        PasswordReset passwordReset = new PasswordReset(getDriver());
        passwordReset.enterUserEmail(tktUser.getEmail());
        assertTrue(passwordReset.isPasswordResetButtonPresent(),"Password reset Button Is Not Present");
        passwordReset.clickPasswordResetBtn();

    }
}
