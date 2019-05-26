package selenium.test.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class  MenuElementPage {

    private WebDriver driver;

    public MenuElementPage(WebDriver driver) {
        this.driver = driver;
    }

        public void ButtonClick(){
        Actions builder = new Actions(driver);
        WebElement homeButton = driver.findElement(By.cssSelector(".example > ul:nth-child(7) > li:nth-child(1) > a:nth-child(1)"));
        builder.moveToElement(homeButton).click().build().perform();
        builder.click();}
}
