package com.trendyol.selenium.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductResultPage extends BasePage {

    public ProductResultPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void pageScrool() {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }
}
