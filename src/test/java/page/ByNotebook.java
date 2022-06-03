package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ByNotebook extends HomeElementRozetka {
    public ByNotebook(WebDriver driver) {
        super(driver);
    }

    public void lowPrice() {
        WebElement dropDown = getClickableElement("//select");
        Select select = new Select(dropDown);
        select.selectByIndex(1);
    }

    public WebElement openPageMiNotebookPro15() {
        return getClickableElement("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[3]/rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]");
    }

    public WebElement addToBasket() {
        return getClickableElement("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']");
    }

    public List<WebElement> getClickSettingforGamer() {
        return getListVisibleElement("//ul[@data-testid=\"additional-services-list\"]//ul");
    }

    public WebElement getCheckoutBusket() {
        return getClickableElement("//a[@href='https://rozetka.com.ua/checkout/']");
    }

}