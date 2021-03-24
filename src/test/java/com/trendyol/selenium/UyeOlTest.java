package com.trendyol.selenium;

import com.trendyol.selenium.Pages.HomePage;
import com.trendyol.selenium.Pages.UyeOlPage;
import org.testng.annotations.Test;

public class UyeOlTest extends  BaseTest {

    @Test
    public void shouldUyeOl() throws InterruptedException {
        HomePage homePage= new HomePage(webDriver);
        UyeOlPage x= homePage.getUyeOl();
        x.uyeOl();
        Thread.sleep(10000);
        homePage.closeModal();
        Thread.sleep(5000);
    }
}
