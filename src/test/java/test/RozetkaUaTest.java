package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ElementRozetka;

public class RozetkaUaTest extends AbstractTestInit {

    @Test
    public void runRozetka() {
        ElementRozetka elementRozetka = new ElementRozetka(driver);
        elementRozetka.goToRozetkaUa();
        Assert.fail();
    }
}
