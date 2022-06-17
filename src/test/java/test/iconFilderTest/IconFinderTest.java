package test.iconFilderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.IconFinder;
import test.AbstractTestInit;

public class IconFinderTest extends AbstractTestInit {

    @Test
    public void btnTestTC(){
        IconFinder iconFinder = new IconFinder(driver);
        iconFinder.goToIconF();
        iconFinder.close().click();
        iconFinder.icons().click();

        Assert.assertTrue(iconFinder.isDisplayClose());
        Assert.assertTrue(iconFinder.isDispleyIcons());
    }
}
