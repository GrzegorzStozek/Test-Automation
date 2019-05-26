package selenium.test.buttons;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TestStarter {

    private static WebDriver driver;

    public TestStarter() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver0240.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testStarter() {
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.clickContentLink();
        mainPage.clickmenuElementLink();
        MenuElementPage menuElementPage = new MenuElementPage(driver);
        menuElementPage.ButtonClick();
        String actualString = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
        assertTrue(actualString.contains("Welcome to the-internet"));
    }
    @After
    public void shutDown(){
       driver.quit();
    }
}