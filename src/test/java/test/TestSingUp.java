package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.RegisterPage;

public class TestSingUp extends AbstractTestInit{

    @Test
    public void testRegister(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToTestShop();
        registerPage.clickReg().click();
        registerPage.radioMale().click();
        registerPage.getEntrFirstName().sendKeys(createRandomNumber() + "TestUserName");
        registerPage.getEntrLastName().sendKeys(createRandomNumber() + "TestUserLastName");
        registerPage.getEntrEmail().sendKeys(createRandomNumber() + "sergadovlol@gmail.com");
        registerPage.getEntrPass().sendKeys("ewqasdcxz");
        registerPage.getEntrConfirmPass().sendKeys("ewqasdcxz");
        registerPage.getRegisterBtn().click();

        Assert.assertTrue(getUrl().contains("http://demowebshop.tricentis.com/registerresult/1"));
    }
}
