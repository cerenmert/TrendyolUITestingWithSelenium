package com.trendyol.selenium;

import com.trendyol.selenium.Pages.HomePage;
import com.trendyol.selenium.Pages.ProductResultPage;
import org.testng.annotations.Test;

public class CategoryTest extends BaseTest {

    @Test
    public void ChoseCategoryAndClick() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScrool();
    }
}
