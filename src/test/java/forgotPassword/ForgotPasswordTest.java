package forgotPassword;

import base.BaseTest;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public  void testForgotPasswordPage() {
        var forgetPasswordPage = homePage.clickForgotPassword();
        String email = "abc@gmail.com";
        forgetPasswordPage.retrievePassword(email);
 //       AssertTrue();
    }


}
