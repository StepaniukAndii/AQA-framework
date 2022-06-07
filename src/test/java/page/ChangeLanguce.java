package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeLanguce extends HomeElementRozetka{
    public ChangeLanguce(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement langRu(){
        return getClickableElement("//a[@class='lang__link ng-star-inserted']");
    }

}
