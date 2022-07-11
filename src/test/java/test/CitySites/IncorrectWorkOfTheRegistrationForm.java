package test.CitySites;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.citySitesPage.HomeCity;
import page.citySitesPage.RegFormCitySites;
import test.AbstractTestInit;

public class IncorrectWorkOfTheRegistrationForm extends AbstractTestInit {

    @Test(enabled = false) //TODO fix bug TDPC-17636
    public void errorFiledRegistration(){
        HomeCity homeCity = new HomeCity(driver);
        homeCity.goCitySites();
        homeCity.clickStartEarning().click();
        RegFormCitySites regFormCitySites = new RegFormCitySites(driver);
        regFormCitySites.enterNameFiled().sendKeys("@69By__21$");
        regFormCitySites.enterCityFiled().sendKeys("435345");
        regFormCitySites.enterPhoneFiled().sendKeys("GoToMars");
        regFormCitySites.enterEmailFiled().sendKeys("991_buba@lolkek.com");
        regFormCitySites.getClickCheckBox().click();
        regFormCitySites.getClickSend().click();

        Assert.assertEquals(regFormCitySites.errorName().getText(), "Як до вас звертатись?");
        Assert.assertEquals(regFormCitySites.errorCity().getText(), "Ви не обрали місто");
        Assert.assertEquals(regFormCitySites.errorPhone().getText(), "Вкажіть номер телефону");
        Assert.assertEquals(regFormCitySites.errorEmail().getText(), "Ви не вказали email");

    }
}
