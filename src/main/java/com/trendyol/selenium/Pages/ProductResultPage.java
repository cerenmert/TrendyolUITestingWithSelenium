package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class ProductResultPage extends BasePage {

    By productDetailBy = By.className("p-card-chldrn-cntnr");

    public ProductResultPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void pageScroll() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(2500);
        jse.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(2500);
    }

    public ProductDetailsPage viewProductDetails(int index) {
        List<WebElement> allProducts = webDriver.findElements(productDetailBy);
        allProducts.get(index).click();
        switchWindow();
        // herhangi bir ürün detayını görmek için üstüne tıkladığımda new window'da açıyor,
        // bu yüzden getWindowHandle yapmamız lazım.
        return new ProductDetailsPage(webDriver);
    }

    public void switchWindow() {
        Set<String> windows = webDriver.getWindowHandles();
        webDriver.switchTo().window(windows.toArray()[windows.toArray().length - 1].toString());
    }

}
