package test.wareTeka;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.WareTekaHome;
import test.AbstractTestInit;

public class WTHomeBtn extends AbstractTestInit {

    @Test
    public void clickBtnService(){
        WareTekaHome wareTekaHome = new WareTekaHome(driver);
        wareTekaHome.goWareTeka();
        wareTekaHome.getclickBtnService().click();

        Assert.assertTrue(wareTekaHome.getclickBtnService().isDisplayed());
        Assert.assertTrue(wareTekaHome.registrForm().isDisplayed());
        Assert.assertEquals(wareTekaHome.regFormText().getText(), "Замовити індивідуальний розрахунок вартості послуг");
    }
}
