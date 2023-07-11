package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void elementGozukeneKadarBekleXpath(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
    }

    public void elementTiklanabilirOlanaKadarBekleXpath(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId)));
    }

    public void elementTiklanabilirOlanaKadarBekleCss(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementId)));
    }

    public void butonaBasXpath(String tusId) {
        driver.findElement(By.xpath(tusId)).click();
    }

    public void butonaBasCss(String tusId) {
        driver.findElement(By.cssSelector(tusId)).click();
    }

}

