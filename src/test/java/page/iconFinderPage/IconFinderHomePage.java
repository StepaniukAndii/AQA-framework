package page.iconFinderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class IconFinderHomePage extends BasePage {
    public IconFinderHomePage(WebDriver driver) {
        super(driver);
    }

    public void goToIconF() {
        driver.get("https://www.iconfinder.com/");
    }

    public WebElement close() {
        return getClickableElement("//button[@class='close p-4']");
    }

    public boolean isDisplayClose() {
        try {
            driver.findElement(By.xpath("//button[@class='close p-4']"));
            return false;
        } catch (NoSuchElementException e) {
            System.err.println("Icon Close click and not display");
            return true;
        }

    }

    public WebElement icons() {
        return getClickableElement("//li[@class='nav-item']//a[@href='/icons']");
    }

    public WebElement illustration3d() {
        return getClickableElement("//a[@href='/3d-illustrations'][@class='nav-link']");
    }

    public boolean isDispleyIcons() {
        try {
            driver.findElement(By.xpath("//li[@class='nav-item']//a[@href='/icons']")).isDisplayed();
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }
}
