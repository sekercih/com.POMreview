package test.day25;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FacebookPage;
import utilities.Driver;

public class C02_FacebookTest {
    @Test(groups = "miniRegression")
    public void facebookTest() {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://facebook.com");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker = new Faker();
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        facebookPage.girisButton.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.hataliGiris.isDisplayed());
        Driver.closeDriver();

    }
}
