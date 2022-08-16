package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
   public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[text()=\"Create New Account\"]")
    public WebElement create;

    @FindBy(name = "firstname")
    public WebElement isim;

    @FindBy(id = "day")
    public WebElement day;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//*[text()=\"Female\"]")
    public WebElement female;

   @FindBy(xpath = "(//*[text()=\"Sign Up\"])[3]")
    public WebElement sign;
 @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
 public WebElement emailBox;
 @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
 public WebElement passwordBox;
 @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
 public WebElement girisButton;
 @FindBy(xpath = "//div[@class='_9ay7']")
 public WebElement hataliGiris;
}
