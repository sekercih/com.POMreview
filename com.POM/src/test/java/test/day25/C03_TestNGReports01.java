package test.day25;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor01;

import java.io.IOException;

public class C03_TestNGReports01 extends TestBaseRapor01 {

        @Test
        public void windowHandleReusable() throws IOException {
        extentTest=extentReports.createTest("window handle","title ile 2. sayfaya geçiş yapıldı");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasına gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yeni wimdow linkine tıklandı");

        String expectedTitle = "The Internet";
        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
        extentTest.info("reusable method kullanarak 2. sayfaya geçildi");
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
        extentTest.pass("title ın beklenen değerle aynı olduğu test edildi");

        ReusableMethods.getScreenshot("WindowSwitch");


    }
    }

