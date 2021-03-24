package com.trendyol.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UyeOlPage extends BasePage {

    By emailBy = By.id("register-email");
    By passwordBy = By.id("register-password-input");
    By submitButtonBy = By.cssSelector(".q-primary.q-fluid.q-button-medium.q-button.submit");


    public UyeOlPage(WebDriver webDriver) {
        super(webDriver);
        //bir üst class'taki constructor'a gitmek için super() methodu kullanılır.
        // extend ettiği class'taki constructor'a gider, yani burda BasePage'e gider ordaki methodu kullanır.
    }

    public HomePage uyeOl() {
        String email = "ume43106@eoopy.com";
        String password = "Password1234";
        webDriver.findElement(emailBy).sendKeys(email);
        webDriver.findElement(passwordBy).sendKeys(password);
        webDriver.findElement(submitButtonBy).click();
        return new HomePage(webDriver);
    }


}
