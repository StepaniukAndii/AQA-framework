package page.rozetkaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

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
        return getVisibleOfElement("//*[@id=\"auth_email\"]");
    }

    public WebElement enterPass() {
        return getVisibleOfElement("//*[@id=\"auth_pass\"]");
    }

    public WebElement getCheckBoxRemebmerMe() {
        return getPrecenceElement("//input[@type='checkbox']");
    }

    public WebElement clickInput() {
        return getClickableElement("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
    }

    public WebElement getSingInGoogle() {
        return getClickableElement("//button[@class='button button--large button--gray button--with-icon auth-modal__social-button']");
    }

    public void getInputEmail() {
        getVisibleOfElement("//input[@type='email']").sendKeys("sergadovlol@gmail.com", "\n");
    }
}
