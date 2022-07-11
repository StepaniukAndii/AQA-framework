package test.rozetkaTest;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.rozetkaPage.RozetkaSortListPage;
import test.AbstractTestInit;

import java.util.ArrayList;

public class TestChangePriceLowToHide extends AbstractTestInit {

    @Test
    @SneakyThrows
    public void checkChangeSortPrice() {
        RozetkaSortListPage rozetkaSortList = new RozetkaSortListPage(driver);
        rozetkaSortList.goToRozetkaUa();
        rozetkaSortList.getPrintInSearchLine("Ноутбук");
        Thread.sleep(1000);
        ArrayList<Double> priceList = new ArrayList<>();
        for (WebElement good : rozetkaSortList.searchGoods()) {
            String textPrice = good.getText();
            String replaceText = textPrice.replace(" ", "");
            Double parseTextPriceInDouble = Double.parseDouble(replaceText);
            priceList.add(parseTextPriceInDouble);
        }

        double minPrice = priceList.get(0);
        double maxPrice = priceList.get(0);
        for (Double priceElememt : priceList) {
            if (priceElememt < minPrice) {
                minPrice = priceElememt;
            }
            if (priceElememt > maxPrice) {
                maxPrice = priceElememt;
            }
        }
        System.out.println(priceList);
        System.out.println(maxPrice);
        System.out.println(minPrice);

        double sum = 0;
        for (double elem : priceList) {
            sum = sum + elem;
        }

        System.out.println(sum / priceList.size());

        double sumNumber = 0;
        int cout = 0;
        for (double plusNumber : priceList) {
            if (plusNumber % 2 != 0) {
                sumNumber = plusNumber;
                System.out.println(sumNumber);
                cout++;
            }

        }
        System.out.println("count=" + cout);
    }
}
