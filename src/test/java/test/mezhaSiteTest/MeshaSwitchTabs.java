package test.mezhaSiteTest;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import page.mezhaPage.SwitchTabsPage;
import test.AbstractTestInit;

import java.util.ArrayList;

public class MeshaSwitchTabs extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void TestSwitchTabs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        SwitchTabsPage switchTabsPage = new SwitchTabsPage(driver);
        switchTabsPage.goSiteMezha();
        js.executeScript("window.scrollBy(0,7000)");
        switchTabsPage.clickTwitterBtn().click();
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        switchTabsPage.clickFaceBookBtn().click();
        Thread.sleep(4000);
        ArrayList<String> tabs2 = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(4000);
        ArrayList<String> tabs3 = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        Thread.sleep(3000);
        ArrayList<String> tabs4 = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(0));
        switchTabsPage.clickInstagramBtn().click();
        ArrayList<String> tabs5 = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(0));
        Thread.sleep(3000);
        ArrayList<String> tabs6 = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs6.get(3));
    }
}
