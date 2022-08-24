package test.day32;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C01_DataProvider01 {
    @DataProvider
    public static Object[][] aranacakKelimeListesi() {
        String aranacaklar[][]={{"Alexa"},{"Java"},{"Arrow"}};
        return aranacaklar;
    }
//! ilk önce burası anlatılacak...

    @Test(dataProvider = "aranacakKelimeListesi")
    public void amazonSearch(String aranacaklar) {
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacaklar+ Keys.ENTER);
        //*amazonPage.aramaKutusu.sendKeys("Alexa"+ Keys.ENTER);

        Assert.assertTrue(amazonPage.sonucText.getText().contains(aranacaklar));
       //* Assert.assertTrue(amazonPage.sonucText.getText().contains("Alexa"));
        Driver.closeDriver();
    }
}
