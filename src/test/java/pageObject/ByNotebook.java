package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ByNotebook extends HomeElementRozetka {
    public ByNotebook(WebDriver driver) {
        super(driver);
    }
//    public List<WebElement> getSortList(){
//        return getListVisibleElement("//select[@class='select-css ng-valid ng-star-inserted ng-touched ng-dirty']");
//    }

    public void lowPrice() {
        WebElement dropDown = getClickableElement("//select");
        Select select = new Select(dropDown);
        select.selectByIndex(1);
    }
}
