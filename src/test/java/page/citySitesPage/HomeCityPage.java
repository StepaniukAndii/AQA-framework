package page.citySitesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class HomeCityPage extends BasePage {
    public HomeCityPage(WebDriver driver) {
        super(driver);
    }

    public void goCitySites(){
        driver.get("https://citysites.ua/");
    }

    public WebElement clickStartEarning(){
        return getClickableElement("//button[@class='btn btn--green']");
    }
}
