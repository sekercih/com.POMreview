package test.day24;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C03__E2ETesting {
    //todo
    //*Tests packagenin altına class olusturun: CreateHotel
    //*Bir metod olusturun: createHotel
    //*https://www.hotelmycamp.com adresine git.
    //*Username textbox ve password metin kutularını locate edin ve asagidaki verileri
    //*Username : manager
    //*Password : Manager1!
    //*Login butonuna tıklayın.
    //*Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //*Açılan sayfadaki tum metin kutularına istediğiniz verileri girin.
    //*Save butonuna tıklayın.
    //*Hotel was inserted successfully” textinin görunduğunu test edin.
    //*OK butonuna tıklayın.

    @Test
    public void createHotel() {
        HotelMyCampPage page = new HotelMyCampPage();
        page.login();
        page.bekle(4);
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        page.hotelManagement.click();
        page.hotelList.click();
        page.addOtel.click();
        actions.click(page.code).sendKeys(faker.code().isbn10(), Keys.TAB)
                .sendKeys(faker.name().fullName(), Keys.TAB).
                sendKeys(faker.address().fullAddress(), Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber(), Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();
        Select select = new Select(page.idGruop);
        select.selectByIndex(2);
        page.save.click();

        //* hotel Was görünürlüğünü test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(page.hotelWas.getText(), "Hotel was inserted successfully", "Yazı aynı değildir");

        page.okButton.click();

        Driver.closeDriver();

    }


}
