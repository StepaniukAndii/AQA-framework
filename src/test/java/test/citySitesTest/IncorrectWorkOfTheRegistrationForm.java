package test.citySitesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.citySitesPage.HomeCityPage;
import page.citySitesPage.RegFormCitySitesPage;
import test.AbstractTestInit;

public class IncorrectWorkOfTheRegistrationForm extends AbstractTestInit {

    @Test(enabled = false) //TODO fix bug TDPC-17636
    public void errorFiledRegistration(){
        HomeCityPage homeCityPage = new HomeCityPage(driver);
        homeCityPage.goCitySites();
        homeCityPage.clickStartEarning().click();
        RegFormCitySitesPage regFormCitySitesPage = new RegFormCitySitesPage(driver);
        regFormCitySitesPage.enterNameFiled().sendKeys("@69By__21$");
        regFormCitySitesPage.enterCityFiled().sendKeys("435345");
        regFormCitySitesPage.enterPhoneFiled().sendKeys("GoToMars");
        regFormCitySitesPage.enterEmailFiled().sendKeys("991_buba@lolkek.com");
        regFormCitySitesPage.getClickCheckBox().click();
        regFormCitySitesPage.getClickSend().click();

        Assert.assertEquals(regFormCitySitesPage.errorName().getText(), "Як до вас звертатись?");
        Assert.assertEquals(regFormCitySitesPage.errorCity().getText(), "Ви не обрали місто");
        Assert.assertEquals(regFormCitySitesPage.errorPhone().getText(), "Вкажіть номер телефону");
        Assert.assertEquals(regFormCitySitesPage.errorEmail().getText(), "Ви не вказали email");

    }
}
