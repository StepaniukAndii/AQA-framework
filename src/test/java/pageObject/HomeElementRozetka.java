package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElementRozetka extends BasePage {
    public HomeElementRozetka(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }
    public void goToXiaomi() {
        driver.get("https://rozetka.com.ua/search/?text=%D0%9D%D0%BE%D1%83%D1%82%D0%B1%D1%83%D0%BA+Xiaomi");
    }
    public WebElement getSearchLine() {
        return weitVisibleOfElement("//input[@name='search']");
    }
}
