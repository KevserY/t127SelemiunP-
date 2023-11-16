package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {
    public static void main(String[] args) throws InterruptedException {

        // testotomasyonu ana sayfasına gidin
        // URL 'ın https://testotomasyonu.com/ olduğunu
        // ve Title'ın "test" kelimesi içerdiğini test edin.

        // her test için mutlaka bir webdriver oluşturmalıyız
        // ve gerekli ayarlamaları yapmalıyız.
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // URL'ın  https://testotomasyonu.com/ olduğunu test edin
        String expectedUrl = "https://testotomasyonu.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("URL testi:  PASSED");
        } else {
            System.out.println("URL testi:  FAILED");
            System.out.println("Actual URL : " + actualUrl);//Actual URL : https://www.testotomasyonu.com/
            // driver'in gittiği URL'de en sonda / var.
        }


        // ve Title'ın test kelimesi içerdiğini test edin.
        String expectedTitleIcerigi = "Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerigi)) {
            System.out.println("Title testi:  PASSED"); //Title testi:  PASSED
        } else {
            System.out.println("Title testi:  FAILED");
            System.out.println("Actual Title : "+ actualTitle);

        }
        // Title test Failed
        //Actual Title : Otrixcommerce Website - Otrixcommerce

        Thread.sleep(3000);
        driver.quit();








    }
}
