package test.rozetkaTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.rozetkaPage.ChangeLanguagePage;
import test.AbstractTestInit;


public class TestLanguage extends AbstractTestInit {

    @Test
    public void getLanguageRU() {
        ChangeLanguagePage changeLanguagePage = new ChangeLanguagePage(driver);
        changeLanguagePage.goToRozetkaUa();
        changeLanguagePage.langRu().click();

        Assert.assertTrue(driver.getPageSource().contains("ы"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/");
    }

    @Test
    public void getLanguageUA() {
        ChangeLanguagePage changeLanguagePage = new ChangeLanguagePage(driver);
        changeLanguagePage.goToRozetkaUa();
        changeLanguagePage.langUa().click();

        Assert.assertTrue(driver.getPageSource().contains("ї"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/ua/");
    }

    @Test
    public void checkLanguageInBurgerBtnUA() {
        ChangeLanguagePage changeLanguagePage = new ChangeLanguagePage(driver);
        changeLanguagePage.goToRozetkaUa();
        changeLanguagePage.clickBurgerBtn().click();
        changeLanguagePage.clickChangeLangUA().click();

        Assert.assertTrue(driver.getPageSource().contains("ї"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/ua/");
    }

    @Test
    public void checkLanguageInBurgerBtnRU() {
        ChangeLanguagePage changeLanguagePage = new ChangeLanguagePage(driver);
        changeLanguagePage.goToRozetkaUa();
        changeLanguagePage.clickBurgerBtn().click();
        changeLanguagePage.clickChangeLangRU().click();

        Assert.assertTrue(driver.getPageSource().contains("ы"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/");
    }
}
