package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class ProductDetailsPage extends BasePage {

    By addToBasketBy = By.cssSelector(".pr-in-btn.add-to-bs");
    By addedToBasketBy = By.cssSelector(".pr-in-btn.add-to-bs.success");
    By favoriteButtonBy = By.cssSelector(".prc-inf-wrp > .pr-in-btn.fv");

    // constructor is created
    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void AddToBasket() {
        click(addToBasketBy, Duration.ofSeconds(3));
    }

    public boolean isAddedToBasketTitleDisplayed() {
        isDisplayed(addedToBasketBy, Duration.ofSeconds(3));
        return true;
    }

    public void addMyFavoriteProduct() {
        click(favoriteButtonBy, Duration.ofSeconds(3));
    }
}
