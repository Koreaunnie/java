package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C05Quantifier {
    public static void main(String[] args) {
        // {n} : n개
        String p1 = "[0-9]{3}";
        System.out.println(matches(p1, "010")); // true
        System.out.println(matches(p1, "999")); // true
        System.out.println(matches(p1, "abc")); // false
        System.out.println(matches(p1, "a99")); // false
        System.out.println(matches(p1, "3")); // false
        System.out.println(matches(p1, "3333")); // false

        // 예제 : 010-1234-1234
        String p2 = "\\d{3}-\\d{4}-\\d{4}";
        System.out.println(matches(p2, "010-1234-5678")); // true
        System.out.println(matches(p2, "010-123-456")); // false

        // {n,m} : n~m개
        String p3 = "\\p{IsHangul}{3,4}";
        System.out.println(matches(p3, "손흥민")); // true
        System.out.println(matches(p3, "제갈공명")); // true
        System.out.println(matches(p3, "가나")); // false
        System.out.println(matches(p3, "가나다라마")); // false

        // {n,} : n개 이상
        // ? : {0, 1}
        // * : {0, }
        // + : {1, }
    }
}
