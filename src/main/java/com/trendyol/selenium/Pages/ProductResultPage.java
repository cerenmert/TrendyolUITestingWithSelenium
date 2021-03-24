package com.trendyol.selenium.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductResultPage extends BasePage {

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
}
