package test;

import helper.Browser;
import helper.SelectBrowser;
import listner.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class AbstractTestInit {

    protected WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(AbstractTestInit.class);

    @BeforeMethod
    public void setup() {
        logger.info("Start set up driver");
        String headless = System.getProperty("headless");
        if (headless == null) {
            headless = "";
        }
        ChromeOptions chromeOptions = new ChromeOptions();
        if (headless.contains("true")) {
            chromeOptions.setHeadless(true);
        }
        SelectBrowser.capabilities = new DesiredCapabilities(chromeOptions);

        String browser = System.getProperty("browser");
        if (browser == null || browser.equals("chrome")) {
            driver = SelectBrowser.setUpDriver(Browser.CHROME);
        } else if (browser.equals("edge")) {
            driver = SelectBrowser.setUpDriver(Browser.EDGE);
        } else if (browser.equals("firefox")) {
            driver = SelectBrowser.setUpDriver(Browser.FIREFOX);
        } else if (browser.equals("opera"))
            driver = SelectBrowser.setUpDriver(Browser.OPERA);

        logger.info("Finish set up driver");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected long createRandomNumber() {
        return System.currentTimeMillis();
    }

    protected String getUrl() {
        return driver.getCurrentUrl();
    }
}


