package page.mezhaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class MezhaIframePage extends BasePage {
    public MezhaIframePage(WebDriver driver) {
        super(driver);
    }

    public void goMezhaNewsIframe() {
        driver.get("https://mezha.media/2022/06/20/nezvychaynyy-svit-vid-disney-ukrainskyy-treyler/");
    }

    public WebElement iFrame() {
        return getPrecenceElement("//iframe[@class='embed-responsive-item lazy-loaded']");
    }

    public WebElement playToVideo() {
        return getClickableElement("//button[@class='ytp-large-play-button ytp-button']");
    }

    public MezhaIframePage playVideo() {
        driver.switchTo().frame(iFrame());
        playToVideo().click();
        return this;
    }

    public void stopVideo() {
        driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
    }

    public WebElement timeToVideo() {
        return getPrecenceElement("//span[@class='ytp-time-current']");
    }
}
