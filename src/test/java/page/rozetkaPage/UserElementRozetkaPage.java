package page.rozetkaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class UserElementRozetkaPage extends BasePage {

    public UserElementRozetkaPage(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement getdisplayedLogoUserBtn() {
        return getPrecenceElement("//button[@class='header__button ng-star-inserted']");
    }

    public WebElement getdisplayedEnterEmailLine() {
        return getPrecenceElement("//*[@id=\"auth_email\"]");
    }

    public WebElement getdisplayedEnterPassLine() {
        return getPrecenceElement("//*[@id=\"auth_pass\"]");
    }

    public WebElement getdisplayedRememberMeCheckBox() {
        return getPrecenceElement("//input[@type='checkbox']");
    }

    public WebElement getdisplayedInputBtn() {
        return getPrecenceElement("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
    }
}