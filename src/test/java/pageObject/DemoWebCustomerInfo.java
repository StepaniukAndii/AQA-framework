package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoWebCustomerInfo extends BasePage {

    public DemoWebCustomerInfo(WebDriver driver) {
        super(driver);
    }

    public void goToLigIn() {
        driver.get("http://demowebshop.tricentis.com/login");
    }

    public void goToCustomerInfo() {
        driver.get("http://demowebshop.tricentis.com/customer/info");
    }

    public WebElement getEntrEmailForLogin() {
        return weitVisibleOfElement("//*[contains(@id,\"Email\")][@class='email']");
    }

    public WebElement getEntrPassForLogin() {
        return weitVisibleOfElement("//*[contains(@id,\"Password\")][@class='password']");
    }

    public WebElement clickLogIn() {
        return weitVisibleOfElement("//*[contains(@value,\"Log in\")][@class='button-1 login-button']");
    }

    public WebElement clickAdress() {
        return getClickableElement("//a[contains(@href,\"/customer/addresses\")][@class='inactive']");
    }

    public WebElement clickAddNew() {
        return getClickableElement("//*[@class='button-1 add-address-button']");
    }

    public WebElement getEntrFirstName() {
        return weitVisibleOfElement("//*[contains(@id,\"Address_FirstName\")]");
    }

    public WebElement getEntrLastName() {
        return weitVisibleOfElement("//*[contains(@id,\"Address_LastName\")]");
    }

    public WebElement getEntrEmail() {
        return weitVisibleOfElement("//*[contains(@id,\"Address_Email\")]");
    }

    public WebElement clickDownList() {
        return getClickableElement("//*[contains(@id,\"Address_CountryId\")]");
    }

    public WebElement clickIndia() {
        return getClickableElement("//*[@value='41']");
    }

    public WebElement getEntrCity() {
        return weitVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_City\")]");
    }

    public WebElement getEntrAdress1() {
        return weitVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_Address1\")]");
    }

    public WebElement getEntrZipPostalcode() {
        return weitVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_ZipPostalCode\")]");
    }

    public WebElement getEntrPhoneNumber() {
        return weitVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_PhoneNumber\")]");
    }

    public WebElement clickBtnSave() {
        return getClickableElement("//*[contains(@value,\"Save\")][@class='button-1 save-address-button']");
    }

    public void logIn() {
        DemoWebCustomerInfo demoWebCustomerInfo = new DemoWebCustomerInfo(driver);
        demoWebCustomerInfo.goToLigIn();
        demoWebCustomerInfo.getEntrEmailForLogin().sendKeys("sergadovlol@gmail.com");
        RegisterPage registerPage = new RegisterPage(driver);
        demoWebCustomerInfo.getEntrPassForLogin().sendKeys(registerPage.pass());
        demoWebCustomerInfo.clickLogIn().click();
    }
}