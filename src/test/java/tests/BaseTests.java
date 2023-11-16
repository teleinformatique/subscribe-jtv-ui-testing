package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.SubcribePage;

public class BaseTests {
    protected WebDriver driver;
    protected SubcribePage subcribePage;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void loadPage(){
        driver.get("https://subscribe.jawwy.tv/ma-en");
        subcribePage = new SubcribePage(driver);
    }
}
