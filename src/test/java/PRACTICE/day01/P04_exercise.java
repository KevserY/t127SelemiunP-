package PRACTICE.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_exercise {
    public static void main(String[] args) throws InterruptedException {
        /*     . .Exercise2...

        1-Driver oluşturalim
        2-Java class'imiza chromedriver.exet i tanitalim
        3-Driver'in tum ekranı kaplamasini saglayalim
        4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
            Eğer oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        5-"https://www.otto.de” adresine gidelim
        6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7-Title ve URL'in "OTTO” kelimesinin içerip icermedigini kontrol edelim
        8-Ardindan "https://wisequarter.com/” adresine gidip
        9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        10-Bir onceki web sayfamiza geri donelim
        11-Sayfayı yenileyelim
        12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim               */


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));// sayfanın yuklenmesini 10.000 milisaniye bekle
        driver.get("https://www.otto.de"); // istenen URL'yi elle yazma!!!koplaya.

        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim---(yazdıralım demiyor).
        //7-Title ve url inin "OTTO” kelimesinin içerip icermedigini kontrol edelim
        String ottoTitle = driver.getTitle();
        String ottoUrl = driver.getCurrentUrl();

        // bizden istenen """Title ve Url'in "OTTO" içerip içermediğinin test edilmesi""""
        // ayrı ayrı test etmemiz istenmemiş.
        if (ottoTitle.contains("OTTO") && ottoUrl.contains("OTTO")) {
            System.out.println("TITLE and URL TEST : PASSED");
        } else {
            System.out.println("TITLE and URL TEST : FAILED"); // --> !
        }

        //8-Ardindan "https://wisequarter.com/” adresine gidip
        driver.get("https://wisequarter.com/");

        //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wqTitle = driver.getTitle();
        boolean kelime = wqTitle.contains("Quarter");

        if (kelime) {
            System.out.println("Wise Quarter Title Testi: PASSED"); // Ok !
        } else {
            System.out.println("Wise Quarter Title Testi: FAILED");
        }

        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //11-Sayfayı yenileyelim
        driver.navigate().refresh();
        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();

        System.out.println("---------Test tamamlandı------------");
        Thread.sleep(2000);
        driver.quit();


    }
}
