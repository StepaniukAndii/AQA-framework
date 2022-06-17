package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeElementRozetka extends BasePage {
    public HomeElementRozetka(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public void goToRozetkaUaCeckout() {
        driver.get("https://rozetka.com.ua/xiaomi-jyu4331cn/p311453203/");
    }

    public WebElement getSearchLine() {
        return weitVisibleOfElement("//input[@name='search']");
    }

    public WebElement getCatalogElement() {
        return weitVisibleOfElement("//ul[@class=\"catalog-grid ng-star-inserted\"]/li");
    }

    public void getPrintInSearchLine(String str) {
        getSearchLine().sendKeys(str + "\n");
    }
}
