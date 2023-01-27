package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;


public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.setUsername("tomsmith");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect");
    }
}
