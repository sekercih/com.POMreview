package test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage01;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C01_FacebookTest01 {

    @Test()
    public void facebookTest() {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        FacebookPage01 facebookPage=new FacebookPage01();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        facebookPage.girisButton.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.hataliGiris.isDisplayed());
        Driver.closeDriver();

    }
}
