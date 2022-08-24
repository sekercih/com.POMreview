package test.day32;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTest {
    @DataProvider
    public static Object[][] wrongTest() {
        String liste[][]={{"manager1user","manager1password"},{"manager2user","manager2user"},{"manager2user","manager2password"}};
        return liste;
    }

    @Test(dataProvider = "wrongTest")
    public void yanlisKulllanici(String user,String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCUrl"));
        HotelMyCampPage campPage=new HotelMyCampPage();
        campPage.login.click();
        //! hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty(manager2user));
        //! hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty(manager2pass));
        campPage.userName.sendKeys(user);
        campPage.passsWord.sendKeys(password);
        campPage.loginSubmit.click();
//*  Verilen seneryolarla ilgili giriş yapılamadının test kontrolu
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(campPage.resultMessage.isDisplayed());
        softAssert.assertAll();

          Driver.closeDriver();
    }
}
