package page.xboxPage;

import org.openqa.selenium.WebDriver;

public class GoWitcher3Page extends CheckLowPrisePage {
    public GoWitcher3Page(WebDriver driver) {
        super(driver);
    }

    public void w3Page() {
        driver.get("https://www.xbox-now.com/ru/game/4473/the-witcher-3-wild-hunt");
    }
}
