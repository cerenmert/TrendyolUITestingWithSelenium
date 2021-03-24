package com.trendyol;

import Pages.HomePage;
import Pages.UyeOlPage;
import org.testng.annotations.Test;

public class UyeOlTest extends  BaseTest {

    @Test
    public void shouldUyeOl(){
        String email= "kfz94843@zwoho.com";
        String password= "Password1234";
        HomePage homePage= new HomePage(webDriver);
        UyeOlPage x= homePage.getUyeOl();
        x.uyeOl(email,password);
    }

}
