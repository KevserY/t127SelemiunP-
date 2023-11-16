package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class C04_navigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu ana sayfaya gidin.
        driver.get("https://www.testotomasyonu.com");

        // Title'ın "otomasyon" içerdiğini test edin.
        String expectedTitleIcerik = "Otomasyon";
        String actualTitleIcerik = driver.getTitle(); //!!!!!!!!!!!!!!!

        if (actualTitleIcerik.contains(expectedTitleIcerik)) {
            System.out.println("Test PASSED"); // Test PASSED. OK!
        } else {
            System.out.println("Test FAILED");
        }

        // sonra wiseQuarter ana sayfaya gidin.
        driver.navigate().to("https://www.wisequarter.com");

        // URL 'ın wiseqyarter içerdiğini test edin.
        String expectedURL = "wisequarter";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        // tekrar testotomasyonu sayfasına dönün
        driver.navigate().back();

        // url'in otomasyon içerdiğini test edin
        expectedURL= "otomasyon";
        actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("Passed");
        } else {
            System.out.println("failed");
        }
        // sayfayı kapatın.
        Thread.sleep(2000);
        driver.quit();





    }
}
