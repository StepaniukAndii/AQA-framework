package page.rozetkaPage;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class RozetkaSearchField extends HomeElementRozetka {

    public RozetkaSearchField(WebDriver driver) {
        super(driver);
    }

    //створюємо метод який ми будемо використовувати у тесті і підставляти в тестах потрібні нам параметри

    public void getSearchField(String str) {
        //найперше робимо обєкт класу, а далі що він поступово має робити
        RozetkaSearchField rozetkaSearchField = new RozetkaSearchField(driver);
        rozetkaSearchField.goToRozetkaUa();
        rozetkaSearchField.getSearchLine().sendKeys(str + "\n");
    }

    public void getSearchField() {
        //найперше робимо обєкт класу, а далі що він поступово має робити
        getSearchLine().sendKeys(RandomStringUtils.randomAlphabetic(5) + "\n");
    }

}

//Отже, тут створив метод який вводить слово в пошуці, потім зробив overload (перезагрузку) метода
//В перезагруженому методі використали райндомайзер, і вже в тесті викликаємо цей метод
