package page.xboxPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class HomePageXboXNow extends BasePage {
    public HomePageXboXNow(WebDriver driver) {
        super(driver);
    }

    public void goXboXNow() {
        driver.get("https://www.xbox-now.com/");
    }

    public WebElement openDeals() {
        return getClickableElement("//a[@href='./deal-comparison']");
    }
}
