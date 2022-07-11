package page.rozetkaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class HomeElementRozetkaPage extends BasePage {
    public HomeElementRozetkaPage(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public void goToRozetkaUaCeckout() {
        driver.get("https://rozetka.com.ua/xiaomi-jyu4331cn/p311453203/");
    }

    public WebElement getSearchLine() {
        return getVisibleOfElement("//input[@name='search']");
    }

    public WebElement getCatalogElement() {
        return getVisibleOfElement("//ul[@class=\"catalog-grid ng-star-inserted\"]/li");
    }

    public void getPrintInSearchLine(String str) {
        getSearchLine().sendKeys(str + "\n");
    }
}
