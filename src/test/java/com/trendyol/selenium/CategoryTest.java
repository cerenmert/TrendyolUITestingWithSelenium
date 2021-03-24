package com.trendyol.selenium;

import com.trendyol.selenium.Pages.HomePage;
import com.trendyol.selenium.Pages.ProductResultPage;
import org.testng.annotations.Test;

public class CategoryTest extends BaseTest {

    @Test
    public void ChoseCategoryAndClick() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
//        HomePage homePage = new HomePage(webDriver);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
    }
}
