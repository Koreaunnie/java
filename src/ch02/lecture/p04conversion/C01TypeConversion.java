package ch02.lecture.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        // type conversion(형변환)

        // 자동 : 작은 공간의 값 -> 큰 공간
        // 강제 : 큰 공간의 값 -> 작은 공간

        // 자동
        // 정수형 사이
        int a = 30000;
        long b = a; // 자동 형변환 ok
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 강제
        short c = (short) a; // 자동 형변환 xxx, 강제 형변환 ok
        System.out.println("c = " + c);

        int d = 21_0000_0000;
        short e = (short) d; // 강제 형변환, 값을 잃을 수 있음
        System.out.println("e = " + e);
    }
}
