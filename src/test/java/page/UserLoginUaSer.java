package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class UserLoginUaSer extends BasePage {
    public UserLoginUaSer(WebDriver driver) {
        super(driver);
    }

    public void goToUaSerials() {
        driver.get("https://uaserials.pro/");
    }

    public WebElement btnLogin() {
        return getClickableElement("//div[@class='header-btn btn js-login']");
    }

    public WebElement emailLine() {
        return weitVisibleOfElement("//input[@id='login_name']");
    }

    public WebElement passWordLine() {
        return weitVisibleOfElement("//input[@id='login_password']");
    }

    public WebElement clickLogin() {
        return getClickableElement("//button[@onclick='submit();']");
    }
}
