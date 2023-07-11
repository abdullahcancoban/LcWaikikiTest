package Tests;

import Sayfalar.AnaSayfa;
import Sayfalar.SepetSayfasi;
import Sayfalar.UrunSayfasi;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class UrunTests {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private SepetSayfasi sepetSayfasi;
    private UrunSayfasi urunSayfasi;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        sepetSayfasi = new SepetSayfasi(driver);
        urunSayfasi = new UrunSayfasi(driver);
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");

    }

    @Test
    void lcWaikikiSepeteUrunEklemeTests() {
        WebElement kategoriAksesuar = driver.findElement(By.xpath(anaSayfa.kategoriAksesuar));
        Actions actions = new Actions(driver);
        actions.moveToElement(kategoriAksesuar).perform();


        anaSayfa.elementTiklanabilirOlanaKadarBekleXpath(anaSayfa.kadinCanta);
        WebElement kadinCanta = driver.findElement(By.xpath(anaSayfa.kadinCanta));
        Assertions.assertTrue(kadinCanta.isDisplayed());
        anaSayfa.butonaBasXpath(anaSayfa.kadinCanta);

        anaSayfa.elementTiklanabilirOlanaKadarBekleXpath(anaSayfa.urunXPath);
        anaSayfa.butonaBasXpath(anaSayfa.urunXPath);
        urunSayfasi.elementGozukeneKadarBekleXpath(urunSayfasi.sepeteEkle);
        WebElement sepeteEkle = driver.findElement(By.xpath(urunSayfasi.sepeteEkle));
        Assertions.assertTrue(sepeteEkle.isDisplayed());


        urunSayfasi.butonaBasXpath(urunSayfasi.sepeteEkle);
        urunSayfasi.butonaBasXpath(urunSayfasi.sepeteGit);

        sepetSayfasi.elementGozukeneKadarBekleXpath(sepetSayfasi.siparisOzeti);
        WebElement siparisOzeti = driver.findElement(By.xpath(sepetSayfasi.siparisOzeti));
        Assertions.assertTrue(siparisOzeti.isDisplayed());
        sepetSayfasi.elementTiklanabilirOlanaKadarBekleCss(sepetSayfasi.anaSayfayaDonmeButonu);
        sepetSayfasi.butonaBasCss(sepetSayfasi.anaSayfayaDonmeButonu);


        String gecerliAdres = driver.getCurrentUrl();
        String beklenenAdres = "https://www.lcwaikiki.com/tr-TR/TR";
        Assertions.assertEquals(gecerliAdres, beklenenAdres);


    }


    @AfterEach
    void teardown() {
        driver.close();
    }
}
