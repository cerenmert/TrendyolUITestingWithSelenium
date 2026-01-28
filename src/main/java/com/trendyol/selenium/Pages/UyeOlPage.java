package com.trendyol.selenium.Pages;

import com.trendyol.selenium.Users.User;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UyeOlPage extends BasePage {

    By emailBy = By.id("register-email");
    By passwordBy = By.id("register-password-input");
    By submitButtonBy = By.cssSelector("button.submit");
    By womanOptionBy = By.cssSelector(".q-button.female");
    By checkBoxBy = By.xpath("(//div[contains(@class, 'ty-checkbox-container')])[3]");
    By reCaptchaIframeBy = By.cssSelector("iframe[title='reCAPTCHA']");
    By notRobotBy = By.cssSelector(".recaptcha-checkbox-border");

    public UyeOlPage(WebDriver webDriver) {
        super(webDriver);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public HomePage uyeOl(User user) {
        // String email = "test." + getRandomNumber(1000, 9999) + "@eoopy.com";
        // String email = "mvf01609@eoopy.com";
        // String password = "Password1234";
        sendKeys(emailBy, user.getEmail());
        sendKeys(passwordBy, user.getPassword());
        click(womanOptionBy, Duration.ofSeconds(2));
        click(checkBoxBy, Duration.ofSeconds(2));

        // Switch to reCAPTCHA iframe
        webDriver.switchTo().frame(webDriver.findElement(reCaptchaIframeBy));
        click(notRobotBy, Duration.ofSeconds(2));
        // Switch back to default content
        webDriver.switchTo().defaultContent();

        // burda maile gelen kodu girmek gerekiyor.
        // ama muhtemelen fake bir mail ile üye olmayı engellemişler, gelen kod 6 haneli değil.

        click(submitButtonBy, Duration.ofSeconds(5));
        HomePage homePage = new HomePage(webDriver);
        return homePage;
    }
}
