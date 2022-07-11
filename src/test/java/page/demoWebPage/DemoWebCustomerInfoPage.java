package page.demoWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

import java.util.List;

public class DemoWebCustomerInfoPage extends BasePage {

    public DemoWebCustomerInfoPage(WebDriver driver) {
        super(driver);
    }

    public void goToLigIn() {
        driver.get("http://demowebshop.tricentis.com/login");
    }

    public void goToCustomerInfo() {
        driver.get("http://demowebshop.tricentis.com/customer/info");
    }

    public WebElement getEntrEmailForLogin() {
        return getVisibleOfElement("//*[contains(@id,\"Email\")][@class='email']");
    }

    public WebElement getEntrPassForLogin() {
        return getVisibleOfElement("//*[contains(@id,\"Password\")][@class='password']");
    }

    public WebElement clickLogIn() {
        return getVisibleOfElement("//*[contains(@value,\"Log in\")][@class='button-1 login-button']");
    }

    public WebElement clickAdress() {
        return getClickableElement("//a[contains(@href,\"/customer/addresses\")][@class='inactive']");
    }

    public WebElement clickAddNew() {
        return getClickableElement("//*[@class='button-1 add-address-button']");
    }

    public WebElement getEntrFirstName() {
        return getVisibleOfElement("//*[contains(@id,\"Address_FirstName\")]");
    }

    public WebElement getEntrLastName() {
        return getVisibleOfElement("//*[contains(@id,\"Address_LastName\")]");
    }

    public WebElement getEntrEmail() {
        return getVisibleOfElement("//*[contains(@id,\"Address_Email\")]");
    }

    public WebElement clickDownList() {
        return getClickableElement("//*[contains(@id,\"Address_CountryId\")]");
    }

    public WebElement clickIndia() {
        return getClickableElement("//*[@value='41']");
    }

    public WebElement getEntrCity() {
        return getVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_City\")]");
    }

    public WebElement getEntrAdress1() {
        return getVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_Address1\")]");
    }

    public WebElement getEntrZipPostalcode() {
        return getVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_ZipPostalCode\")]");
    }

    public WebElement getEntrPhoneNumber() {
        return getVisibleOfElement("//*[@class='text-box single-line'][contains(@id,\"Address_PhoneNumber\")]");
    }

    public WebElement clickBtnSave() {
        return getClickableElement("//*[contains(@value,\"Save\")][@class='button-1 save-address-button']");
    }

    public void logIn() {
        DemoWebCustomerInfoPage demoWebCustomerInfoPage = new DemoWebCustomerInfoPage(driver);
        demoWebCustomerInfoPage.goToLigIn();
        demoWebCustomerInfoPage.getEntrEmailForLogin().sendKeys("sergadovlol@gmail.com");
        RegisterPage registerPage = new RegisterPage(driver);
        demoWebCustomerInfoPage.getEntrPassForLogin().sendKeys(registerPage.pass());
        demoWebCustomerInfoPage.clickLogIn().click();
    }

    public WebElement expectedFirstName() {
        return getVisibleOfElement("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[1]/strong");
    }

    public WebElement expectedEmail() {
        return getVisibleOfElement("//*[@href=\"/customer/info\"][@class='account']");
    }
    public WebElement clickBtnBooks(){
        return getClickableElement("//*[@href=\"/books\"]");
    }
    public void sortByHighToLow(){
        driver.get("http://demowebshop.tricentis.com/books?pagesize=8&orderby=11");
    }
    public List<WebElement> checkSrot(){
        return getListPrecenceElement("//*[@class='price actual-price']");
    }
}