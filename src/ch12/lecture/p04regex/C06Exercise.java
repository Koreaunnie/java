package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C06Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 전화번호 패턴과 같은지 확인
        // 010-9999-1111
        // 02-2345-6789
        // 031-123-4567

        String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("-을 포함한 전화번호 입력 > ");
            String input = scanner.next();

            if (Pattern.matches(pattern, input)) {
                System.out.println("전화번호 패턴이 일치합니다.");
            } else {
                System.out.println("전화번호 패턴이 일치하지 않습니다.");
            }
        }
    }
}
