package test.testRozetka;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;
import test.AbstractTestInit;

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
        Assert.assertFalse(userElementRozetka.getdisplayedRememberMeCheckBox().isDisplayed());
        Assert.assertTrue(userElementRozetka.getdisplayedInputBtn().isDisplayed());
    }

    @SneakyThrows
    @Test
    public void byProduct() {
        HomeElementRozetka homeElementRozetka = new HomeElementRozetka(driver);
        homeElementRozetka.goToRozetkaUa();
        homeElementRozetka.getSearchLine().sendKeys("Laptop Xiaomi\n");
        ByNotebook byNotebook = new ByNotebook(driver);
        byNotebook.lowPrice();
        byNotebook.openPageMiNotebookPro15().click();
        byNotebook.addToBasket().click();
        Thread.sleep(4000);
        for (WebElement element : byNotebook.getClickSettingforGamer()) {
            element.click();
        }
        byNotebook.getCheckoutBusket().click();
        DoingOrderPage doingOrderPage = new DoingOrderPage(driver);
        doingOrderPage.enterUserInfo();
    }

    @SneakyThrows
    @Test
    public void byXiaomi() {
        HomeElementRozetka homeElementRozetka = new HomeElementRozetka(driver);
        homeElementRozetka.goToRozetkaUaCeckout();
        ByNotebook byNotebook = new ByNotebook(driver);
        byNotebook.addToBasket().click();
        Thread.sleep(4000);
        byNotebook.getCheckoutBusket().click();
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
        HomeElementRozetka homeElementRozetka = new HomeElementRozetka(driver);
        homeElementRozetka.goToRozetkaUa();
        PlayStationList playStationList = new PlayStationList(driver);
        playStationList.getOpenPageforeGamers().get(18).click();
        playStationList.getconsolesPlayStation().click();
        playStationList.getClickcheckBoxPS5().click();
        Thread.sleep(4000);

        Assert.assertEquals(playStationList.getListElementPS5().size(), 17);
    }
}