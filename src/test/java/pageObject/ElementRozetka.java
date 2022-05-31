package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementRozetka extends BasePage {

    public ElementRozetka(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement displayedLogoUserBtn() {
        return getPresentElement("//button[@class='header__button ng-star-inserted']");
    }

    public WebElement displayedEnterEmailLine() {
        return getPresentElement("//*[@id=\"auth_email\"]");
    }

    public WebElement displayedEnterPassLine() {
        return getPresentElement("//*[@id=\"auth_pass\"]");
    }

    public WebElement displayedRememberMeCheckBox() {
        return getPresentElement("//input[@type='checkbox']");
    }

    public WebElement displayedInputBtn() {
        return getPresentElement("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
    }
}