package test.day24;

import org.testng.annotations.Test;

public class C01_SingletonPattern01 {
    @Test
    public void test01(){

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

