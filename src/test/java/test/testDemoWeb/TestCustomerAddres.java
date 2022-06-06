package test.testDemoWeb;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.DemoWebCustomerInfo;
import page.RegisterPage;
import test.AbstractTestInit;

public class TestCustomerAddres extends AbstractTestInit {

    @Test
    public void checkCustomerAdress() {
        DemoWebCustomerInfo demoWebCustomerInfo = new DemoWebCustomerInfo(driver);
        demoWebCustomerInfo.logIn();
        demoWebCustomerInfo.goToCustomerInfo();
        demoWebCustomerInfo.clickAdress().click();
        demoWebCustomerInfo.clickAddNew().click();
        String firstName = createRandomNumber() + "TestUserName";
        String lastName = createRandomNumber() + "TestUserLastName";
        demoWebCustomerInfo.getEntrFirstName().sendKeys(firstName);
        demoWebCustomerInfo.getEntrLastName().sendKeys(lastName);
        demoWebCustomerInfo.getEntrEmail().sendKeys(createRandomNumber() + "sergadovlol@gmail.com");
        demoWebCustomerInfo.clickDownList().click();
        demoWebCustomerInfo.clickIndia().click();
        demoWebCustomerInfo.getEntrCity().sendKeys("Mikolayiv");
        demoWebCustomerInfo.getEntrAdress1().sendKeys("nikolska");
        demoWebCustomerInfo.getEntrZipPostalcode().sendKeys("54001");
        demoWebCustomerInfo.getEntrPhoneNumber().sendKeys("0936192813");
        demoWebCustomerInfo.clickBtnSave().click();

        Assert.assertEquals(firstName + lastName, demoWebCustomerInfo.expectedFirstName().getText().replaceAll(" ", ""));
    }
}
