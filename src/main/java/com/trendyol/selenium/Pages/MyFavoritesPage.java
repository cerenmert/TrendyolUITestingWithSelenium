package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MyFavoritesPage extends BasePage{
    By favNumberText= By.className("favorite-count");
    By emptyFavList=By.cssSelector(".empty-favorites-header");

    // constructor is created
    public MyFavoritesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getFavCount () {
        return getText(favNumberText);
    }
    public boolean emptyFavList(){
        isDisplayed(emptyFavList, Duration.ofSeconds(2));
        return true;
    }

}
