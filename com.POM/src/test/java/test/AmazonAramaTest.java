package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonAramaTest {
    AmazonPage amazonPage=new AmazonPage();

    @Test
    public void aramaTesti() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Thread.sleep(10000);
        amazonPage.aramaKutusu.sendKeys("ipad "+ Keys.ENTER);

        for (WebElement titleAll: amazonPage.aramaText  ) {
            System.out.println("titleAll.getText() = " + titleAll.getText());
        }


        amazonPage.ilkElement.click();

        String prodoctTitle=amazonPage.elementTitle.getText();

        Assert.assertTrue(prodoctTitle.contains("Apple"));

        System.out.println("amazonPage.image.getAttribute(\"class\") = " + amazonPage.image.getAttribute("class"));


    }
}
