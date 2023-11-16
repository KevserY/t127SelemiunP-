package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethodları {
    public static void main(String[] args) throws InterruptedException {
        /*
            Selenium, 4.12 versiyonu ile
            kendi webdriver'ını da oluşturabiliyor.

            Yani artık dışarıdan bir webdriver tanımlama
            mecburiyeti kalmadı.

            ANCAK !! şirketlerin pek çoğu,
            kendilerine özel olarak satın aldıkları
            webdriver'ları kullanabiliyor.

            Webdriver'ı nasıl sisteme dahil edeceğimizi
            ilk ders öğrendik:)

            Biz bu duruma alışmak için Selenium webdriver yerine
            indirdiğimiz webdriver.exe dosyasını
            kullanmaya devam edeceğiz.
         */
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        //System.out.println(driver.getPageSource());
        // getPageSource(), sayfada varolan bütün kodları getirir.

        System.out.println(driver.getWindowHandle());
        //WindowHandle değeri :
        // Selenium'un oluşturduğu her driver objesine verdiği
        //unique bir kod'dur.
        // biz bu değerleri birden fazla sayfa açılırsa,
        // sayfalar arasında geçiş yapmak için kullanırız.

        System.out.println(driver.getWindowHandles());
        // bu method, aktif webdriver objesinin açtığı
        // TÜM SAYFALARIN
        // window handle  değerlerini getirir.

        driver.quit();

    }
}
