package page;

import org.openqa.selenium.WebDriver;
import page.CheckLowPrise;

public class GoPageWitcher3 extends CheckLowPrise {
    public GoPageWitcher3(WebDriver driver) {
        super(driver);
    }

    public void w3Page() {
        driver.get("https://www.xbox-now.com/ru/game/4473/the-witcher-3-wild-hunt");
    }
}
