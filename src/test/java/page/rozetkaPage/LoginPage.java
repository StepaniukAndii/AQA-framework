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

    public WebElement getSignInGoogle() {
        return getClickableElement("//button[@class='button button--large button--gray button--with-icon auth-modal__social-button']");
    }

    public void openGoogleAccount() {
        driver.get("https://accounts.google.com/o/oauth2/auth/identifier?client_id=5458514456-8gm2oc3quosun7cj5p56nmiurcv7npjn.apps.googleusercontent.com&display=popup&redirect_uri=https%3A%2F%2Fuss.rozetka.com.ua%2Fsession%2Fsocial%2Fgoogle&response_type=code&scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile&state=eyJhY3Rpb24iOiJhdXRoIiwiY2xhc3MiOiJnb29nbGUiLCJyZW1lbWJlciI6dHJ1ZX0%3D&flowName=GeneralOAuthFlow");
    }

    public WebElement enterEmailGoogle() {
        return getVisibleOfElement("//input[@type='email']");
    }

    public WebElement notIncludedInTheAccountMessege(){
        return getVisibleOfElement("//span[contains(text(),'Не вдається ввійти в обліковий запис')]");
    }
}
