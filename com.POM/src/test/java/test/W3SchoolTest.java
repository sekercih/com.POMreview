package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.pages.W3SchoolPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class W3SchoolTest {
    W3SchoolPage w3School=new W3SchoolPage();
    @Test
    public void schoolTest(){
       Driver.getDriver().get(ConfigurationReader.getProperty("W3"));


        Assert.assertTrue(w3School.html.isDisplayed());

        w3School.next.click();

        Assert.assertTrue(w3School.bordesr.isDisplayed());
        System.out.println("w3School.bordesr.getText() = " + w3School.bordesr.getText());
        Driver.closeDriver();
    }
}
