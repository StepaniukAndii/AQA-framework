package test.rozetkaTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.rozetkaPage.ChangeCatalogRozetkaPage;
import page.rozetkaPage.HomeElementRozetkaPage;
import test.AbstractTestInit;

public class TestChangeRoretkaCatalog extends AbstractTestInit {

    @Test
    //достаэмо ширину лышки і зрівнюємо чи помінялась вона після кліка
    public void getChangeCatalog() {
        ChangeCatalogRozetkaPage changeCatalogRozetkaPage = new ChangeCatalogRozetkaPage(driver);
        changeCatalogRozetkaPage.goToRozetkaUa();
        changeCatalogRozetkaPage.getSearchLine().sendKeys("Холодильник\n");
        HomeElementRozetkaPage homeElementRozetkaPage = new HomeElementRozetkaPage(driver);
        int smallIconCatalog = homeElementRozetkaPage.getCatalogElement().getSize().getWidth();
        changeCatalogRozetkaPage.getClickableElement("//button[@class='catalog-view__button ng-star-inserted']").click();
        int bigIconCatalog = homeElementRozetkaPage.getCatalogElement().getSize().getWidth();

        Assert.assertTrue(smallIconCatalog < bigIconCatalog,
                "I expect catalog to change object size");
    }
}
