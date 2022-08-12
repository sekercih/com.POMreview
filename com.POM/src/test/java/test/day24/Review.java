package test.day24;

public class Review {
    //todo
    //* POM Page Objeckt Model =Herkes tarafından kabul görmüş bir freamwor dizayn patterndir.
    //* Temel Amaç Nedir?
    //*İşleri kolaylaştırmak
    //*Tekrar eden kodlardan kurtulduk,
    //* Faydalı resuble methotlar oluşturup oradan kullanmaya başladık.
    //* Test datalarını tek merkezden kontol ediyoruz.
    //* Sonradan projeye katılanlar freamworku rahatlıkla anlayabilir.
    //* Dinamik methotlarla projemizi oluşturuyoruz.
    //! **************************************************
    //? Bazı temel klaslarımız vardır.
    //*1. Locate ve resuble methotları koyduğumuz Pages classı
    //*2. Driver çağırdığımız statik olan Driver classı,statik methotlarla oluşturduğumuz browserlar vardır.Bunları bağımlı olmaktan kurtulduk
    //*getDriver(),closeDriver(),Singleton pattern uygun olarak düzenliyoruz.
    //*Singleton desgin pattern çalışma zamanında yalnızca 1 object yaratılmasını garanti eden tasarım desenidir.
    //
    //*Kullanımına ihtiyaç duyulan durum şudur :
    //*Birden çok sınıfın aynı instance’ı kullanması gerekmektedir.
    //*Tüm uygulama için yalnızca bir nesne olması gerekmektedir.
    //*Sadece bir nesne olduğu (unique) garanti edilmelidir.
    //*Bu gereklilikler için bir sınıf yaratırız ve sınıfın kendi instance’ını yönetmesini sağlarız.
    //*Önemli nokta : Bir sınıfın yalnızca bir instance’ının bulunduğundan emin olmalıyız ve buna global erişim noktası sağlamalıyız.
    //*3 Configiration.propertis test datalarımızı tuttuğumuz yer,burası key,value şeklinde ikiliden oluşur.
    //*Kesinlikle mutlak suretle keyler unıqe.
    //*Configirationreader class da .properties uzantılı file çalıştırır,bizi yazdığımız key value ilişkisindeki .properties dosyasını yönetir.

}
