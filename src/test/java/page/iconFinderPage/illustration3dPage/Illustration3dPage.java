package page.iconFinderPage.illustration3dPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class Illustration3dPage extends BasePage {
    public Illustration3dPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickAlter() {
        return getClickableElement("//img[@alt='Alter - 201 3d-illustrations']");
    }
}
