package test.steamTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.steamPage.SteamStorePage;
import test.AbstractTestInit;

public class SteamStoreTest extends AbstractTestInit {

    @Test
    public void steamTest (){
        SteamStorePage steamStorePage = new SteamStorePage(driver);
        steamStorePage.goSteam();
        steamStorePage.getSearchFiled().sendKeys("Call of Duty\n");
        steamStorePage.getCoDWWII().click();
        steamStorePage.enterAge();
        steamStorePage.enterMonth();
        steamStorePage.enterYear();
        steamStorePage.viewPage().click();
        steamStorePage.bundleInfo().click();

        Assert.assertEquals(steamStorePage.bandleSize().size(), 40);
    }


}
