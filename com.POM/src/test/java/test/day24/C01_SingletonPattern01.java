package test.day24;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_SingletonPattern01 {
    @Test
    public void test01(){
        Driver.getDriver().get("https://www.teknosa.com/");

        //singleton pattern bir class'tan birden fazla obje uretmesine
        //izin vermeyen bir pattern olarak kabul gormustur

        //biz Driver Class'ini driver uretmek uzere kullaniyoruz
        //ancak Driver Class'inda driver isminde bir instance variable da var
        //ve biz obje ureterek bu instance driver'a ulasabiliriz

        // Driver driver1 = new Driver();

        // Singleton pattern kabul gormus bir pattern'dir
        // amac bir Class'tan obje uretilmemesini saglamaktir
        // bunun icin Singleton pattern'de koruyacagimiz Class'ta p'siz bir constructor olusturur
        // ve bu constructor'u private yapmaktir

}}

