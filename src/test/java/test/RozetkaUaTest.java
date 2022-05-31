package test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ElementRozetka;
import pageObject.LoginPage;

public class RozetkaUaTest extends AbstractTestInit {

    @Test
    public void runRozetka() {
        ElementRozetka elementRozetka = new ElementRozetka(driver);
        elementRozetka.goToRozetkaUa();
    }

    @Test
    public void logInRozetka() {
        ElementRozetka elementRozetka = new ElementRozetka(driver);
        elementRozetka.goToRozetkaUa();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserBtn().click();
        loginPage.enterEmail().sendKeys("sergadovlol@gmail.com");
        loginPage.enterPass().sendKeys("Loljspikeqqq1488");
        Actions actions = new Actions(driver);
        int xOffset = loginPage.getCheckBoxRemebmerMe().getSize().getWidth() / 3;
        actions.moveToElement(loginPage.getCheckBoxRemebmerMe(), -xOffset, 0).click().perform();
        loginPage.clickInput().click();

        Assert.assertTrue(elementRozetka.displayedLogoUserBtn().isDisplayed());
        Assert.assertTrue(elementRozetka.displayedEnterEmailLine().isDisplayed());
        Assert.assertTrue(elementRozetka.displayedEnterPassLine().isDisplayed());
        Assert.assertTrue(elementRozetka.displayedRememberMeCheckBox().isDisplayed());
        Assert.assertTrue(elementRozetka.displayedInputBtn().isDisplayed());
    }
}
