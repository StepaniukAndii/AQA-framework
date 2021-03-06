package test.rozetkaTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.rozetkaPage.RozetkaSearchFieldPage;
import test.AbstractTestInit;

public class TestSearchField extends AbstractTestInit {
    //створюємо обєкт класу в якому у нас лижать заготовлені методи для цього теста
    //викликаэмо в обэкта метод який ми прописали в класі RozetkaSearchField
    //В дужках або передаємо слово яке ми хочемо наприклад "MAC" або воно автоматично згенерує що небуть
    @Test
    public void checkSearchResult() {
        RozetkaSearchFieldPage rozetkaSearchField = new RozetkaSearchFieldPage(driver);
        rozetkaSearchField.getSearchField("Mac");

        Assert.assertEquals(driver.getCurrentUrl(), "https://rozetka.com.ua/search/?text=Mac");
        //зрівняли юрл який ми отримали і який очікували
    }

}
