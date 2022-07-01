package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TidexPage extends BasePage {
    public TidexPage(WebDriver driver) {
        super(driver);
    }

    public void goTidex() {
        driver.get("https://tidex.com/exchange");
    }

    public WebElement iFrame() {
        return getPresentElement("/html/body/div[1]/div/div/main/div/div[3]/div/div[3]/div/iframe");
    }
    public WebElement clickSwitchSizeBtn() {
        return getClickableElement("//*[@class='button-1SoiPS-f']");
    }
    public void iframeSwitchSizeBtn() {
        driver.switchTo().frame(iFrame());
        clickSwitchSizeBtn().click();
    }

    public WebElement getMinTablet() {
        return weitVisibleOfElement("//*[@class='chart-gui-wrapper']");
    }

    public WebElement getMaxTablet() {
        return weitVisibleOfElement("//*[@class='chart-gui-wrapper']");
    }
}
