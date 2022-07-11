package test.steamTest;

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


    }

}
