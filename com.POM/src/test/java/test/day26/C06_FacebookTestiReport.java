package test.day26;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C06_FacebookTestiReport extends TestBaseRapor {
    @Test()
    public void facebookTest() {
        extentTest=extentReports.createTest("Facebook","Fake isimle girişin test edilmesi");
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://facebook.com");
        extentTest.info("facebook sayfasına gidildi");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker = new Faker();
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        facebookPage.girisButton.click();
        extentTest.info("facebook giriş bilgileri faker ile dolduruldu");
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.hataliGiris.isDisplayed());
        extentTest.pass("girilemediği test edildi.");
        Driver.closeDriver();

    }
}
