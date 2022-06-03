package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void goToTestShop() {
        driver.get("http://demowebshop.tricentis.com/");
    }

    public WebElement clickReg() {
        return getClickableElement("//a[contains(@href,\"/register\")]");
    }

    public WebElement radioMale() {
        return getClickableElement("//*[contains(@id,\"gender-female\")]");
    }

    public WebElement getEntrFirstName() {
        return weitVisibleOfElement("//*[contains(@id,\"FirstName\")]");
    }

    public WebElement getEntrLastName() {
        return weitVisibleOfElement("//*[contains(@id,\"LastName\")]");
    }

    public WebElement getEntrEmail() {
        return weitVisibleOfElement("//*[contains(@id,\"Email\")]");
    }

    public WebElement getEntrPass() {
        return weitVisibleOfElement("//*[@id=\"Password\"]");
    }

    public WebElement getEntrConfirmPass() {
        return weitVisibleOfElement("//*[@id=\"ConfirmPassword\"]");
    }

    public WebElement getRegisterBtn() {
        return weitVisibleOfElement("//*[@id=\"register-button\"]");
    }

    public void openRegisterPage() {
        driver.get("http://demowebshop.tricentis.com/registerresult/1");
    }

    public String pass() {
        return "ewqasdcxz";
    }
}