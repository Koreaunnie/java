package ch02.lecture.p02type;

import java.math.BigDecimal;

public class C03Double {
    public static void main(String[] args) {
        // 불가
        double a = 0.1;
        double b = 0.2;
        double c = a + b; // 오류
        System.out.println("c = " + c);

        // 가능한 방법 예시 (각 회사마다 따르는 방법이 있음)
        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.add(e);
        System.out.println("f = " + f);

    }
}
