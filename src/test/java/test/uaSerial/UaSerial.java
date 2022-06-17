package test.uaSerial;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.UserLoginUaSer;
import test.AbstractTestInit;

public class UaSerial extends AbstractTestInit {

    @Test
    public void loginUaSerial(){
        UserLoginUaSer userLoginUaSer = new UserLoginUaSer(driver);
        userLoginUaSer.goToUaSerials();
        userLoginUaSer.btnLogin().click();
        userLoginUaSer.emailLine().sendKeys("matroskin966@gmail.com");
        userLoginUaSer.passWordLine().sendKeys("pwC8S_nPDFB6rMc");
        userLoginUaSer.clickLogin().click();

        Assert.assertTrue(userLoginUaSer.btnLogin().isDisplayed());
        Assert.assertTrue(userLoginUaSer.btnLogin().isEnabled());
        Assert.assertTrue(userLoginUaSer.emailLine().isDisplayed());
        Assert.assertTrue(userLoginUaSer.passWordLine().isDisplayed());
        Assert.assertTrue(userLoginUaSer.clickLogin().isDisplayed());
    }
}
