package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("Cot");
        lis.add("Bob");
        lis.add("Tom");

//        for (String str : lis) {
//            System.out.println(str);
//        }

        lis.stream()
                .filter(str -> str.contains("o"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
