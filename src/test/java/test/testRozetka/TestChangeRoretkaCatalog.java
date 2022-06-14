package test.testRozetka;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
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
////      driver.findElement(By.xpath("//ul[@class=\"catalog-grid ng-star-inserted\"]/li")).getSize().getWidth();
//        driver.findElement(By.xpath("//ul[@class=\"catalog-grid ng-star-inserted\"]/li")).getSize().getWidth();
        changeCatalogRozetka.getClickableElement("//button[@class='catalog-view__button ng-star-inserted']").click();
        int bigIconCatalog = homeElementRozetka.getCatalogElement().getSize().getWidth();

//        driver.findElement(By.xpath("//li[@class=\"catalog-grid__cell ng-star-inserted\"]")).getSize().getWidth();
//        //ввести очыкувану ширину ы фактичну. після кліка ширина має бути більша
////
//        Assert.assertEquals(homeElementRozetka.getOne(), homeElementRozetka.getTwo());
        Assert.assertTrue(smallIconCatalog < bigIconCatalog,
                "I expect catalog to change object size");

    }


//    public void getChangeCatalog(){
//        ChangeCatalogRozetka changeCatalogRozetka = new ChangeCatalogRozetka(driver);
//        changeCatalogRozetka.goToRozetkaUa();
//        changeCatalogRozetka.getSearchLine().sendKeys("Холодильник\n");
//        changeCatalogRozetka.getClickableElement("//button[@class=\"catalog-view__button ng-star-inserted\"]");
//    }
}
