package item;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by farhana rashid on 5/15/2016.
 */
public class commonAPI {
    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void signup (String locator)
    {
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void loginusername(String locator, String value)
    {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void loginpassword(String locator, String value){driver.findElement(By.cssSelector(locator)).sendKeys(value);}

    public void presssignup (String locator){driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);}
}
