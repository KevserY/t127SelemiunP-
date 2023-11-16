package PRACTICE.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_driverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        //driver.manage().window().fullscreen(); // menüleri de gizleyerek tüm ekranı kaplar.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Thread.sleep(2000);
        driver.quit();


    }
}
