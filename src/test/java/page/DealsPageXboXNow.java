package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        return getListVisibleElement("//*[@class=\"btn btn-block btn-success btn-flat\"]");
    }

    public WebElement getdisplayedBtnWitcher3() {
        return getPresentElement("//*[@class=\"btn btn-block btn-success btn-flat\"]");
    }
}
