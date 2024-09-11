package ch15.lecture.p09unmodifiable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01Unmodifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("son", "lee", "kim");
        System.out.println(list1);
        // list1.add("hwang"); // 실행 안 됨

        Set<String> set1 = Set.of("a", "b", "c");
        System.out.println(set1);
        // set1.add("d"); // 실행 안 됨

        Map<String, String> map1 = Map.of("son", "토트넘", "lee", "파리"); // 짝수 개 넣어야함 (key, value)
        System.out.println(map1);
        // map1.replace("hong", "감독"); // 실행 안 됨

        System.out.println("다음 코드");
    }
}
