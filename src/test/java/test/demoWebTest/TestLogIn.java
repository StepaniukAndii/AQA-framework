package test.demoWebTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoWebPage.DemoWebCustomerInfoPage;
import test.AbstractTestInit;

public class TestLogIn extends AbstractTestInit {

    @Test
    public void checkLogIn() {
        DemoWebCustomerInfoPage demoWebCustomerInfoPage = new DemoWebCustomerInfoPage(driver);
        demoWebCustomerInfoPage.logIn();

        Assert.assertEquals(demoWebCustomerInfoPage.expectedEmail().getText(), "sergadovlol@gmail.com");
    }
}
