package test.iconFilderTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.iconFinderPage.IconFinderHomePage;
import test.AbstractTestInit;

public class IconFinderPageTest extends AbstractTestInit {

    @Test
    public void btnTestTC() {
        IconFinderHomePage iconFinderHomePage = new IconFinderHomePage(driver);
        iconFinderHomePage.goToIconF();
        iconFinderHomePage.icons().click();

        Assert.assertTrue(iconFinderHomePage.isDispleyIcons());
    }
}
