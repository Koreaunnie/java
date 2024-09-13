package ch17.exercise.solution05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "JAva8 supports lambda expressions"
        );


        System.out.println("- 고전적 반복문 -");
        for (String item : list) {
            if (item.toLowerCase().contains("java")) {
                System.out.println(item);
            }
        }

        System.out.println("- 스트림 이용 -");
        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
