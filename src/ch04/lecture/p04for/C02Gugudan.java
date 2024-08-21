package ch04.lecture.p04for;

import java.util.Scanner;

public class C02Gugudan {
    public static void main(String[] args) {
        // for문으로 구구단 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("단수 > ");
        int dan = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (i * dan));
        }
    }
}
