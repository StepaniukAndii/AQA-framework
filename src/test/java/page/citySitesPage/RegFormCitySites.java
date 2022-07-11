package page.citySitesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class RegFormCitySites extends BasePage {
    public RegFormCitySites(WebDriver driver) {
        super(driver);
    }

    public WebElement enterNameFiled() {
        return getVisibleOfElement("//input[@id='ordercallform-name-modal']");
    }

    public WebElement enterCityFiled() {
        return getVisibleOfElement("//input[@id='ordercallform-city-modal']");
    }

    public WebElement enterPhoneFiled() {
        return getVisibleOfElement("//input[@id='ordercallform-phone-modal']");
    }

    public WebElement enterEmailFiled() {
        return getVisibleOfElement("//input[@id='ordercallform-email-modal']");
    }

    public WebElement getClickCheckBox() {
        return getClickableElement("//input[@id='feedbackforms-acceptrules']");
    }

    public WebElement getClickSend() {
        return getClickableElement("//button[@class='btn btn--green btn--regular']");
    }

    public WebElement errorName() {
        return getVisibleOfElement("//div[@class='form-group field-ordercallform-name-modal required has-error']/div");
    }

    public WebElement errorCity() {
        return getVisibleOfElement("//div[@class='form-group field-ordercallform-city-modal required has-error']/div");
    }

    public WebElement errorPhone() {
        return getVisibleOfElement("//div[@class='form-group field-ordercallform-phone-modal required has-error']/div");
    }

    public WebElement errorEmail() {
        return getVisibleOfElement("//div[@class='form-group field-ordercallform-email-modal required has-error']/div");
    }
}
