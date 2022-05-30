package pageObject;

import org.openqa.selenium.WebDriver;

public class ElementRozetka extends BasePage {

    public ElementRozetka(WebDriver driver) {
        super(driver);
    }
    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }
}