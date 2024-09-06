package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        // list 전체 탐색 하기
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("git");
        list.add("sql");
        list.add("mybatis");

        // 고적 for
        System.out.println("--- 고전적 for ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 향상된 for (enhanced for)
        System.out.println("--- 향상된 for ---");
        for (String elem : list) {
            System.out.println(elem);
        }

        // iterator 사용
        System.out.println("--- Iterator ---");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // forEach 메소드
        System.out.println("--- forEach ---");
        // list.forEach(e -> System.out.println); // x
        list.forEach(System.out::println);
    }
}
