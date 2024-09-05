package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C07Group {
    public static void main(String[] args) {
        // () : 그룹

        String p1 = "x+";
        System.out.println(matches(p1, "x")); // true
        System.out.println(matches(p1, "xx")); // true
        System.out.println(matches(p1, "xxx")); // true

        String p2 = "(abc)+";
        System.out.println(matches(p2, "abc")); // true
        System.out.println(matches(p2, "abcabc")); // true

        String p3 = "(011)*"; // * : {0,)
        System.out.println(matches(p3, "")); // true
        System.out.println(matches(p3, "011")); // true
        System.out.println(matches(p3, "011011")); // true
    }
}
