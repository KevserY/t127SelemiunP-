package PRACTICE.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();


    }
}
