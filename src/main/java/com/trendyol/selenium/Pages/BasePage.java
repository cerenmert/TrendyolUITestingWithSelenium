package com.trendyol.selenium.Pages;

import com.trendyol.selenium.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends WebDriverHelper {

    By girisYapButtonBy = By.cssSelector(".account-user");
    By uyeOlButtonBy = By.cssSelector(".signup-button");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public UyeOlPage getUyeOl() throws InterruptedException {

        WebElement ele = webDriver.findElement(girisYapButtonBy);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(ele).perform();
        Thread.sleep(3000);
        click(uyeOlButtonBy, 10);
        return new UyeOlPage(webDriver);
    }
}
