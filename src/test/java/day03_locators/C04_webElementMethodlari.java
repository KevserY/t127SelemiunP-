package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_webElementMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));
        int expectedLinkSayisi = 147;
        int actulaLinkSayisi = linkElementleriList.size();

        if (expectedLinkSayisi == actulaLinkSayisi) {
            System.out.println("Link sayısı testi : PASSED"); /// -----> OK !
        } else {
            System.out.println("Link sayısı testi : FAILED");
            System.out.println("Actual Link Sayısı : " + actulaLinkSayisi);
        }

        //4- Products linkine tiklayin


        //5- special offer yazisinin gorundugunu test edin
        //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.quit();

    }
}
