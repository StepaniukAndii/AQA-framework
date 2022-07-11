package page.xboxPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.BasePage;

import java.util.List;

public class DealsPageXboXNow extends BasePage {

    public DealsPageXboXNow(WebDriver driver) {
        super(driver);
    }

    public void dealsGame() {
        WebElement dropDown = getClickableElement("//div[@class='input-group']/select");
        Select select = new Select(dropDown);
        select.selectByIndex(9);
    }

    public List<WebElement> getClickBtnWitcher3() {
        return getListPrecenceElement("//*[@class=\"btn btn-block btn-success btn-flat\"]");
    }

    public WebElement getdisplayedBtnWitcher3() {
        return getPrecenceElement("//*[@class=\"btn btn-block btn-success btn-flat\"]");
    }
}
