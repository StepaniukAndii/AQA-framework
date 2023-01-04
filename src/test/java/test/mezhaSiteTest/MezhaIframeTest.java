package test.mezhaSiteTest;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.mezhaPage.MezhaIframePage;
import test.AbstractTestInit;


public class MezhaIframeTest extends AbstractTestInit {

    public Object[][] dataP() {
        return new Object[][] {
                {"superuser", "12345"},
                {"admin", "12345"},
                {"user", "12345"}
        };
    }

    @SneakyThrows
    @Test(dataProvider = "dataP")
    public void mezhaIframe(String user, String pass) {
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
