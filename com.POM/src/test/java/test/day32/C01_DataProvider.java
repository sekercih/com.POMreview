package test.day32;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C01_DataProvider {
    @DataProvider
    public static Object[][] arananlarListesi() {
        String aranacaklar[][]={{"Arrow"},{"Java"},{"Flutter"},{"Appium"}};

        return aranacaklar;
    }

    //todo
    //!Arrow Java Flutter Appium
    @Test(dataProvider = "arananlarListesi")
    public void amazonSearch(String aranacaklar){
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonUrl"));
        AmazonPage page=new AmazonPage();
        page.aramaKutusu.sendKeys(aranacaklar, Keys.ENTER);
        Assert.assertTrue(page.sonucText.getText().contains(aranacaklar));

    }
}
