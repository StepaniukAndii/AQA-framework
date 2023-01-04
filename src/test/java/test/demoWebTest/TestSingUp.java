package test.demoWebTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoWebPage.RegisterPage;
import test.AbstractTestInit;

public class TestSingUp extends AbstractTestInit {

    @Test
    public void checkRegister() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToTestShop();
        registerPage.clickReg().click();
        registerPage.radioMale().click();
        registerPage.getEntrFirstName().sendKeys(createRandomNumber() + "TestUserName");
        registerPage.getEntrLastName().sendKeys(createRandomNumber() + "TestUserLastName");
        registerPage.getEntrEmail().sendKeys(createRandomNumber() + "sergadovlol@gmail.com");
        registerPage.getEntrPass().sendKeys(registerPage.pass());
        registerPage.getEntrConfirmPass().sendKeys(registerPage.pass());
        registerPage.getRegisterBtn().click();

        Assert.assertEquals(getUrl(), "http://demowebshop.tricentis.com/registerresult/1");

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------Test SingUp Ends---------------------");
        System.out.println("---------------------------------------------------------");
    }
}
