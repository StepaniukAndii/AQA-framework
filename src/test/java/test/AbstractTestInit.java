package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class AbstractTestInit {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}


