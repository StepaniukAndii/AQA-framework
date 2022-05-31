package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginRozetka() {
        getUserBtn().click();
        enterEmail().sendKeys();
        enterPass().sendKeys();
        getCheckBoxRemebmerMe().click();
        clickInput().click();
    }

    public WebElement getUserBtn() {
        return getClickableElement("//button[@class='header__button ng-star-inserted']");
    }

    public WebElement enterEmail() {
        return weitVisibleOfElement("//*[@id=\"auth_email\"]");
    }

    public WebElement enterPass() {
        return weitVisibleOfElement("//*[@id=\"auth_pass\"]");
    }

    public WebElement getCheckBoxRemebmerMe() {
        return getPresentElement("//input[@type='checkbox']");
    }

    public WebElement clickInput() {
        return getClickableElement("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
    }
}
