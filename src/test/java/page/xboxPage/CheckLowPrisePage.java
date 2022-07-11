package page.xboxPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckLowPrisePage extends DealsXboXNowPage {
    public CheckLowPrisePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> checkSmallPrice() {
        return getListPrecenceElement("//*[@id='id12']//strong/span");
    }
}
