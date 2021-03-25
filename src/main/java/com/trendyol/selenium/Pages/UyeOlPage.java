package com.trendyol.selenium.Pages;

import com.trendyol.selenium.Users.User;
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

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public HomePage uyeOl(User user) {
        //String email = "test." + getRandomNumber(1000, 9999) + "@eoopy.com";
        //String email = "mvf01609@eoopy.com";
        //String password = "Password1234";
        webDriver.findElement(emailBy).sendKeys(user.getEmail());
        webDriver.findElement(passwordBy).sendKeys(user.getPassword());
        webDriver.findElement(submitButtonBy).click();
        return new HomePage(webDriver);
    }


}
