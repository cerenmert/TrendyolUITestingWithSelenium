package Pages;

import com.trendyol.bootcamp.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper {

    private By searchBoxBy = By.className("search-box");
    private By suggestionTitleBy = By.className("suggestion-title");

    By uyeOlBy= By.cssSelector(".signup-button");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterSearchKeyword(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword);
        //bu method bana farklı bir sayfa dönmüyor, o yüzden void kalabilir.
    }


    public UyeOlPage getUyeOl() {
       click(uyeOlBy,20);
       return new UyeOlPage(webDriver);
    }
}
