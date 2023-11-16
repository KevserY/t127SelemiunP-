package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_getMothodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // burada boş bir kopya browser oluşturuyor.
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");


        driver.get("https://www.wisequarter.com");


        //driver.get("www.youtube.com");
        //driver.get(); https:// yazılmadan çalışmaz

        driver.get("https://youtube.com");
        // www yazmasak da çalışır

        driver.quit();





    }
}
