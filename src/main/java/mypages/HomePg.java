package mypages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePg extends AbstractPage {
    @FindBy(xpath=" //*[@id=\"sideActionsWidget\"]/a[1]/span")

    private ExtendedWebElement internetTickets;

    public HomePg(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub

    }

    public LoginPg clickInternetTickets() {
        internetTickets.click();
        return new LoginPg(getDriver());
    }

}
