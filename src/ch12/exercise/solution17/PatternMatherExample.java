package ch12.exercise.solution17;

import java.util.regex.Pattern;

public class PatternMatherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-z][a-zA-Z0-9]{7,11}";
        boolean isMatch = Pattern.matches(id, regExp);

        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
