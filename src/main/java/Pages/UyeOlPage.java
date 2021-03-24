package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UyeOlPage extends BasePage{

    By emailBy= By.cssSelector(".q-input-wrapper.email-input");
    By passwordBy= By.cssSelector(".password-wrapper");
    By submitButtonBy= By.cssSelector(".q-primary.q-fluid.q-button-medium.q-button.submit");
    By uyeOlTopButtonBy= By.cssSelector(".q-secondary.q-button-medium.q-button.tab.button.right.active");
    By girisYapButtonBy= By.cssSelector(".account-user");

   public UyeOlPage (WebDriver webDriver) {
        super(webDriver);
        //bir üst class'taki constructor'a gitmek için super() methodu kullanılır.
        // extend ettiği class'taki constructor'a gider, yani burda BasePage'e gider ordaki methodu kullanır.
    }

    public HomePage uyeOl(String keyword, String keyword2){
        WebElement ele = webDriver.findElement(girisYapButtonBy);
        Actions actions= new Actions(webDriver);
        actions.moveToElement(ele).perform();
        //webDriver.findElement(girisYapButtonBy).click();
        click(uyeOlTopButtonBy,15);
        webDriver.findElement(emailBy).sendKeys(keyword);
        webDriver.findElement(passwordBy).sendKeys(keyword2);
        webDriver.findElement(submitButtonBy).click();
        return new HomePage(webDriver);
    }


}
