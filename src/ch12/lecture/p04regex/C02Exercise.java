package ch12.lecture.p04regex;

import java.util.Scanner;

public class C02Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 6개의 숫자로 이루어진 문자열인지 확인하는 코드

        String check = "[0-9][0-9][0-9][0-9][0-9][0-9]";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("입력 > ");
            String num = scanner.next();

            if (num.matches(check)) {
                System.out.println("6개의 숫자로 이루어진 문자열입니다.");
            } else {
                System.out.println("6개의 숫자로 이루어진 문자열이 아닙니다.");
            }
        }
    }
}
