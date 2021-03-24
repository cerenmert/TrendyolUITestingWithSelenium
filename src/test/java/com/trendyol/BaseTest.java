package com.trendyol;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
        WebDriver webDriver;

        @BeforeMethod
        public void startUp() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            // sayfada "bu browser ChromeDriver tarafından otomatize ediliyor" gibi bir yazı çıkmasını engelliyor.

            //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriverManager.chromedriver().setup(); //bonigarcia
            webDriver = new ChromeDriver(options);
            webDriver.manage().window().maximize();

            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //implicitWait kullanımı çok fazla tavsiye edilmez, hatta Selenium geliştiricilerini keşke geliştirmeseydik dedikleri şey.
            //explicitWait tercih edilmeli.
            webDriver.get("https://www.trendyol.com/");
            WebElement closeButton = webDriver.findElement(By.className("fancybox-close"));
            closeButton.click();
        }

//        public void disableChromeToSavePassword(){
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--start-maximized");
//            options.addArguments("--disable-web-security");
//            options.addArguments("--no-proxy-server");
//            Map<String, Object> prefs = new HashMap<>();
//            prefs.put("credentials_enable_service", false);
//            prefs.put("profile.password_manager_enabled", false);
//            options.setExperimentalOption("prefs", prefs);
//        }

        @AfterMethod
        public void tearDown() {

            webDriver.quit();
            // işin bitince browser'ı kapat methodu
            // bu testleri kendi localimizde koşmuyoruz normalde
            // eğer browser'ı test sonunda kapatmazsak, bir süre sonra out of memory hatası alırız.
        }

    }
