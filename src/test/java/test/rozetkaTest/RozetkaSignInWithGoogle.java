package test.rozetkaTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.rozetkaPage.LoginPage;
import page.rozetkaPage.UserElementRozetkaPage;
import test.AbstractTestInit;

import java.util.ArrayList;

public class RozetkaSignInWithGoogle extends AbstractTestInit {

    @Test
    public void signInWithGoogle(){
        UserElementRozetkaPage userElementRozetkaPage = new UserElementRozetkaPage(driver);
        userElementRozetkaPage.goToRozetkaUa();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserBtn().click();
        loginPage.getSignInGoogle().click();

        ArrayList<String> tabs = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        loginPage.enterEmailGoogle().sendKeys("morozok966@gmail.com\n");

        Assert.assertEquals(loginPage.notIncludedInTheAccountMessege().getText(), "Не вдається ввійти в обліковий запис");
    }
}
