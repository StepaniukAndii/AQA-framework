package test.steamTest;

import org.testng.annotations.Test;
import page.steamPage.SteamVerificationColor;
import test.AbstractTestInit;


public class SteamGetColorTest extends AbstractTestInit {

    @Test
    public void SteamDisplayedColor() {
        SteamVerificationColor steamVerificationColor = new SteamVerificationColor(driver);
        steamVerificationColor.goSteam();
        steamVerificationColor.bodyColor();
        steamVerificationColor.installBtnColor();

//        System.out.println("Background Body Color " + steamVerificationColor.bodyColor());
        System.out.println("Background Body Color " + steamVerificationColor.convertBodyColorToHex());

//        System.out.println("Background Install Btn Color " + steamVerificationColor.installBtnColor());
        System.out.println("Background Install Btn Color " + steamVerificationColor.convertInstallBtnColorToHex());


    }

}
