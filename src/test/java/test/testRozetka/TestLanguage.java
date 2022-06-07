package test.testRozetka;

import org.testng.annotations.Test;
import page.ChangeLanguce;
import test.AbstractTestInit;



public class TestLanguage extends AbstractTestInit {

    @Test
    public void selectLenguege(){
        ChangeLanguce changeLanguce = new ChangeLanguce(driver);
        changeLanguce.goToRozetkaUa();
        changeLanguce.langRu().click();
    }


}
