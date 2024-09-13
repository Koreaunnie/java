package ch17.lecture.p3intermediate;

import java.util.List;

import static java.util.Collections.reverseOrder;

public class C06Sorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(6, 1, 9, 0, 10, 2, 3, 7);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("- Comparator 사용 -");
        list.stream()
                .sorted((a, b) -> a - b)
                .forEach(System.out::println);

        System.out.println("- Comparator.reverseOrder 사용 -");
        list.stream()
                .sorted(reverseOrder())
                .forEach(System.out::println);
    }
}
