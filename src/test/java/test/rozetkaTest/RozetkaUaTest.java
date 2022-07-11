package test.rozetkaTest;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.rozetkaPage.*;
import test.AbstractTestInit;

public class RozetkaUaTest extends AbstractTestInit {

    @Test
    public void runRozetka() {
        UserElementRozetkaPage userElementRozetkaPage = new UserElementRozetkaPage(driver);
        userElementRozetkaPage.goToRozetkaUa();
    }

    @Test
    public void logInRozetka() {
        UserElementRozetkaPage userElementRozetkaPage = new UserElementRozetkaPage(driver);
        userElementRozetkaPage.goToRozetkaUa();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserBtn().click();
        loginPage.enterEmail().sendKeys("sergadovlol@gmail.com");
        loginPage.enterPass().sendKeys("Loljspikeqqq1488");
        Actions actions = new Actions(driver);
        int xOffset = loginPage.getCheckBoxRemebmerMe().getSize().getWidth() / 3;
        actions.moveToElement(loginPage.getCheckBoxRemebmerMe(), -xOffset, 0).click().perform();
        loginPage.clickInput().click();

        Assert.assertTrue(userElementRozetkaPage.getdisplayedLogoUserBtn().isDisplayed());
        Assert.assertTrue(userElementRozetkaPage.getdisplayedEnterEmailLine().isDisplayed());
        Assert.assertTrue(userElementRozetkaPage.getdisplayedEnterPassLine().isDisplayed());
        Assert.assertFalse(userElementRozetkaPage.getdisplayedRememberMeCheckBox().isDisplayed());
        Assert.assertTrue(userElementRozetkaPage.getdisplayedInputBtn().isDisplayed());
    }

    @SneakyThrows
    @Test
    public void byProduct() {
        HomeElementRozetkaPage homeElementRozetkaPage = new HomeElementRozetkaPage(driver);
        homeElementRozetkaPage.goToRozetkaUa();
        homeElementRozetkaPage.getSearchLine().sendKeys("Laptop Xiaomi\n");
        ByNotebookPage byNotebookPage = new ByNotebookPage(driver);
        byNotebookPage.lowPrice();
        byNotebookPage.openPageMiNotebookPro15().click();
        byNotebookPage.addToBasket().click();
        Thread.sleep(4000);
        for (WebElement element : byNotebookPage.getClickSettingforGamer()) {
            element.click();
        }
        byNotebookPage.getCheckoutBusket().click();
        DoingOrderPage doingOrderPage = new DoingOrderPage(driver);
        doingOrderPage.enterUserInfo();
    }

    @SneakyThrows
    @Test
    public void byXiaomi() {
        HomeElementRozetkaPage homeElementRozetkaPage = new HomeElementRozetkaPage(driver);
        homeElementRozetkaPage.goToRozetkaUaCeckout();
        ByNotebookPage byNotebookPage = new ByNotebookPage(driver);
        byNotebookPage.addToBasket().click();
        byNotebookPage.getCheckoutBusket().click();
        Thread.sleep(4000);
        DoingOrderPage doingOrderPage = new DoingOrderPage(driver);
        doingOrderPage.enterUserInfo();
        doingOrderPage.getEnterYouCity().click();
        doingOrderPage.getCityOdessa().click();
        doingOrderPage.getEnterCityClick().click();
        doingOrderPage.getPostOffice().click();
        doingOrderPage.getAdressPostOffice().click();
        doingOrderPage.choiceUser().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(4000);
        doingOrderPage.getUserSurnameName().click();

        Assert.assertEquals(doingOrderPage.errorKirylicaSurname().getText(), "Введите свою фамилию на кириллице");
        Assert.assertEquals(doingOrderPage.errorKirylicaName().getText(), "Введите свое имя на кириллице");
        Assert.assertEquals(doingOrderPage.errorPhoneNumber().getText(), "Введите номер мобильного телефона");
    }

    @SneakyThrows
    @Test
    public void displayProductElementsinPage() {
        HomeElementRozetkaPage homeElementRozetkaPage = new HomeElementRozetkaPage(driver);
        homeElementRozetkaPage.goToRozetkaUa();
        PlayStationListPage playStationListPage = new PlayStationListPage(driver);
        playStationListPage.getOpenPageforeGamers().get(18).click();
        playStationListPage.getconsolesPlayStation().click();
        playStationListPage.getClickcheckBoxPS5().click();
        Thread.sleep(4000);

        Assert.assertEquals(playStationListPage.getListElementPS5().size(), 17);
    }
}