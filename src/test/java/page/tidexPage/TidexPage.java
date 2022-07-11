package page.tidexPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class TidexPage extends BasePage {
    public TidexPage(WebDriver driver) {
        super(driver);
    }

    public void goTidex() {
        driver.get("https://tidex.com/exchange");
    }

    public WebElement iFrame() {
        return getPrecenceElement("/html/body/div[1]/div/div/main/div/div[3]/div/div[3]/div/iframe");
    }

    public WebElement clickSwitchSizeBtn() {
        return getClickableElement("//*[@class='button-1SoiPS-f']");
    }

    public void iframeSwitchSizeBtn() {
        driver.switchTo().frame(iFrame());
        clickSwitchSizeBtn().click();
    }

    public WebElement getMinTablet() {
        return getVisibleOfElement("//*[@class='chart-gui-wrapper']");
    }

    public WebElement getMaxTablet() {
        return getVisibleOfElement("//*[@class='chart-gui-wrapper']");
    }
}
