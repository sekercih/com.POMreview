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
}
