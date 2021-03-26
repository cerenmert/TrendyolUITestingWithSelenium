package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {

    By addToBasketBy = By.cssSelector(".pr-in-btn.add-to-bs");
    By addedToBasketBy = By.cssSelector(".pr-in-btn.add-to-bs.success");

    // constructor is created
    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void AddToBasket() {
       click(addToBasketBy,2);
    }

    public boolean isAddedToBasketTitleDisplayed() {
        isDisplayed(addedToBasketBy,3);
        return true;
    }
}
