package test.TidexcomTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.tidexPage.TidexPage;
import test.AbstractTestInit;

public class TidexTest extends AbstractTestInit {

    @Test
    public void checkTableSize() {

        TidexPage tidexPage = new TidexPage(driver);
        tidexPage.goTidex();
        tidexPage.iframeSwitchSizeBtn();
        int weightMax = tidexPage.getMaxTablet().getSize().getWidth();
        int heightMax = tidexPage.getMaxTablet().getSize().getHeight();
        tidexPage.clickSwitchSizeBtn().click();
        int weightMin = tidexPage.getMinTablet().getSize().getWidth();
        int heightMin = tidexPage.getMaxTablet().getSize().getHeight();


        System.out.println(weightMax + " " + "weightMax");
        System.out.println(" " + heightMax + " " + "heightMax");
        System.out.println(" " + weightMin + " " + "weightMin");
        System.out.println(" " + heightMin + " " + "heightMin");

        Assert.assertTrue(weightMax > weightMin, "682 < 1436");
        Assert.assertTrue(heightMax > heightMin, "328 < 524");
    }
}
