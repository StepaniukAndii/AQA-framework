package page.mezhaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class SwitchTabsPage extends BasePage {
    public SwitchTabsPage(WebDriver driver) {
        super(driver);
    }

    public void goSiteMezha(){
        driver.get("https://mezha.media/");
    }

    public WebElement clickTwitterBtn(){
        return getClickableElement("//*[@href='https://twitter.com/MezhaMedia']");
    }

    public WebElement clickFaceBookBtn(){
        return getClickableElement("//*[@href='https://www.facebook.com/mezha.media/']");
    }

    public WebElement clickInstagramBtn(){
        return getClickableElement("//*[@href='https://www.instagram.com/mezha.media/']");
    }
}
