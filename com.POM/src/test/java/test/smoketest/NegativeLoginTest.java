package test.smoketest;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.python.modules._locale._locale;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class NegativeLoginTest {


    //todo
    //  //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //        //3 Farkli test Methodunda 3 senaryoyu test et
    //        //                - yanlisSifre
    //        //                - yanlisKulllanici
    //        //                - yanlisSifre ve Kullanici
    //        //test data yanlis username: manager1 , yanlis password : manager1
    //        //2) https://www.hotelmycamp.com adresine git

    //*    //                - yanlisSifre
    @Test
    public void yanlısSifre(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage campPage=new HotelMyCampPage();
        campPage.login.click();
        campPage.userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        campPage.passsWord.sendKeys(ConfigurationReader.getProperty("HMCWrongPassword"));
        campPage.loginSubmit.click();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(campPage.tryAgain.isDisplayed());
        softAssert.assertAll();

Driver.closeDriver();

    }
    //* yanlisKulllanici
    @Test
    public void yanlisKulllanici(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage campPage=new HotelMyCampPage();
        campPage.login.click();
        campPage.userName.sendKeys(ConfigurationReader.getProperty("HMCWrongUserName"));
        campPage.passsWord.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        campPage.loginSubmit.click();
//*  Verilen seneryolarla ilgili giriş yapılamadının test kontrolu
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(campPage.resultMessage.isDisplayed());
        softAssert.assertAll();

        Driver.closeDriver();
    }
    //* yanlisSifre ve Kullanici
    @Test
    public void yanlisSifreveKullanici(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage campPage=new HotelMyCampPage();
        campPage.login.click();
        campPage.userName.sendKeys(ConfigurationReader.getProperty("HMCWrongUserName"));
        campPage.passsWord.sendKeys(ConfigurationReader.getProperty("HMCWrongPassword"));
        campPage.loginSubmit.click();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(campPage.resultMessage.isDisplayed(),"Kullanıcı isim ve şifrede sorun var");
        softAssert.assertAll();
        Driver.closeDriver();
    }

}
