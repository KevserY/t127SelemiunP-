package PRACTICE.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_test {
    public static void main(String[] args) throws InterruptedException {
        /*
            ...Exercise...
            Navigate to  https://testpages.herokuapp.com/styled/index.html
            Click on  Calculater under Micro Apps
            Type any number in the first input
            Type any number in the second input
            Click on Calculate
            Get the result
            Print the result                      */

        System.setProperty("webdriver.chrome.drive","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(1000);

        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //driver.findElement(By.xpath("//a[@id='calculatetest']"));

        //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("100");
        //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("50");

        //Click on Calculate
        driver.findElement(By.id("calculate")).click();

        //Get the result
        WebElement answer = driver.findElement(By.id("answer"));// web elemente atama yaparak yaptık."answer adında bir objeye atadık."

        //Print the result
        System.out.println("Sonuç: " + answer.getText()); // sonucu yazı olarak almak için getText() le yazdırmalıyız.
        // Sonuç: 130

        driver.quit();
       /*
       git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/KevserY/t127SelemiunP-.git
git push -u origin main
        */

    }
}
