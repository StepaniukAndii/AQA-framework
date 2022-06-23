package test;

import helper.Browser;
import helper.SelectBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import listner.TestListener;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

        String browser = System.getProperty("browser");
        if (browser == null || browser.equals("chrome")) {
            driver = SelectBrowser.setUpDriver(Browser.CHROME);
        } else if (browser.equals("opera")){
            driver = SelectBrowser.setUpDriver(Browser.OPERA);
        } else if (browser.equals("firefox"))
            driver = SelectBrowser.setUpDriver(Browser.FIREFOX);

        logger.info("Finish set up driver");
        driver.manage().window().setSize(new Dimension(1920, 1080));
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


