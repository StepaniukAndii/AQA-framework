package test.testRozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.BasePage;

public class StringReverse {

    public static int sum(int a, int c) {
        return a + c;
    }

    @Test
    public void checkReverseString() {
        Assert.assertEquals(reverseStringForLoop("opq"), "adzip");
    }

    public String reverseStringForLoop(String str) {
        StringBuilder revString = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            revString.append(str.charAt(i));
        }

        return revString.toString();
    }

    @Test
    public void resultSum(){
        int resultSum = sum(1,5);
        System.out.println( resultSum);
    }



}
