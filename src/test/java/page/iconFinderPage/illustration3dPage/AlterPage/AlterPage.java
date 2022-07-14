package page.iconFinderPage.illustration3dPage.AlterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class AlterPage extends BasePage {
    public AlterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickRadioFree() {
        return getClickableElement("//label[@for='price-free']");
    }

    public WebElement getIllustration() {
        return getClickableElement("//img[@alt='christmas, christmas tree, gifts, presents, holidays ']");
    }

    public WebElement clickDownload() {
        return getClickableElement("//a[@class='btn btn-block btn-primary py-3 download-link-1-7247189-512-False']");
    }

}
