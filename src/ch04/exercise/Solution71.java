package ch04.exercise;

import java.util.Scanner;

public class Solution71 {
    public static void main(String[] args) {
        // 내 코드

        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택 > ");

            String strNum = scanner.next();
            if (strNum.equals("1")) {
                System.out.print("예금액 > ");
                balance += scanner.nextInt();
            } else if (strNum.equals("2")) {
                System.out.print("출금액 > ");
                balance -= scanner.nextInt();
            } else if (strNum.equals("3")) {
                System.out.println("잔고 > " + balance);
            } else if (strNum.equals("4")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
