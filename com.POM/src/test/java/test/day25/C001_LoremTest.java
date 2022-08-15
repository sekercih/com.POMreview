package test.day25;

import com.github.javafaker.Faker;
import com.github.javafaker.Lorem;
import org.testng.annotations.Test;

public class C001_LoremTest {
    Faker faker;
    @Test
    public void lorem(){
    faker=new Faker();
        System.out.println("faker.lorem().paragraph() = " + faker.lorem().paragraph());
    }
    @Test
    public void deneme(){
        faker=new Faker();
        System.out.println(faker.shakespeare().hamletQuote());
    }
    @Test
    public void test01(){
        faker=new Faker();
        System.out.println("faker.shakespeare().asYouLikeItQuote() = " + faker.shakespeare().asYouLikeItQuote());
    }
}
