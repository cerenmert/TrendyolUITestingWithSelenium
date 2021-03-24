package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    By componentListBy = By.className("component-list");

    // constructor is created.
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        //bir üst class'taki constructor'a gitmek için super() methodu kullanılır.
        // extend ettiği class'taki constructor'a gider, yani burda Pages.BasePage'e gider ordaki methodu kullanır.
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(webDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(componentListBy));
    }



}
