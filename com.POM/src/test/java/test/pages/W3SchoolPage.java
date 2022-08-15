package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class W3SchoolPage {
    public W3SchoolPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h1)[1]")
    public WebElement html;

    @FindBy(xpath = "//*[@id='main']/div[2]/a[2]")
    public WebElement next;

    @FindBy(tagName = "h1")
    public WebElement bordesr;



}
