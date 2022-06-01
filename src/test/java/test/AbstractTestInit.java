package test;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        logger.info("Finish set up driver");
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

    public WebDriver getDriver() {
        return driver;
    }
}


