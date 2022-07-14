package test.iconFilderTest;

import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.iconFinderPage.IconFinderHomePage;
import page.iconFinderPage.illustration3dPage.AlterPage.AlterPage;
import page.iconFinderPage.illustration3dPage.Illustration3dPage;
import test.AbstractTestInit;

import java.io.File;
import java.util.Objects;

public class DownloadFunctionTest extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void DownloadTest() {
        IconFinderHomePage iconFinderHomePage = new IconFinderHomePage(driver);
        iconFinderHomePage.goToIconF();
        iconFinderHomePage.illustration3d().click();
        Illustration3dPage illustration3dPage = new Illustration3dPage(driver);
        illustration3dPage.clickAlter().click();
        AlterPage alterPage = new AlterPage(driver);
        alterPage.clickRadioFree().click();
        alterPage.getIllustration().click();
        alterPage.clickDownload().click();
        Thread.sleep(6000);

        File file = new File("C:/Users/Andrii/Downloads/");

        int count = 0;
        for (File f : Objects.requireNonNull(file.listFiles())) {
            if (f.getName().contains("7247189_christmas_christmas tree_gifts_presents_holidays_icon")) {
                count++;
                f.delete();
            }
        }
        Assert.assertEquals(count, 1);
    }
}
