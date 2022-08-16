package test.day26;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C04_WindowHandleReusuble01 {
    @Test
    public void test01(){
        // https://the-internet.herokuapp.com/windows adresine gidelim
        // new tab butonuna basalim
        // new tab'a gecip title'inin "New Window" oldugunu test edin
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> handleSeti=Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle="";
        for (String each : handleSeti
        ) {
            if (!each.equals(ilkSayfaWindowHandle)){
                ikinciSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle"+ actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public void windowHandleReusable() throws IOException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();


        String expectedTitle = "The Internet";

        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();

    }
}
