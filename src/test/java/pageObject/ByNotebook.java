package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ByNotebook extends HomeElementRozetka {
    public ByNotebook(WebDriver driver) {
        super(driver);
    }

    public void lowPrice() {
        WebElement dropDown = getClickableElement("//select");
        Select select = new Select(dropDown);
        select.selectByIndex(1);
    }
}
