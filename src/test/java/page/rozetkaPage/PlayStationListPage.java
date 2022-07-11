package page.rozetkaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlayStationListPage extends HomeElementRozetkaPage {
    public PlayStationListPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getOpenPageforeGamers() {
        return getListPrecenceElement("//li[@class='menu-categories__item ng-star-inserted']");
    }

    public WebElement getconsolesPlayStation() {
        return getClickableElement("//a[@title='https://rozetka.com.ua/consoles/c80020/producer=playstation/']");
    }

    public WebElement getClickcheckBoxPS5() {
        return getClickableElement("//a[@data-id='Playstation 5']");
    }

    public List<WebElement> getListElementPS5() {
        return getListPrecenceElement("//div[@class='goods-tile__inner']");
    }
}
