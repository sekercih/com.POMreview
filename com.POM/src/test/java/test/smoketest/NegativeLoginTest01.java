package test.smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.ConfigurationReader;
import utilities.Driver;

public class NegativeLoginTest01 {

    @Test
    public void yanlisSifre(){
        //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
        //3 Farkli test Methodunda 3 senaryoyu test et
        //                - yanlisSifre
        //                - yanlisKulllanici
        //                - yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage01 hotelMyCampPage=new HotelMyCampPage01();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigurationReader.getProperty("HMCWrongPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }
    @Test
    public void yanlisKulllanici(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage01 hotelMyCampPage=new HotelMyCampPage01();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigurationReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }
    @Test
    public void yanlisSifreKullanici(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage01 hotelMyCampPage=new HotelMyCampPage01();
        hotelMyCampPage.IlkLoginLink.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigurationReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigurationReader.getProperty("HMCWrongPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
    }

}
