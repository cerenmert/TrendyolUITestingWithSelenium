package com.trendyol.selenium.Pages;

import com.trendyol.selenium.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends WebDriverHelper {

    By girisYapButtonBy = By.cssSelector(".account-user");
    By uyeOlButtonBy = By.cssSelector(".signup-button");
    By clickCategoryBy= By.id("sub-nav-5");
    By tvGoruntuSesSistemleriBy= By.linkText("TV & Görüntü & Ses");


    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public UyeOlPage getUyeOl() throws InterruptedException {

        WebElement ele = webDriver.findElement(girisYapButtonBy);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(ele).perform();
        Thread.sleep(8000);
        click(uyeOlButtonBy, 10);
        return new UyeOlPage(webDriver);
    }

    public ProductResultPage choseCategory() throws InterruptedException {
        WebElement ele = webDriver.findElement(clickCategoryBy);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(ele).perform();
        Thread.sleep(8000);
        webDriver.findElement(tvGoruntuSesSistemleriBy).click();
        return new ProductResultPage(webDriver);


    }

}
