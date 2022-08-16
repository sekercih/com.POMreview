package test.day26;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HotelMyCampPage;
import utilities.Driver;

public class C03_HotelMyCampPositiveLogin {
    @Test(groups = {"miniRegression","smoke"})
    public void positiveLogin() {
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //        https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");

        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.IlkLoginLink.click();
        //    test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager");
        //    test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButton.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.listOfUsers.isDisplayed());
    }
}
