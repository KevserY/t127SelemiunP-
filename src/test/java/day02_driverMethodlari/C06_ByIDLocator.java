package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ByIDLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // GÖREV: testotomasyonu.com adresine gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazıp, arattırın.


        // bir web elementi kullanmak istiyorsak
        // öncelikle driver'a o elementi buldurup,
        // kullanabileceğimiz bir obje olarak kaydetmeliyiz.

        WebElement aramaKutusu = driver.findElement(By.id("global-search")); // java önce eşitliğin sağını yapıp, sonra eşitliğin sol tarafa atama yapacak.

        aramaKutusu.sendKeys("phone"); // aranaKutusuna bunu yaz
        Thread.sleep(2000);

        aramaKutusu.submit();

        // bulunan sonuç sayısını yazdırın: "product-count-text"
        WebElement sonucYaziElementi = driver.findElement(By.className("product-count-text"));

        // System.out.println(sonucYaziElementi);
        // WebElement, direk yazdırılamaz.referansını yazdırır.
        // eğer webElement üzerindeki yazıyı elde etmek istersek:
        System.out.println(sonucYaziElementi.getText()); // ---->4 Products Found


        // arama sonucunda ürün bulunabildiğini test edin:
        String sonucSayisiStr = sonucYaziElementi.getText().replaceAll("\\D","");

        int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiInt > 0) {
            System.out.println("Arama testi Passed"); //--->Arama testi Passed
        } else {
            System.out.println("Arama testi Failed");
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
