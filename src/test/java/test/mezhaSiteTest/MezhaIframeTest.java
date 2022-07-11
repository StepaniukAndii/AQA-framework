package test.mezhaSiteTest;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.mezhaPage.MezhaIframePage;
import test.AbstractTestInit;


public class MezhaIframeTest extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void mezhaIframe() {
        MezhaIframePage mezhaIframePage = new MezhaIframePage(driver);
        mezhaIframePage.goMezhaNewsIframe();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        mezhaIframePage.playVideo();
        Thread.sleep(5500);
        mezhaIframePage.stopVideo();
        double timeToVideo = Double.parseDouble(mezhaIframePage.timeToVideo().getText().replace(":", "."));

        Assert.assertTrue(timeToVideo <= 0.07 && timeToVideo >= 0.03);
    }
}
