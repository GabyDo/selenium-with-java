package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1() {
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTittle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");

    }
}
