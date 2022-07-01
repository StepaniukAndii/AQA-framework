package test.TestIframe;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MezhaTestIframe;
import test.AbstractTestInit;


public class IframeTest extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void mezhaIframe() {
        MezhaTestIframe mezhaTestIframe = new MezhaTestIframe(driver);
        mezhaTestIframe.goMezhaNews();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        mezhaTestIframe.playVideo();
        Thread.sleep(5500);
        mezhaTestIframe.stopVideo();
        double timeToVideo = Double.parseDouble(mezhaTestIframe.timeToVideo().getText().replace(":", "."));

        Assert.assertTrue(timeToVideo <= 0.07);
        Assert.assertTrue(timeToVideo >= 0.03);
    }
}
