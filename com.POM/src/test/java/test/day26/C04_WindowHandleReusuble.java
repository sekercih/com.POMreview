package test.day26;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C04_WindowHandleReusuble {
    //todo
    // https://the-internet.herokuapp.com/windows sitesine gideli
    // Click Here butonuna tıklayalım
    // new taba geçip titlen "New Window" olduğunu test edelim
@Test
    public void test01(){
    Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
    String ilkHandle=Driver.getDriver().getWindowHandle();
    Driver.getDriver().findElement(By.xpath("//a[@target=\"_blank\"]")).click();
    Set<String> handles=Driver.getDriver().getWindowHandles();
    String ikinciHandle="";
    for (String each:handles) {
        if (!each.equals(ilkHandle)){
            ikinciHandle=each;
        }
    }
    Driver.getDriver().switchTo().window(ikinciHandle);
    //*   // new taba geçip titlen "New Window" olduğunu test edelim
    String expectedtitle="New Window";
    String actualtitle=Driver.getDriver().getTitle();
    System.out.println("actualtitle = " + actualtitle);
    Assert.assertEquals(actualtitle,expectedtitle);

}
@Test
    public void windowHandleReusuble() throws IOException {
    Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
    Driver.getDriver().findElement(By.xpath("//a[@target=\"_blank\"]")).click();

    String expected="The Internet";
    ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
    Assert.assertEquals(Driver.getDriver().getTitle(),expected);

    ReusableMethods.getScreenshot("WindowHandle");
    Driver.closeDriver();

}
@Test
    public void demoqa() throws IOException {
    Driver.getDriver().get("https://demoqa.com/browser-windows");
    Driver.getDriver().findElement(By.id("tabButton")).click();

    String ecpected="ToolsQA";
    ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
    Assert.assertEquals(Driver.getDriver().getTitle(),ecpected);

    ReusableMethods.getScreenshot("demoqa");
 //   Driver.closeDriver();

}

}
