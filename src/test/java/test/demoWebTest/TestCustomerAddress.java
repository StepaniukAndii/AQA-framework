package test.demoWebTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoWebPage.DemoWebCustomerInfoPage;
import test.AbstractTestInit;

public class TestCustomerAddress extends AbstractTestInit {

    @Test
    public void checkCustomerAddress() {
        DemoWebCustomerInfoPage demoWebCustomerInfoPage = new DemoWebCustomerInfoPage(driver);
        demoWebCustomerInfoPage.logIn();
        demoWebCustomerInfoPage.goToCustomerInfo();
        demoWebCustomerInfoPage.clickAdress().click();
        demoWebCustomerInfoPage.clickAddNew().click();
        String firstName = createRandomNumber() + "TestUserName";
        String lastName = createRandomNumber() + "TestUserLastName";
        demoWebCustomerInfoPage.getEntrFirstName().sendKeys(firstName);
        demoWebCustomerInfoPage.getEntrLastName().sendKeys(lastName);
        demoWebCustomerInfoPage.getEntrEmail().sendKeys(createRandomNumber() + "sergadovlol@gmail.com");
        demoWebCustomerInfoPage.clickDownList().click();
        demoWebCustomerInfoPage.clickIndia().click();
        demoWebCustomerInfoPage.getEntrCity().sendKeys("Mikolayiv");
        demoWebCustomerInfoPage.getEntrAdress1().sendKeys("nikolska");
        demoWebCustomerInfoPage.getEntrZipPostalcode().sendKeys("54001");
        demoWebCustomerInfoPage.getEntrPhoneNumber().sendKeys("0936192813");
        demoWebCustomerInfoPage.clickBtnSave().click();

        Assert.assertEquals(firstName + lastName, demoWebCustomerInfoPage.expectedFirstName()
                .getText().replaceAll(" ", ""));

        demoWebCustomerInfoPage.deleteBtn().click();
        driver.switchTo().alert().accept();

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------Test Customer Address Ends---------------------");
        System.out.println("---------------------------------------------------------");


    }
}
