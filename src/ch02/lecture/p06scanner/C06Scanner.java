package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C06Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 한 줄에 띄어서 입력 > ");

        // String n1 = scanner.next();
        // String n2 = scanner.next();

        // int v1 = Integer.parseInt(n1); // nextLine은 parseInt로 변환해야하지만
        // int v2 = Integer.parseInt(n2); // next에는 변환하는 기능이 있음

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        System.out.println("더한 값 = " + (v1 + v2));
    }
}
