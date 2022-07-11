package test.iconFilderTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.iconFinderPage.IconFinderPage;
import test.AbstractTestInit;

public class IconFinderPageTest extends AbstractTestInit {

    @Test
    public void btnTestTC(){
        IconFinderPage iconFinderPage = new IconFinderPage(driver);
        iconFinderPage.goToIconF();
        iconFinderPage.icons().click();

        Assert.assertTrue(iconFinderPage.isDispleyIcons());
    }
}
