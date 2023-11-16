package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_manageMethodleri {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // SAYFANIN AÇILMASINI 10 SN BEKLER.
        /*
        Wait konusunu ileride daha detaylı anlatacağız.
        implicitlyWait methodu sayfanın yüklenmesi ve/veya
        arayacağımız web elementleri bulmak için dinamıik olarak
        tanımlanmış maximum bekleme süresidir.

        Asıl amaç bekleme değil, görevi yapmaktır.
        10 saniye ara ve 10 sn sonunda aramayı bitir.

        burada tanımlanan süre görevi yapamaya çabalayacağı max süredir.
        bu süre içinde görevi yapamazsa Exception fırlatır.
        Her bir görev için ayrı ayrı 10 sn bekler.
        */

        System.out.println("ilk baştaki konum: "+ driver.manage().window().getPosition());// (9, 9)
        System.out.println("ilk baştaki size: " +driver.manage().window().getSize());//(1051, 894)
        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("maximize konum: "+ driver.manage().window().getPosition());// (-8, -8)
        System.out.println("maximize size: " +driver.manage().window().getSize());// (1552, 928)
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum : "+ driver.manage().window().getPosition());//(0, 0)
        System.out.println("Fulscreen size: " +driver.manage().window().getSize());//  (1536, 960)
        Thread.sleep(2000);

        // pencereyi başlangıç noktası (50, 100) ve size (1000, 700) yapın:
        driver.manage().window().setSize(new Dimension(1000,700));
        driver.manage().window().setPosition(new Point(50,100));

        System.out.println("özel konum : "+ driver.manage().window().getPosition());//(49, 100)
        System.out.println("özel size: " +driver.manage().window().getSize());//  (1003, 703) en yakın değerleri yaptık.

        System.out.println(driver.manage().window().getSize().getWidth()); // 1003. özel olarak sadece genişlik de yapabiliriz.

        Thread.sleep(2000);
        driver.quit();


    }
}
