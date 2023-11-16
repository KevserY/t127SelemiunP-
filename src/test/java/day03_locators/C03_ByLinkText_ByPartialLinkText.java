package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText_ByPartialLinkText {
    public static void main(String[] args) {
        // gerekli ayarlamaları yapın
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu.com sayfasına gidin
        driver.get("https://testotomasyonu.com");

        // shoe linkine tıklayın
        //driver.findElement(By.linkText("Shoes")).click();
        //driver.findElement(By.linkText("hoes")).click();

        // eğer **By.linkText** ile arama yapıyorsak,
        // text'i birebir aynısını yazmalıyız. (boşluk, karakter vs. herşeyiyle)

        WebElement shoesLinki = driver.findElement(By.partialLinkText("hoes"));
        shoesLinki.click();

        // By.partialLinkText --kullanıldığında link üzerindeki yazının
        // tamamına ihtiyaç yoktur.
        // Yazının, istediğimiz web elementi unique olarak bulabileceğimiz
        // herhangi bir parçasını kullanmamız yeterli.

        //açılan sayfada Title'ın "shoe" içerdiğini test edin
        String expectedTitleicerik = "Shoes";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleicerik)) {
            System.out.println("PASSED"); //  -----> OK!
        } else {
            System.out.println("FAILED");
        }

        // shoes linkinin bu sayfada da erişilebillir olduğunu test edin.

        /*
                Bir web elementi locate ettikten sonra
                sayfayı yenileme veya yeni bir sayfaya gitme gibi işlemler yaparsak
                driver daha önceden yaptıgımız locate'leri KULLANAMAYABİLİR
                ve bize "StaleElementReferenceException" verir

                bu durumda locate ve elemente kayıt işlemin yanıden yapmalıyız.
         */

       shoesLinki = driver.findElement(By.partialLinkText("hoes"));
        if (shoesLinki.isEnabled()) { // StaleElementReferenceException
            System.out.println("Shoes Linki erişim testi : Passed");
        } else {
            System.out.println("Shoes Linki erişim testi : FAILED");
        }

        // OK! passed

        driver.quit();
    }
}
