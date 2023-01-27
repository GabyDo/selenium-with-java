package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption() {
       var dropDownPage =  homePage.clickDropDown();
       String option = "Option 1";
       dropDownPage.selectFromDropDown(option);
       var selectOptions =  dropDownPage.getSelectedOption();
       assertEquals(selectOptions.size(), 1, "incorrect number of option");
       assertTrue(selectOptions.contains(option), "option not select");
    }
}
