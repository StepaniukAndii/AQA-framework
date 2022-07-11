package test.testDemoWeb;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoWebPage.DemoWebCustomerInfo;
import test.AbstractTestInit;

public class TestLogIn extends AbstractTestInit {

    @Test
    public void checkLogIn() {
        DemoWebCustomerInfo demoWebCustomerInfo = new DemoWebCustomerInfo(driver);
        demoWebCustomerInfo.logIn();

        Assert.assertEquals(demoWebCustomerInfo.expectedEmail().getText(), "sergadovlol@gmail.com");
    }
}
