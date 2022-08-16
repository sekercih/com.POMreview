package test.day25;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelMyCampWebTablePage01;

import java.util.List;

public class C01_WebTable01 {
    HotelMyCampPage hotelMyCampPage;
    HotelMyCampWebTablePage01 hotelMyCampWebTablePage;
    @Test
    public void login(){
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.login();
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!

    }
    @Test
    public void table() {
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        hotelMyCampWebTablePage=new HotelMyCampWebTablePage01();
        List<WebElement> headerDataList = hotelMyCampWebTablePage.headerBirinciSatirDatalar;
        System.out.println("Tablodaki sütun sayısı : "+headerDataList.size());

        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        System.out.println(hotelMyCampWebTablePage.tumBodyWebElement.getText());

    }
    @Test(dependsOnMethods = "login")
    public void printRows() {

        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        hotelMyCampWebTablePage=new HotelMyCampWebTablePage01();
        System.out.println(hotelMyCampWebTablePage.satırlarList.size());
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        hotelMyCampWebTablePage.satırlarList.stream().forEach(t-> System.out.println("eleman : "+t.getText()));
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
        hotelMyCampWebTablePage.satırlarList.stream().limit(4).skip(3).forEach(t-> System.out.println(t.getText()));

    }
}
