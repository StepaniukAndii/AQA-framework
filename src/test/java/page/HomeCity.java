package page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeCity extends BasePage{
    public HomeCity(WebDriver driver) {
        super(driver);
    }

    public void goCitySites(){
        driver.get("https://citysites.ua/");
    }

    public WebElement clickStartEarning(){
        return getClickableElement("//button[@class='btn btn--green']");
    }
}
