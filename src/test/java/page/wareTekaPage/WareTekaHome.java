package page.wareTekaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class WareTekaHome extends BasePage {
    public WareTekaHome(WebDriver driver) {
        super(driver);
    }

    public void goWareTeka(){
        driver.get("https://wareteka.com.ua");
    }
    public WebElement getclickBtnService(){
        return getClickableElement("//div[@class='eael-offcanvas-toggle eael-offcanvas-toogle-cf1dfe6 elementor-button elementor-size-md']");
    }

    public WebElement registrForm(){
        return getVisibleOfElement("//div[@class='eael-offcanvas-content eael-offcanvas-content-cf1dfe6 eael-offcanvas-slide elementor-element-cf1dfe6 eael-offcanvas-content-right eael-offcanvas-content-visible']");
    }

    public WebElement regFormText(){
        return getVisibleOfElement("//div[@class='eael-offcanvas-widget-title']");
    }

}
