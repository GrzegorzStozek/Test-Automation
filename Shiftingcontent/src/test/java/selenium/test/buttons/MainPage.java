package selenium.test.buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "/html/body/div[2]/div/ul/li[38]/a")
    private WebElement contentLink;

    @FindBy(xpath = "/html/body/div[2]/div/div/a[1]")
    private WebElement menuElementLink;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickContentLink(){
    contentLink.click();}

    public void clickmenuElementLink(){
        menuElementLink.click();
    }
}
