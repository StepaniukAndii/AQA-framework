package test.testRozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ChangeCatalogRozetka;
import page.HomeElementRozetka;
import test.AbstractTestInit;

public class TestChangeRoretkaCatalog extends AbstractTestInit {

    @Test
    //достаэмо ширину лышки і зрівнюємо чи помінялась вона після кліка
    public void getChangeCatalog() {
        ChangeCatalogRozetka changeCatalogRozetka = new ChangeCatalogRozetka(driver);
        changeCatalogRozetka.goToRozetkaUa();
        changeCatalogRozetka.getSearchLine().sendKeys("Холодильник\n");
        HomeElementRozetka homeElementRozetka = new HomeElementRozetka(driver);
        int smallIconCatalog = homeElementRozetka.getCatalogElement().getSize().getWidth();
        changeCatalogRozetka.getClickableElement("//button[@class='catalog-view__button ng-star-inserted']").click();
        int bigIconCatalog = homeElementRozetka.getCatalogElement().getSize().getWidth();

        Assert.assertTrue(smallIconCatalog < bigIconCatalog,
                "I expect catalog to change object size");
    }
}
