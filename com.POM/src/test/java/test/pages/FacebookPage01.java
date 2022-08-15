package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage01 {
    public FacebookPage01() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement girisButton;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement hataliGiris;
}
