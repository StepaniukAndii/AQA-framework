package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class HomeElementRozetka extends BasePage {
    public HomeElementRozetka(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }
    public WebElement getSearchLine() {
        return weitVisibleOfElement("//input[@name='search']");
    }
}
