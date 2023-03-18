package mobile.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import mobile.mypages.common.ToDoListBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ToDoListTest extends AbstractTest {
    @Test
    public void addTask(){
        ToDoListBase toDoList = initPage(getDriver(), ToDoListBase.class);
            toDoList.isPlusBtnVisible();
            toDoList.clickPlusBtn();
            Assert.assertFalse(toDoList.isPlusBtnVisible());
            toDoList.enterTitleInput();
            toDoList.enterNoteInput();
            toDoList.chooseTag();
            toDoList.clickSaveBtn();






    }

}
