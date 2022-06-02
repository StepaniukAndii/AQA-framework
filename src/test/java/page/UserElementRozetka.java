package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserElementRozetka extends BasePage {

    public UserElementRozetka(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement getdisplayedLogoUserBtn() {
        return getPresentElement("//button[@class='header__button ng-star-inserted']");
    }

    public WebElement getdisplayedEnterEmailLine() {
        return getPresentElement("//*[@id=\"auth_email\"]");
    }

    public WebElement getdisplayedEnterPassLine() {
        return getPresentElement("//*[@id=\"auth_pass\"]");
    }

    public WebElement getdisplayedRememberMeCheckBox() {
        return getPresentElement("//input[@type='checkbox']");
    }

    public WebElement getdisplayedInputBtn() {
        return getPresentElement("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
    }
}