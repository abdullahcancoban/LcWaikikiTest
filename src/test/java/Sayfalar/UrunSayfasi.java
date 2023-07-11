package Sayfalar;

import org.openqa.selenium.WebDriver;

public class UrunSayfasi extends Sayfa {

    public final String sepeteEkle = "//a[@id='pd_add_to_cart']";
    public final String sepeteGit = "//span[.='Sepetim']";

    public UrunSayfasi(WebDriver driver) {
        super(driver);
    }
}
