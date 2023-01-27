package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver webDriver;
    public By emailField = By.id("email");
    public By retrievePwButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setEmailField( String email) {
        webDriver.findElement(emailField).sendKeys(email);
    }

    public void clickRetrievePasswordButton() {
        webDriver.findElement(retrievePwButton).click();
    }

    public void retrievePassword(String email) {
        setEmailField(email);
         clickRetrievePasswordButton();
    }

}
