package test.testRozetka;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.RozetkaSortList;
import test.AbstractTestInit;

import java.util.ArrayList;
import java.util.List;

public class TestChangePriceLowToHide extends AbstractTestInit {

    @Test
    @SneakyThrows
    public void checkChangeSortPrice() {
        RozetkaSortList rozetkaSortList = new RozetkaSortList(driver);///створив обэкт класу до якого буду звертатись, де в мене заготовлены методи
        rozetkaSortList.goToRozetkaUa();
        rozetkaSortList.getPrintInSearchLine("Ноутбук");//ввожу в пошуку на розетці
//        rozetkaSortList.clickSortPrice();//зайти на rozetkaSortList, там є класний метод який робить дропдаун випадаючого списка
        Thread.sleep(1000); //метод в якому тест зупиняэться на 1 секунду 1000 це мылысекунди
        ArrayList<Double> priceList = new ArrayList<>();
        for (WebElement good : rozetkaSortList.searchGoods()) {
            String textPrice = good.getText();
            String replaceText = textPrice.replace(" ", "");
            Double parseTextPriceInDouble = Double.parseDouble(replaceText);
            priceList.add(parseTextPriceInDouble);
        }

        double minPrice = priceList.get(0);//ПЕРЕМІННІЙ МІН ТИПУ ДОБЛ ПРИСВОЮЄМО ЗНАЧЕННЯ ПЕРШОГО ЕЛЕМЕНТУ З ЛИСТА
        double maxPrice = priceList.get(0);
        for (Double priceElememt : priceList) {//СТВОРЮЄМО ЗМІННУ priceElememt яка працює з аррей лістом ліст
            if (priceElememt < minPrice) {//Запуск циклу який крутить цикл і зрівнює кожен буліан ( цін товару) і шукає який з них менший, цикл зупиниться коли найде найменше значення і запише це значення в перемінну манпрайс
                minPrice = priceElememt;
            }
            if (priceElememt > maxPrice) {//аналогічно як зверху тільки шукає найбільше значення
                maxPrice = priceElememt;
            }
        }
        System.out.println(priceList);
        System.out.println(maxPrice);
        System.out.println(minPrice);

        double sum = 0;//змінній сум присвоюємо значення 1 елемента в листі
        for (double elem : priceList) {
            sum = sum + elem;// змінній сум присвоюємо що вона буде добавляти кожен наступний елемент
        }

        System.out.println(sum / priceList.size());//виводимо середнє арефметичне з отриманою суми всії елементів


        double sumNumber = 0; //створюємо змінну яка приймає 1 елемент по індексу і на основі якої працює цикл
        int cout = 0;//змінна компелятор
        for (double plusNumber : priceList) {//створюємо змінну пласнамбер яка буде брати результат з ліста прайсліст
            if (plusNumber % 2 == 0) { // запускаємо цикл в якому ми змінну пласнамбер(в яку по циклу вкладається новий елемент з ліста) та задаємо фнкц ділення без остачі
                sumNumber = plusNumber;// тут ми вказуємо що має виконуватись у циклі після того як цикл перебрався і поділився
                System.out.println(sumNumber);
                cout++; //включаємо компелятор який нам покаже скільки разів у нас пройшов цикл
            }

        }
        System.out.println("count=" + cout);//присвоюємо каунту значення каунта з компелятором, і отримуємо результат скільки в нас є товарів з цілою ціною(по факту скільки разів виконався цикл)


//        ArrayList<Double> list = new ArrayList<>();//створюємо масив(лист) в <вказуємо який тип він приймає>
//        for (WebElement element : rozetkaSortList.searchTesting()) {
//            String text = element.getText();//створюємо змінну стрінгового типу якій присвоюємо значення елемент у якого викликаємо метод отримати текст
//            String replaceText = text.replace(" ", "")//створюємо змінну реплейстекст якій присвоюємо змінну text, ака вже отримала текст через gettext метод вище, і забир пробіл
//            Double parseDouble = Double.parseDouble(replaceText);//мінняємо тип на дабл
//            list.add(parseDouble);//додаємо в масив(list той що ArrayList<Double> list ... той результат який ми отримали від цих методів, тепер list має у собі ту інфу що треба нам
//        }

//        double sum = 0;
//        for (double elm : list) {
//
//            sum += elm;
//            //або як по іншому можна було це записати????
//        }
//
//        System.out.println(sum);


        //розберись як працює цей цикл!!!

//        List<String> list = new ArrayList<>();
//        list.add("Vovaef");
//        list.add("Vovaefe");
//        list.add("Vovaefef");
//        list.add("Vovafeef");
//        list.add("hsaljfovaqfwf");
//
//
//        for (String el : list) {
//            System.out.println(el.startsWith("V"));
//        }


//        for (int i = 0; i < list.size(); i++) {
//            if (i + 1 < list.size()) {
//                if (list.get(i) > list.get(i + 1)) {
//                    Assert.fail("Price " + list.get(i) + " more than " + list.get(i + 1));
//                }
//            } else {
//                break;
//            }
//        }
    }
}
