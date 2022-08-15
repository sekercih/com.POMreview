package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import test.pages.FacebookPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Locale;

public class FacebookTest {
    FacebookPage fas=new FacebookPage();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        fas.create.click();
        Actions actions=new Actions(Driver.getDriver());
        Select select=new Select(fas.day);
        Select select1=new Select(fas.month);
        Select select2=new Select(fas.year);

        Faker faker=new Faker(new Locale("en"));
        String email=faker.internet().emailAddress();

fas.isim.sendKeys(faker.name().name(), Keys.TAB);
actions.sendKeys(faker.name().lastName(),Keys.TAB).
        sendKeys(email,Keys.TAB).sendKeys(email,Keys.TAB).
        sendKeys(faker.internet().password(),Keys.TAB,Keys.TAB).perform();
select.selectByValue("21");
select1.selectByValue("10");
select2.selectByValue("1983");
 fas.female.click();
fas.sign.click();



    }
}
