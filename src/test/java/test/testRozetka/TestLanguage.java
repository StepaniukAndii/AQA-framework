package test.testRozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ChangeLanguage;
import test.AbstractTestInit;


public class TestLanguage extends AbstractTestInit {

    @Test
    public void selectLanguageRU(){
        ChangeLanguage changeLanguage = new ChangeLanguage(driver);
        changeLanguage.goToRozetkaUa();
        changeLanguage.langRu().click();

        Assert.assertTrue(driver.getPageSource().contains("ы"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/");
    }

    @Test
    public void selectLanguageUA(){
        ChangeLanguage changeLanguage = new ChangeLanguage(driver);
        changeLanguage.goToRozetkaUa();
        changeLanguage.langUa().click();

        Assert.assertTrue(driver.getPageSource().contains("ї"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/ua/");
    }

    ////////////burger btn check///////////////////////
    @Test
    public void checkLanguageInBurgerBtnUA(){
        ChangeLanguage changeLanguage = new ChangeLanguage(driver);
        changeLanguage.goToRozetkaUa();
        changeLanguage.clickBurgerBtn().click();
        changeLanguage.clickChangeLangUA().click();

        Assert.assertTrue(driver.getPageSource().contains("ї"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/ua/");
    }

    @Test
    public void checkLanguageInBurgerBtnRU(){
        ChangeLanguage changeLanguage = new ChangeLanguage(driver);
        changeLanguage.goToRozetkaUa();
        changeLanguage.clickBurgerBtn().click();
        changeLanguage.clickChangeLangRU().click();

        Assert.assertTrue(driver.getPageSource().contains("ы"));
        Assert.assertEquals(getUrl(), "https://rozetka.com.ua/");
    }
}
