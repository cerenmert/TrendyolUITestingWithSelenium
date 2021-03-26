package com.trendyol.selenium;

import com.trendyol.selenium.Pages.*;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ProductTest extends BaseTest {

    @Test
    public void ChoseCategoryAndClick() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
        Thread.sleep(10000);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
        //3. page is starting with 41. product
        productResultPage.viewProductDetails(45);
        Thread.sleep(2000);
    }

    @Test
    public void addToBasket() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
        Thread.sleep(10000);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
        ProductDetailsPage productDetailsPage = productResultPage.viewProductDetails(45);
        productDetailsPage.AddToBasket();
        boolean addingControl = productDetailsPage.isAddedToBasketTitleDisplayed();
        assertThat("When user added product to basket, ", addingControl, is(equalTo(true)));
        MyBasketPage myBasketPage = productDetailsPage.goToMyBasketPage();
        boolean controlBasket = myBasketPage.isDisplayedAddedProduct();
        System.out.println("Any product in the basket: " + controlBasket);

    }

    @Test
    public void removeAddedProductFromBasket() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
        Thread.sleep(10000);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
        ProductDetailsPage productDetailsPage = productResultPage.viewProductDetails(45);
        productDetailsPage.AddToBasket();
        boolean addingControl = productDetailsPage.isAddedToBasketTitleDisplayed();
        assertThat("When user added product to basket, ", addingControl, is(equalTo(true)));
        MyBasketPage myBasketPage = productDetailsPage.goToMyBasketPage();
        myBasketPage.isDisplayedAddedProduct();
        RemoveBasketForm removeBasketForm = myBasketPage.deleteProduct();
        removeBasketForm.productNameIsDisplayed();
        removeBasketForm.confirmRemove();
        Thread.sleep(2000);

    }


}
