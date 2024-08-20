package ch03.lecture.p04logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
        // short-circuiting
        // 논리연산(&&, ||) 시
        // 왼쪽 피연산자에 의해 결과가 예측될 시 오른쪽 피연산자를 연산하지 않음
        boolean a = false && false;

        int b = 5;
        int c = 5;
        boolean d = (b++) < 0 && (c++) < 0; // 먼저 나온 연산만 계산하고 뒷 연산은 계산 x

        System.out.println("d = " + d);
        System.out.println("c = " + c);

        int e = 5;
        int f = 5;
        boolean g = (e++) < 0 & (f++) < 0; // 뒷 연산까지 계산하고 싶으면 & 하나만

    }
}
