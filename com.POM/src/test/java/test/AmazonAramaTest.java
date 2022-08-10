package test;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonAramaTest {
    AmazonPage amazonPage=new AmazonPage();

    @Test
    public void aramaTesti(){
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("ipad"+ Keys.ENTER);


    }
}
