package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoingOrderPage extends HomeElementRozetka {
    public DoingOrderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterYouSurname() {
        return weitVisibleOfElement("//input[@formcontrolname='surname']");
    }

    public WebElement enterYouName() {
        return weitVisibleOfElement("//input[@formcontrolname='name']");
    }

    public WebElement enterYouPhone() {
        return weitVisibleOfElement("//input[@formcontrolname='phone']");
    }

    public WebElement enterYouEmail() {
        return weitVisibleOfElement("//input[@class='ng-pristine ng-invalid ng-star-inserted ng-touched']");
    }


    public void enterUserInfo() {
        DoingOrderPage doingOrderPage = new DoingOrderPage(driver);
        doingOrderPage.enterYouSurname().sendKeys("Oleksandr");
        doingOrderPage.enterYouName().sendKeys("Moroz");
        doingOrderPage.enterYouPhone().sendKeys("0545986357");
//        doingOrderPage.enterYouEmail().sendKeys("morozok966@gmail.com");
    }

    public WebElement getEnterYouCity() {
        return getClickableElement("//span[@class='deliveries__city-title']");
    }

    public WebElement getCityOdessa() {
        return getClickableElement("//a[contains(text(),'Одесса')]");
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
        return getClickableElement("//div[contains(text(),'oroz  Oleksand')]");
    }

    public WebElement errorKirylicaSurname() {
        return getListVisibleElement("//form-error/p").get(0);
    }

    public WebElement errorKirylicaName() {
        return getListVisibleElement("//form-error/p").get(1);
    }

    public WebElement errorPhoneNumber() {
        return getListVisibleElement("//form-error/p").get(2);
    }
}
