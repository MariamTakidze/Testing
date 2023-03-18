package mobile.mypages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ToDoListBase extends AbstractPage {
    public ToDoListBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickPlusBtn();
    public abstract void enterTitleInput();
    public abstract void enterNoteInput();
    public abstract void chooseTag();
    public abstract void clickSaveBtn();

    public abstract boolean isPlusBtnVisible();

}
