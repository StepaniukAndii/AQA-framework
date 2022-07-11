package page.rozetkaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.rozetkaPage.HomeElementRozetka;

import java.util.List;

public class RozetkaSortList extends HomeElementRozetka {
    public RozetkaSortList(WebDriver driver) {
        super(driver);
    }


    public void clickSortPrice() {
        WebElement dropDown = getClickableElement("//select");
        Select select = new Select(dropDown);
        select.selectByIndex(1);
    }

    public List<WebElement> searchGoods() {
        return getListPrecenceElement("//span[@class=\"goods-tile__price-value\"]");
    }
}
