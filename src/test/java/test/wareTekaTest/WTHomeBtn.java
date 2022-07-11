package test.wareTekaTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.wareTekaPage.WareTekaHomePage;
import test.AbstractTestInit;

public class WTHomeBtn extends AbstractTestInit {

    @Test
    public void clickBtnService(){
        WareTekaHomePage wareTekaHomePage = new WareTekaHomePage(driver);
        wareTekaHomePage.goWareTeka();
        wareTekaHomePage.getclickBtnService().click();
        Assert.assertTrue(wareTekaHomePage.getclickBtnService().isDisplayed());
        Assert.assertTrue(wareTekaHomePage.registrForm().isDisplayed());
        Assert.assertEquals(wareTekaHomePage.regFormText().getText(), "Замовити індивідуальний розрахунок вартості послуг");
    }
}
