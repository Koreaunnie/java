package ch02.lecture.p06scanner;

import java.awt.geom.FlatteningPathIterator;
import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        // 실수 두 개 받아서 더한 값
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 1 > ");
        String num1 = scanner.nextLine();

        System.out.print("실수 2 > ");
        String num2 = scanner.nextLine();

        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);

        System.out.println("더한 결과: " + (n1 + n2));
    }
}
