package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) {
        //        1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //        2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //        3- Category bolumundeki elementleri locate edin
        List<WebElement> kategoriElementleriList = driver.findElements(By.className("panel-title"));

        //        4- Category bolumunde 3 element oldugunu test edin
        int expectedKategoriSayisi = 3;
        int actualKategeriSayisi = kategoriElementleriList.size();

        if (expectedKategoriSayisi == actualKategeriSayisi) {
            System.out.println("Kategori sayıs testi PASSED"); // Kategori sayıs testi PASSED
        } else {
            System.out.println("FAILED");
        }

        //        5- Category isimlerini yazdirin
        System.out.println(ReusableMethods.stringListeDonustur(kategoriElementleriList));
        // [WOMEN, MEN, KIDS]

        //        6- Sayfayi kapatin

        driver.quit();
    }
}
