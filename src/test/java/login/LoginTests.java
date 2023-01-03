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
        loginPage.setPassword("tomsmith");
        loginPage.setUsername("SuperSecretPassword");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area! x", "Alert text is incorrect");
    }
}
