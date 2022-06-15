package test.testRozetka;

import org.testng.annotations.Test;
import page.RozetkaSortList;
import test.AbstractTestInit;

public class TestChangePriceLowToHide extends AbstractTestInit {

    @Test
    public void checkChangeSortPrice(){
       RozetkaSortList rozetkaSortList = new RozetkaSortList(driver);
       rozetkaSortList.goToRozetkaUa();
       rozetkaSortList.getPrintInSearchLine("Ноутбук");
    }
}
