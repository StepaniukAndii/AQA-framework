package page.steamPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import page.BasePage;

public class SteamVerificationColorPage extends BasePage {
    public SteamVerificationColorPage(WebDriver driver) {
        super(driver);
    }

    public void goSteam() {
        driver.get("https://store.steampowered.com/");
    }

    public String bodyColor(){
        String color = driver.findElement(By.xpath("//body")).getCssValue("background-color");
        return color;
    }

    public String convertBodyColorToHex(){
        Color your_color = new Color(27, 40, 56, 1);

        String buf = Integer.toHexString(your_color.getColor().getRGB());
        String hex = "#"+buf.substring(buf.length()-6);
        return hex;
    }

    public String installBtnColor(){
        String installBtncolor = driver.findElement(By.xpath("//a[@class='header_installsteam_btn_content']")).getCssValue("background-color");
        return installBtncolor;
    }

    public String convertInstallBtnColorToHex(){
        Color your_color = new Color(92, 126, 16, 1);

        String buf = Integer.toHexString(your_color.getColor().getRGB());
        String hex = "#"+buf.substring(buf.length()-6);
        return hex;
    }
}
