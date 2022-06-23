package test.xboxNow;

import lombok.SneakyThrows;
import lombok.ToString;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DealsPageXboXNow;
import page.GoPageWitcher3;
import page.HomePageXboXNow;
import test.AbstractTestInit;
import page.CheckLowPrise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;

public class TestXboxSite extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void testXStore() {
        HomePageXboXNow homePageXboXNow = new HomePageXboXNow(driver);
        homePageXboXNow.goXboXNow();
        homePageXboXNow.openDeals().click();
        DealsPageXboXNow dealsPageXboXNow = new DealsPageXboXNow(driver);
        dealsPageXboXNow.dealsGame();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        dealsPageXboXNow.getClickBtnWitcher3().get(13).click();

        Assert.assertTrue(dealsPageXboXNow.getdisplayedBtnWitcher3().isDisplayed());
        Assert.assertTrue(dealsPageXboXNow.getdisplayedBtnWitcher3().isEnabled());
    }

    @Test
    public void checkSomeSmallPrice() {
        GoPageWitcher3 goPageWitcher3 = new GoPageWitcher3(driver);
        goPageWitcher3.w3Page();
        CheckLowPrise checkLowPrise = new CheckLowPrise(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ArrayList<Double> deleteRUB = new ArrayList<>();
        js.executeScript("window.scrollBy(0,800)", "");
        for (WebElement element : checkLowPrise.checkSmallPrice()) {
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
