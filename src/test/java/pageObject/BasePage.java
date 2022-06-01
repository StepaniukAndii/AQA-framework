package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement weitVisibleOfElement(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public WebElement getClickableElement(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
        return waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public List<WebElement> getListVisibleElement(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
        return waitClick.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public WebElement getPresentElement(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
        return waitClick.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
}