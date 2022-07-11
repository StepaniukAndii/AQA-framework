package test.demoWebTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoWebPage.DemoWebCustomerInfoPage;
import test.AbstractTestInit;

import java.util.ArrayList;

public class TestBooks extends AbstractTestInit {

    @Test
    public void checkPriseOfBooks() {
        DemoWebCustomerInfoPage demoWebCustomerInfoPage = new DemoWebCustomerInfoPage(driver);
        demoWebCustomerInfoPage.logIn();
        demoWebCustomerInfoPage.clickBtnBooks();
        demoWebCustomerInfoPage.sortByHighToLow();
        ArrayList<Double> priceList = new ArrayList<>();
        for (WebElement good : demoWebCustomerInfoPage.checkSrot()) {
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
        System.out.println("Sorting High to Low" + " " + priceList);
        System.out.println("Max Price" + " " + maxPrice);
        System.out.println("Min Price" + " " + minPrice);

        Assert.assertEquals(maxPrice, 51.0);
        Assert.assertEquals(minPrice, 10.0);
    }
}
