package day01_seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebdriverOlusturma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        // bu satır oluşturacağımız webdriver'ın özelliklerini set ediyor.
        // webdriver otomasyon sırasında bizim elimiz, gözümüz herşeyimiz.

        WebDriver driver = new ChromeDriver();
        // driver objesi oluşturdu

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(3000);
        driver.manage().window().maximize();// tam sayfa yapmak için selenium'un gerekli methodları :)

        Thread.sleep(5000);

        // driver.close();

        driver.quit();
        // Arkadaslar son guncelleme sonrası testler bitmiyor calısmaya devam ediyor,
        // bu yuzden testimizin sonuna driver.quit(); diyerek driver'i kapatalım sorun cozulecektir.


    }
}
