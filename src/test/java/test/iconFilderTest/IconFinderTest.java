package test.iconFilderTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.iconFinderPage.IconFinder;
import test.AbstractTestInit;

public class IconFinderTest extends AbstractTestInit {

    @Test
    public void btnTestTC(){
        IconFinder iconFinder = new IconFinder(driver);
        iconFinder.goToIconF();
        iconFinder.icons().click();

        Assert.assertTrue(iconFinder.isDispleyIcons());
    }
}
