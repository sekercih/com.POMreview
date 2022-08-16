package test.day24;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AmazonPage;
import utilities.Driver;

public class C01_PageIlkClass {

    //Driver class ı için static kullanılır
    //Page class ı için obje kullanılması tercih edilmiştir
    @Test()
    public void test01(){
        //amazon a gidelim
        Driver.getDriver().get("https://amazon.com");
        //arama kutusuna Nutella yazıp aratalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //arama sonuçlarının Nutella içerdiğini test edelim
        String actualText=amazonPage.sonucText.getText();
        Assert.assertTrue(actualText.contains("Nutella"));
        Driver.closeDriver();

    }
    @Test(groups ={"miniRegression","smoke"} )
    public void test02(){
        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");
        //java için arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        //sonucun java içerdiğini test edelim
        amazonPage.aramaKutusu.sendKeys("selenium"+Keys.ENTER);
        String actualText=amazonPage.sonucText.getText();
        Assert.assertTrue(actualText.contains("selenium"));
        Driver.closeDriver();
    }
}
