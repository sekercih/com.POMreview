package test.crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_BasicAuthetications extends TestBaseCross {
    @Test
    public void authenticationTesti() {
        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        // driver.get("https://the-internet.herokuapp.com/basic_auth");
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //
        //  Html komutu : https://username:password@URL
        //  Username     : admin
        //  password      : admin
        //  basic authentication isteyen web servisleri bize nasil ve hangi bilgilerle authentication
        // yapabilecegimiz bilgisini de vermek zorundadir.
        // bi de bize tarif edilen yontem ve bize verilen bilgileri birebir uygulayarak
        // istedigimiz webservise giris saglayabiliriz
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //4- Basarili sekilde sayfaya girildigini dogrulayin
        WebElement congratMesajElementi = driver.findElement(By.tagName("p"));
        Assert.assertTrue(congratMesajElementi.isDisplayed());
    }
}
