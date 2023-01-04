package test.demoWebTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.demoWebPage.DemoWebCustomerInfoPage;
import test.AbstractTestInit;

public class TestLogIn extends AbstractTestInit {

    @DataProvider
    public Object[][] dataP() {
        return new Object[][] {
                {"sergadovlol@gmail.com", "ewqasdcxz"},
                {"matroskin966@gmail.com", "StarLord191509"}
        };
    }

    @Test(dataProvider = "dataP")
    public void checkLogIn(String email, String pass) {
        DemoWebCustomerInfoPage demoWebCustomerInfoPage = new DemoWebCustomerInfoPage(driver);

        demoWebCustomerInfoPage.goToLigIn();
        demoWebCustomerInfoPage.getEntrEmailForLogin().sendKeys(email);
        demoWebCustomerInfoPage.getEntrPassForLogin().sendKeys(pass);
        demoWebCustomerInfoPage.getLogIn().click();

        Assert.assertEquals(demoWebCustomerInfoPage.expectedEmail().getText(), email);

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------Test LogIn Ends---------------------");
        System.out.println("---------------------------------------------------------");
    }
}
