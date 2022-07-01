package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MezhaTestIframe extends BasePage {
    public MezhaTestIframe(WebDriver driver) {
        super(driver);
    }

    public void goMezhaNews() {
        driver.get("https://mezha.media/2022/06/20/nezvychaynyy-svit-vid-disney-ukrainskyy-treyler/");
    }

    public WebElement iFrame() {
        return getPresentElement("//iframe[@class='embed-responsive-item lazy-loaded']");
    }

    public WebElement playToVideo() {
        return getClickableElement("//button[@class='ytp-large-play-button ytp-button']");
    }

    public void playVideo() {
        driver.switchTo().frame(iFrame());
        playToVideo().click();
    }

    public void stopVideo() {
        driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
    }

    public WebElement timeToVideo() {
        return getPresentElement("//span[@class='ytp-time-current']");
    }
}
