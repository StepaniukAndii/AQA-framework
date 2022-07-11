package test.MezhaSite;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.mezhaPage.MezhaTestIframe;
import test.AbstractTestInit;


public class MezhaIframeTest extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void mezhaIframe() {
        MezhaTestIframe mezhaTestIframe = new MezhaTestIframe(driver);
        mezhaTestIframe.goMezhaNewsIframe();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        mezhaTestIframe.playVideo();
        Thread.sleep(5500);
        mezhaTestIframe.stopVideo();
        double timeToVideo = Double.parseDouble(mezhaTestIframe.timeToVideo().getText().replace(":", "."));

        Assert.assertTrue(timeToVideo <= 0.07 && timeToVideo >= 0.03);
    }
}
