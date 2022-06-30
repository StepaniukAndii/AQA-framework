package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegFormCitySites extends BasePage {
    public RegFormCitySites(WebDriver driver) {
        super(driver);
    }

    public WebElement enterNameFiled() {
        return weitVisibleOfElement("//input[@id='ordercallform-name-modal']");
    }

    public WebElement enterCityFiled() {
        return weitVisibleOfElement("//input[@id='ordercallform-city-modal']");
    }

    public WebElement enterPhoneFiled() {
        return weitVisibleOfElement("//input[@id='ordercallform-phone-modal']");
    }

    public WebElement enterEmailFiled() {
        return weitVisibleOfElement("//input[@id='ordercallform-email-modal']");
    }

    public WebElement getClickCheckBox() {
        return getClickableElement("//input[@id='feedbackforms-acceptrules']");
    }

    public WebElement getClickSend() {
        return getClickableElement("//button[@class='btn btn--green btn--regular']");
    }

    public WebElement errorName() {
        return weitVisibleOfElement("//div[@class='form-group field-ordercallform-name-modal required has-error']/div");
    }

    public WebElement errorCity() {
        return weitVisibleOfElement("//div[@class='form-group field-ordercallform-city-modal required has-error']/div");
    }

    public WebElement errorPhone() {
        return weitVisibleOfElement("//div[@class='form-group field-ordercallform-phone-modal required has-error']/div");
    }

    public WebElement errorEmail() {
        return weitVisibleOfElement("//div[@class='form-group field-ordercallform-email-modal required has-error']/div");
    }
}
