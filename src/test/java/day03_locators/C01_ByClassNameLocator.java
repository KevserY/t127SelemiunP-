package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class C01_ByClassNameLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //testotomasyonu.com sayfasına gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        //arama yapıldıktan sonra, sol tarafta çıkan Categories menüsündeki
        // kategori sayısının 8 olduğunu test edin.

        int exceptedKategoriSayisi = 8;

        List<WebElement> kategoriElementleriList = driver.findElements(By.className("acc_head"));

        int actualKategoriSayisi = kategoriElementleriList.size();

        if (exceptedKategoriSayisi == actualKategoriSayisi) {
            System.out.println("Kategori Sayısı testi PASSED"); //--->Kategori Sayısı testi PASSED
        } else {
            System.out.println("FAILED");
            System.out.println("Actual Kategori Sayısı : " + actualKategoriSayisi);
        }

        // kategorileri yazdırın.

        //System.out.println(kategoriElementleriList);

        // bu list web elementlerden oluşuyor.
        // Web elementler üzerindeki yazıyı direk yazdıramayız
        // her bir web elementi ele alıp üzerindeki yazıyı yazdırmamız gerekir.
        // list olarak yazdıramayız, tek tek yazdırabiliriz.

        /*
                yazdirma islemini bir for-each loop ile yapabiliriz
                ama biz bu islemi cok kullanacagimiz icin
                bir method olusturup
                webelementlerden olusan listeyi
                String'lerden olusan bir listeye cevirdik

        for (WebElement each: kategoriElementleriList
             ) {
            System.out.println(each.getText());
        }         */


        System.out.println(ReusableMethods.stringListeDonustur(kategoriElementleriList));
        // [Grocery, Kids Wear, Travel, Shoes, Furniture, Men Fashion, Women Fashion, Electronics]


        Thread.sleep(3000);
        driver.quit();




    }
}
