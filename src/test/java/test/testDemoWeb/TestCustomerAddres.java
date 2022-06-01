package test.testDemoWeb;

import org.testng.annotations.Test;
import pageObject.DemoWebCustomerInfo;
import pageObject.RegisterPage;
import test.AbstractTestInit;

public class TestCustomerAddres extends AbstractTestInit {

    @Test
    public void checkCustomerAdress() {
        DemoWebCustomerInfo demoWebCustomerInfo = new DemoWebCustomerInfo(driver);
        demoWebCustomerInfo.logIn();
        demoWebCustomerInfo.goToCustomerInfo();
        demoWebCustomerInfo.clickAdress().click();
        demoWebCustomerInfo.clickAddNew().click();
        demoWebCustomerInfo.getEntrFirstName().sendKeys(createRandomNumber() + "TestUserName");
        demoWebCustomerInfo.getEntrLastName().sendKeys(createRandomNumber() + "TestUserLastName");
        demoWebCustomerInfo.getEntrEmail().sendKeys(createRandomNumber() + "sergadovlol@gmail.com");
        demoWebCustomerInfo.clickDownList().click();
        demoWebCustomerInfo.clickIndia().click();
        demoWebCustomerInfo.getEntrCity().sendKeys("Mikolayiv");
        demoWebCustomerInfo.getEntrAdress1().sendKeys("nikolska");
        demoWebCustomerInfo.getEntrZipPostalcode().sendKeys("54001");
        demoWebCustomerInfo.getEntrPhoneNumber().sendKeys("0936192813");
        demoWebCustomerInfo.clickBtnSave();
    }
}
