package test.smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import test.pages.HotelMyCampPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PositiveLoginTest {
    HotelMyCampPage page=new HotelMyCampPage();
    //todo
    //   //1) com.GuiderSoftPOM altinda bir package olustur : smoketest
    //    //2) Bir Class olustur : PositiveTest
    //    //3) Bir test method olustur positiveLoginTest()

    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        //* sayfaya login olalım

        page.login.click();

        //*geçerli test datası olan username girelim
        page.userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));

        //* geçerli test datası olan password girlim
        page.passsWord.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));

        //* login işlemini yapalım
        page.loginSubmit.click();

        //*Syafaya login olduğumuzu doğrulayalım
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.listOfUser.isDisplayed());
        softAssert.assertAll();

        Driver.closeDriver();



    }
}
