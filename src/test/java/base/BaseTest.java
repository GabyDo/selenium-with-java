package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        goHome();

//        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());

        //find elements: input
//       WebElement inputLink =  driver.findElement(By.linkText("Inputs"));
//       inputLink.click();
       //list of element: <a href="/inputs">Inputs</a> a is tag
//        List<WebElement> links = driver.findElements(By.tagName("a"));

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
