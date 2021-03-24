package com.trendyol.selenium.Pages;

import com.trendyol.selenium.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends WebDriverHelper {

    By girisYapButtonBy = By.cssSelector(".account-user");
    By uyeOlButtonBy = By.cssSelector(".signup-button");
    By clickElectronicTab = By.cssSelector(".tab-link:nth-of-type(9) > .category-header");
    By tvGoruntuSesSistemleriBy = By.cssSelector(".tab-link:nth-of-type(9) > .sub-nav  .sub-nav-outer > div:nth-of-type(3) > div:nth-of-type(1) > .sub-category-header");


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
        WebElement ele = webDriver.findElement(clickElectronicTab);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(ele).perform();
        Thread.sleep(8000);
        webDriver.findElement(tvGoruntuSesSistemleriBy).click();
        return new ProductResultPage(webDriver);

    }

}
