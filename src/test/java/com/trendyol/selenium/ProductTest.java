package com.trendyol.selenium;

import com.trendyol.selenium.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ProductTest extends BaseTest {

    @Test
    public ProductDetailsPage ChoseCategoryAndClick() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
        //HomePage homePage = new HomePage(webDriver);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
        //3. page is starting with 41. product
        ProductDetailsPage productDetailsPage= productResultPage.viewProductDetails(45);
        return new ProductDetailsPage(webDriver);
    }

    @Test
    public void addToBasket() throws InterruptedException {
        HomePage homePage = this.uyeOlAndGoHome();
        //HomePage homePage = new HomePage(webDriver);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
        //3. page is starting with 41. product
        ProductDetailsPage productDetailsPage= productResultPage.viewProductDetails(43);
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
        //HomePage homePage = new HomePage(webDriver);
        ProductResultPage productResultPage = homePage.choseCategory();
        productResultPage.pageScroll();
        Thread.sleep(10000);
        //3. page is starting with 41. product
        ProductDetailsPage productDetailsPage= productResultPage.viewProductDetails(45);
        Thread.sleep(2500);
        productDetailsPage.AddToBasket();
        Thread.sleep(2500);
        boolean addingControl = productDetailsPage.isAddedToBasketTitleDisplayed();
        assertThat("When user added product to basket, ", addingControl, is(equalTo(true)));
        MyBasketPage myBasketPage = productDetailsPage.goToMyBasketPage();
        myBasketPage.isDisplayedAddedProduct();
        RemoveBasketForm removeBasketForm = myBasketPage.deleteProduct();
        Thread.sleep(2500);
        removeBasketForm.productNameIsDisplayed();
        removeBasketForm.confirmRemove();
        Thread.sleep(3000);

    }


}
