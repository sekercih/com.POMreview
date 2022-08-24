package test.day32;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;

import utilities.ConfigurationReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTest01 {

    @DataProvider
    public static Object[][] wrongUserList() {
        String liste[][]={{"manager11user","manager11pass"},{"manager12user","manager12pass"},{"manager13user","manager13pass"}};
        return liste;
    }

    @Test(dataProvider = "wrongUserList")
    public void yanlisSifreKullanici(String wrongUserName,String wrongUserPassword) {
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login.click();
        hotelMyCampPage.userName.sendKeys(wrongUserName);
        hotelMyCampPage.passsWord.sendKeys(wrongUserPassword);
        //! hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty(wrongUserName));
        //! hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty(wrongUserPassword));
        //3) Login butonuna bas
        hotelMyCampPage.loginButton.click();
        //4) Verilen senaryolar ile giris yapilamadigini test e
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.tryAgain.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
