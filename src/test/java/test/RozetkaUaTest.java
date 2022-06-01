package test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ByNotebook;
import pageObject.HomeElementRozetka;
import pageObject.UserElementRozetka;
import pageObject.LoginPage;

public class RozetkaUaTest extends AbstractTestInit {

    @Test
    public void runRozetka() {
        UserElementRozetka userElementRozetka = new UserElementRozetka(driver);
        userElementRozetka.goToRozetkaUa();
    }

    @Test
    public void logInRozetka() {
        UserElementRozetka userElementRozetka = new UserElementRozetka(driver);
        userElementRozetka.goToRozetkaUa();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserBtn().click();
        loginPage.enterEmail().sendKeys("sergadovlol@gmail.com");
        loginPage.enterPass().sendKeys("Loljspikeqqq1488");
        Actions actions = new Actions(driver);
        int xOffset = loginPage.getCheckBoxRemebmerMe().getSize().getWidth() / 3;
        actions.moveToElement(loginPage.getCheckBoxRemebmerMe(), -xOffset, 0).click().perform();
        loginPage.clickInput().click();

        Assert.assertTrue(userElementRozetka.getdisplayedLogoUserBtn().isDisplayed());
        Assert.assertTrue(userElementRozetka.getdisplayedEnterEmailLine().isDisplayed());
        Assert.assertTrue(userElementRozetka.getdisplayedEnterPassLine().isDisplayed());
        Assert.assertTrue(userElementRozetka.getdisplayedRememberMeCheckBox().isDisplayed());
        Assert.assertTrue(userElementRozetka.getdisplayedInputBtn().isDisplayed());
    }

    @Test
    public void byProduct() {
        HomeElementRozetka homeElementRozetka = new HomeElementRozetka(driver);
        homeElementRozetka.goToRozetkaUa();
        homeElementRozetka.getSearchLine().sendKeys("Ноутбук Xiaomi\n");
        ByNotebook byNotebook = new ByNotebook(driver);
        byNotebook.lowPrice();

//        byNotebook.getSortList().get(1).click();
        //изменить getSortList прочитать про Select (https://www.guru99.com/select-option-dropdown-selenium-webdriver.html)
    }
}
