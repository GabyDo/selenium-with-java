package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {
    public static final String localChromeDriverLocation = "/Users/dothigam/selenium-with-java/resources/chromedriver";
    public static final String googleUrl = "http://www.google.com";
    public static final String keyPressPageUrl = "https://formy-project.herokuapp.com/keypress";
    public static final String autoCompletePage = "https://formy-project.herokuapp.com/autocomplete";

    /**
     *  e = driver.findElement()
     *  element.sendKeys("Gam de thuong");
     *  e.submit();
     *  e.click();
     *
     *  Actions actions = new Actions(driver);
     *  actions.moveToElement(name);
     *  action.dragAndDrop(imagage)
     *
     * Alert alert = driver.switchTo().alert();
     *  alert.accept();
     *   driver.switchTo().window();
     *   driver.switchTo().frame();
     */
    public WebDriver getPage( String pageUrl) {
        System.setProperty("webdriver.chrome.driver", localChromeDriverLocation);
        WebDriver driver = new ChromeDriver();
        driver.get(pageUrl);
        return driver;
    }

    /***
     * Tạo chrome web driver là local chrome driver
     * Khởi tạo instance chromdriver
     * Vào trang google
     * Khai báo ô tìm kiếm với name:q
     * Lấy web element ra
     * Nhập từ khóa tìm kiếm
     * Submit từ khóa tìm kiếm
     * Đóng browser
     */

    @Test
    public void runGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", localChromeDriverLocation);
        WebDriver driver = new ChromeDriver();
        driver.get(googleUrl);
        By inputQuery = By.name("q");
        WebElement eInput = driver.findElement(inputQuery);
        eInput.sendKeys("Gam de thuong");
        eInput.submit();
        driver.quit();
    }

    @Test
    public void inputKeyAndMouse() {
        System.setProperty("webdriver.chrome.driver", localChromeDriverLocation);
        WebDriver driver = new ChromeDriver();
        driver.get(keyPressPageUrl);

        //input field
        WebElement input = driver.findElement(By.id("name"));
        input.click();
        input.sendKeys("aaaa");

        //button
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }

    @Test
    public void autoCompletePage() {
        WebDriver driver = getPage(autoCompletePage);
        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        driver.quit();

    }

    @Test
    public void scrollToElement() {
        String scrollUrl = "https://formy-project.herokuapp.com/scroll";
        WebDriver driver = getPage(scrollUrl);
        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("gam de thuong");

        driver.quit();
    }

    @Test
    public void alertSwitch() {
        String alertUrl = "https://formy-project.herokuapp.com/switch-window";
        WebDriver driver = getPage(alertUrl);

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }

    @Test
    public void switchToActiveWindow () {
        String activeWindowUrl = "https://formy-project.herokuapp.com/switch-window";
        WebDriver driver = getPage(activeWindowUrl);

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();
        for(String handle: driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        driver.switchTo().window(originalHandle);

        driver.close();
    }

//    @Test
//    public void executeJavascript() {
//        String modalPage = "https://formy-project.herokuapp.com/modal";
//        WebDriver driver = getPage(modalPage);
//
//
//
//    }

    @Test
    public void radioButtons () {
        String radioButtonUrl = "https://formy-project.herokuapp.com/radiobutton";
        WebDriver driver = getPage(radioButtonUrl);

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        ///html/body/div/div[3]/input

        driver.close();

    }
}
