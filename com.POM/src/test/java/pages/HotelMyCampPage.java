package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[text()=\"Log in\"]")
    public WebElement login;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement passsWord;

    @FindBy(id="btnSubmit")
    public WebElement loginSubmit;

    @FindBy(xpath = "//span[text()=\"Try again please\"]")
    public WebElement tryAgain;

    @FindBy (id = "divMessageResult")
    public WebElement resultMessage;

    @FindBy (xpath = "//*[text()=\"ListOfUsers\"]")
    public WebElement listOfUser;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy (xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy(className = "hidden-480")
    public WebElement addOtel;

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "IDGroup")
    public WebElement idGruop;

    @FindBy(id = "btnSubmit")
    public WebElement save;

    @FindBy(className = "bootbox-body")
    public WebElement hotelWas;

    @FindBy(xpath = "//button[text()=\"OK\"]")
    public WebElement okButton;



    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        login.click();
        userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        passsWord.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        loginSubmit.click();
    }

}
