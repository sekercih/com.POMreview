package test.smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.ConfigurationReader;
import utilities.Driver;

public class PositiveLoginTest01 {
    //1) com.GuiderSoftPOM altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()
    @Test
    public void positiveLoginTest(){
        //         https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage01 hotelMyCampPage=new HotelMyCampPage01();
        //        login butonuna bas
        hotelMyCampPage.IlkLoginLink.click();
        //test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        //test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.listOfUsers.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();

    }

}
