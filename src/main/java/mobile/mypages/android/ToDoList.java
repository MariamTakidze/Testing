package mobile.mypages.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import mobile.mypages.common.ToDoListBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ToDoListBase.class)
public class ToDoList extends ToDoListBase{
    @FindBy(id="com.jeffprod.todo:id/fab")
    private ExtendedWebElement plusBtn;
    @FindBy(id="com.jeffprod.todo:id/editTextTitre")
    private ExtendedWebElement titleInput;
    @FindBy(id="com.jeffprod.todo:id/editTextNote")
    private ExtendedWebElement noteInput;
    @FindBy(id="com.jeffprod.todo:id/editTextTag")
    private ExtendedWebElement tag;
    @FindBy(id="com.jeffprod.todo:id/action_save")
    private ExtendedWebElement saveBtn;

    public ToDoList(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickPlusBtn() {
        plusBtn.click();

    }

    @Override
    public void enterTitleInput() {
        titleInput.click();
        titleInput.type("java");

    }

    @Override
    public void enterNoteInput() {
        noteInput.type("prepare for the exam");
    }

    @Override
    public void chooseTag() {
        tag.type("private");
    }

    @Override
    public void clickSaveBtn() {
        saveBtn.click();

    }


    @Override
    public boolean isPlusBtnVisible() {
        return plusBtn.isVisible();
    }

}
