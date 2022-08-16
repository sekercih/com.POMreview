package test.day26;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C05_TestNGReports extends TestBaseRapor {

    @Test
    public void windowHandleReusuble() throws IOException {
        extentTest = extentReports.createTest("window Handle", "title ile  2. ssayfaya geçiş");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasına gidildi");
        Driver.getDriver().findElement(By.xpath("//a[@target=\"_blank\"]")).click();
        extentTest.info("Click Here Butonuna tıklandı");

        String expected = "The Internet1";
        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
        extentTest.info("Reusuble Methot kullanılarak 2.sayfaya geçildi");
        Assert.assertEquals(Driver.getDriver().getTitle(), expected);
         extentTest.pass("Titlen beklenen değer ile aynı olduğu test edildi.");

        ReusableMethods.getScreenshot("WindowHandle");

    }
}