package test.steamTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.steamPage.SteamVerificationColorPage;
import test.AbstractTestInit;


public class SteamGetColorTest extends AbstractTestInit {

    @Test
    public void SteamDisplayedColor() {
        SteamVerificationColorPage steamVerificationColorPage = new SteamVerificationColorPage(driver);
        steamVerificationColorPage.goSteam();
        steamVerificationColorPage.bodyColor();
        steamVerificationColorPage.installBtnColor();

//        System.out.println("Background Body Color " + steamVerificationColor.bodyColor());
        System.out.println("Background Body Color " + steamVerificationColorPage.convertBodyColorToHex());

//        System.out.println("Background Install Btn Color " + steamVerificationColor.installBtnColor());
        System.out.println("Background Install Btn Color " + steamVerificationColorPage.convertInstallBtnColorToHex());

        Assert.assertTrue(steamVerificationColorPage.convertBodyColorToHex().contains("#1b2838"));
        Assert.assertTrue(steamVerificationColorPage.convertInstallBtnColorToHex().contains("#5c7e10"));
    }



}
