package test.rozetkaTest;

import lombok.SneakyThrows;
import org.testng.annotations.Test;
import page.rozetkaPage.LoginPage;
import test.AbstractTestInit;

import java.util.ArrayList;

public class TestRozetkaTabSwitch extends AbstractTestInit {

    @SneakyThrows
    @Test
    public void checkRztkTabSwitch() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://rozetka.com.ua/");

        loginPage.getUserBtn().click();
        loginPage.getSingInGoogle().click();
        Thread.sleep(1000);

        ArrayList<String> tabs = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));


        loginPage.getInputEmail();
        Thread.sleep(1000);
    }
}
