package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnaSayfa extends Sayfa {
    public final String kategoriAksesuar = "//a[.='Aksesuar']";
    public final String kadinCanta = "//div[@class='mega-menu mega-menu--hovered']//a[@href='/tr-TR/TR/kategori/kadin/canta_ve_cuzdan_kadin-83']";
    public final String urunXPath = "(//div[@class='product-card__product-info'])[3]";


    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
