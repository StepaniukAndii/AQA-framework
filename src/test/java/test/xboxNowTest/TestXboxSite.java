package test.xboxNowTest;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.xboxPage.CheckLowPrisePage;
import page.xboxPage.DealsXboXNowPage;
import page.xboxPage.GoWitcher3Page;
import page.xboxPage.HomeXboXNowPage;
import test.AbstractTestInit;

import java.util.ArrayList;

public class TestXboxSite extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void testXStore() {
        HomeXboXNowPage homeXboXNowPage = new HomeXboXNowPage(driver);
        homeXboXNowPage.goXboXNow();
        homeXboXNowPage.openDeals().click();
        DealsXboXNowPage dealsXboXNowPage = new DealsXboXNowPage(driver);
        dealsXboXNowPage.dealsGame();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        dealsXboXNowPage.getClickBtnWitcher3().get(13).click();

        Assert.assertTrue(dealsXboXNowPage.getdisplayedBtnWitcher3().isDisplayed());
        Assert.assertTrue(dealsXboXNowPage.getdisplayedBtnWitcher3().isEnabled());
    }

    @Test
    public void checkSomeSmallPrice() {
        GoWitcher3Page goPageWitcher3 = new GoWitcher3Page(driver);
        goPageWitcher3.w3Page();
        CheckLowPrisePage checkLowPrisePage = new CheckLowPrisePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ArrayList<Double> deleteRUB = new ArrayList<>();
        js.executeScript("window.scrollBy(0,800)", "");
        for (WebElement element : checkLowPrisePage.checkSmallPrice()) {
            deleteRUB.add(Double.parseDouble(element.getText().replace(" RUB", "").replace(",", ".")));
        }
        double min = deleteRUB.get(0);
        for (Double d : deleteRUB) {
            if (d < min) {
                min = d;
            }
        }
        System.out.println(deleteRUB);
        System.out.println(min);

        Assert.assertEquals(min, 39.88);
    }
}
