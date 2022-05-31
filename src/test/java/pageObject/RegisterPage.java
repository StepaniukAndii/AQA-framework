package pageObject;

import org.openqa.selenium.By;
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
        return weitForClick("//a[contains(@href,\"/register\")]");
    }

    public WebElement radioMale() {
        return weitForClick("//*[contains(@id,\"gender-female\")]");
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

    public void getRegisterPage() {
        driver.get("http://demowebshop.tricentis.com/registerresult/1");
    }
}