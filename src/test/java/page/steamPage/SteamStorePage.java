package page.steamPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.BasePage;

import java.util.List;

public class SteamStorePage extends BasePage {
    public SteamStorePage(WebDriver driver) {
        super(driver);
    }

    public void goSteam() {
        driver.get("https://store.steampowered.com/");
    }

    public WebElement getSearchFiled() {
        return getVisibleOfElement("//input[@id='store_nav_search_term']");
    }

    public WebElement getCoDWWII() {
        return getClickableElement("//a[@href='https://store.steampowered.com/app/476600/Call_of_Duty_WWII/?snr=1_7_7_151_150_1']");
    }

    public void enterAge() {
        Select getAge = new Select(driver.findElement(By.xpath("//select[@id='ageDay']")));
        getAge.selectByValue("4");
    }

    public void enterMonth() {
        Select getAge = new Select(driver.findElement(By.xpath("//select[@id='ageMonth']")));
        getAge.selectByValue("October");
    }

    public void enterYear() {
        Select getAge = new Select(driver.findElement(By.xpath("//select[@id='ageYear']")));
        getAge.selectByValue("1995");
    }

    public WebElement viewPage() {
        return getClickableElement("//a[@id='view_product_page_btn']");
    }

    public WebElement bundleInfo() {
        return getClickableElement("//a[@href='https://store.steampowered.com/bundle/6465/Call_of_Duty_Franchise_Collection/?snr=1_5_9__403']");
    }

    public List<WebElement> bandleSize() {
        return getListPrecenceElement("//div[@class='bundle_package_item complete_the_set']");
    }
}
