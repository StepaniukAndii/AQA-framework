package page.rozetkaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoingOrderPage extends HomeElementRozetka {
    public DoingOrderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterYouSurname() {
        return getVisibleOfElement("//input[@formcontrolname='surname']");
    }

    public WebElement enterYouName() {
        return getVisibleOfElement("//input[@formcontrolname='name']");
    }

    public WebElement enterYouPhone() {
        return getVisibleOfElement("//input[@formcontrolname='phone']");
    }

    public WebElement enterYouEmail() {
        return getVisibleOfElement("//input[@class='ng-pristine ng-invalid ng-star-inserted ng-touched']");
    }


    public void enterUserInfo() {
        DoingOrderPage doingOrderPage = new DoingOrderPage(driver);
        doingOrderPage.enterYouSurname().sendKeys("Oleksandr");
        doingOrderPage.enterYouName().sendKeys("Moroz");
        doingOrderPage.enterYouPhone().sendKeys("0545986357");
    }

    public WebElement getEnterYouCity() {
        return getClickableElement("//span[@class='deliveries__city-title']");
    }

    public WebElement getCityOdessa() {
        return getClickableElement("/html/body/app-root/single-modal-window/div[3]/div[2]/rz-modal/common-city/ul/li[3]/a");
    }

    public WebElement getEnterCityClick() {
        return getClickableElement("//button[@class='button button_size_medium button_color_green']");
    }

    public WebElement getPostOffice() {
        return getClickableElement("//button[@class='button dropdown-button']");
    }

    public WebElement getAdressPostOffice() {
        return getClickableElement("//div[contains(text(),'№7, ул. Жуковского, 10')]");
    }

    public WebElement choiceUser() {
        return getClickableElement("//button[@class='select-css select-css--medium']");
    }

    public WebElement getUserSurnameName() {
        return getClickableElement("//div[contains(text(),'Moroz  Oleksand')]");
    }

    public WebElement errorKirylicaSurname() {
        return getListPrecenceElement("//form-error/p").get(0);
    }

    public WebElement errorKirylicaName() {
        return getListPrecenceElement("//form-error/p").get(1);
    }

    public WebElement errorPhoneNumber() {
        return getListPrecenceElement("//form-error/p").get(2);
    }
}
