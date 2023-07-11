package Sayfalar;

import org.openqa.selenium.WebDriver;

public class SepetSayfasi extends Sayfa {
    public final String anaSayfayaDonmeButonu = "[version='1.0']";
    public final String siparisOzeti = "//h1[@class='mb-15']";

    public SepetSayfasi(WebDriver driver) {
        super(driver);
    }
}
