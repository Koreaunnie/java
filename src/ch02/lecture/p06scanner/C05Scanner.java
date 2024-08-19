package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 > ");
        //nextLine : 엔터를 만날 때까지 스캔
        String line1 = scanner.nextLine();
        System.out.println("line1 = " + line1);

        System.out.print("세 단어 이상 입력 > ");
        // next : 빈칸을 만날 때까지 스캔
        String t1 = scanner.next();
        String t2 = scanner.next();
        String t3 = scanner.next();

    }
}

