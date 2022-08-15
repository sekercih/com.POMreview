package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HotelMyCampWebTablePage01 {
    public HotelMyCampWebTablePage01(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElement;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satırlarList;


    public WebElement satirGetir(int satirNo){
        String satirDinamikXpath="//tbody//tr["+satirNo+"]";
        WebElement satirElement=Driver.getDriver().findElement(By.xpath(satirDinamikXpath));
        return satirElement;
    }


    public WebElement hucreWebelementGetir(int satir, int hucre) {
        String hucreDinamikXpath="//tbody//tr["+satir+"]//td["+hucre+"]";
        WebElement hucreElement=Driver.getDriver().findElement(By.xpath(hucreDinamikXpath));
        return hucreElement;
    }

    public void sutunYazdır(int sutun) {
        //her satırdaki istenen sütun elementini yazdırabilmek için önce satır sayısı bilmem gerekir
        int satirSayisi=satırlarList.size();
        for (int i=1;i<=satirSayisi;i++){
            System.out.println(i+". satır : "+hucreWebelementGetir(i, sutun).getText());
        }
    }
}
