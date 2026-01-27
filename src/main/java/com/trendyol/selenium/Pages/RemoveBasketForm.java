package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RemoveBasketForm extends BasePage {

    By removeBasketFormBy = By.cssSelector(".ng-pristine.ng-valid");
    By productName = By.cssSelector(".ng-pristine.ng-valid");
    By deleteButtonOnTheFormPage = By.cssSelector(".btn-item.btn-remove");

    public RemoveBasketForm(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean productNameIsDisplayed() {
        isDisplayed(removeBasketFormBy, Duration.ofSeconds(3));
        isDisplayed(productName,Duration.ofSeconds(3));
        return true;
    }

    public void confirmRemove() {
        click(deleteButtonOnTheFormPage,Duration.ofSeconds(5));
    }
}

