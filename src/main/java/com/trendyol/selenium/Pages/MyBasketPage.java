package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBasketPage extends  BasePage{

    By productAdded= By.cssSelector(".pb-wrapper");
    By deleteIcon= By.cssSelector(".i-trash");

    public MyBasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isDisplayedAddedProduct(){
        webDriver.findElement(productAdded).isDisplayed();
        return true;
    }
    public RemoveBasketForm deleteProduct(){
        webDriver.findElement(deleteIcon).click();
        return new RemoveBasketForm(webDriver);
    }

}
