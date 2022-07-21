package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelectBrowser {
    public static DesiredCapabilities capabilities;

    public static WebDriver setUpDriver(Browser browser) {

        WebDriver driver = null;

        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(capabilities);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(capabilities);
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(capabilities);
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver(capabilities);
                break;
        }
        return driver;
    }
}
