package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeLanguage extends HomeElementRozetka{


    public ChangeLanguage(WebDriver driver) {
        super(driver);
    }

    public void goToRozetkaUa() {
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement langRu(){
        return getClickableElement("//li[@class=\"lang__item lang-header__item lang-header__item_state_active ng-star-inserted\"]");
    }
    public WebElement langUa(){
        return getClickableElement("//a[@class=\"lang__link ng-star-inserted\"]");
    }

    public WebElement clickBurgerBtn(){
        return getClickableElement("//button[@class='header__button ng-tns-c94-1']");
    }

    public WebElement clickChangeLangUA(){
        return getClickableElement("//div[@class='side-menu__switch ng-tns-c94-1 ng-star-inserted']//a[@class='lang__link ng-star-inserted']");
    }

    public WebElement clickChangeLangRU(){
        return getClickableElement("//li[@class=\"lang__item __item __item_state_active ng-star-inserted\"]");
    }




}
