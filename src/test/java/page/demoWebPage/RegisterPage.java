package page.demoWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

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
        return getVisibleOfElement("//*[contains(@id,\"FirstName\")]");
    }

    public WebElement getEntrLastName() {
        return getVisibleOfElement("//*[contains(@id,\"LastName\")]");
    }

    public WebElement getEntrEmail() {
        return getVisibleOfElement("//*[contains(@id,\"Email\")]");
    }

    public WebElement getEntrPass() {
        return getVisibleOfElement("//*[@id=\"Password\"]");
    }

    public WebElement getEntrConfirmPass() {
        return getVisibleOfElement("//*[@id=\"ConfirmPassword\"]");
    }

    public WebElement getRegisterBtn() {
        return getVisibleOfElement("//*[@id=\"register-button\"]");
    }

    public void openRegisterPage() {
        driver.get("http://demowebshop.tricentis.com/registerresult/1");
    }

    public String pass() {
        return "ewqasdcxz";
    }

}