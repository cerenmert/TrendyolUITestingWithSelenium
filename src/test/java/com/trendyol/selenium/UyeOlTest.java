package com.trendyol.selenium;

import com.trendyol.selenium.Pages.HomePage;
import com.trendyol.selenium.Pages.UyeOlPage;
import com.trendyol.selenium.Users.User;
import com.trendyol.selenium.Users.UserPool;
import org.testng.annotations.Test;

public class UyeOlTest extends BaseTest {

    @Test
    public void shouldUyeOl() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        UyeOlPage x = homePage.getUyeOl();
        User user= UserPool.getUser1();
        x.uyeOl(user);
        Thread.sleep(10000);
        homePage.closeModal();
        Thread.sleep(5000);
    }
}
