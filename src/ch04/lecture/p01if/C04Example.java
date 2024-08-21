package ch04.lecture.p01if;

import java.util.Scanner;

import static java.lang.System.*;

public class C04Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("나이 > ");
        int age = scanner.nextInt();

        if (age >= 20) {
            out.println("성인입니다.");
        } else if (age >= 13) {
            out.println("청소년입니다.");
        } else if (age >= 6) {
            out.println("어린이입니다.");
        } else if (age >= 1) {
            out.println("유아입니다.");
        } else {
            System.out.println("나이를 잘못 입력하였습니다.");
        }
    }
}
