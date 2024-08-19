package ch02.lecture.p03string;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열 %s%n", "이름 등등");
        System.out.printf("형식 문자열 여러개 %s, %s%n", "첫 번째", "두 번째");

        System.out.printf("형식 %10s%10s%n", "abc", "def");
        System.out.printf("형식 %-10s%-10s%n", "abc", "def"); // 왼쪽 정렬

        // %d : 정수(byte, short, int, long) 출력
        System.out.printf("정수%d, %d\n", 345, 678);
        System.out.printf("정수%10d, %10d\n", 345, 678);
        System.out.printf("정수%-10d, %-10d\n", 345, 678);

        // %f : 실수(float, double) 출력
        System.out.printf("실수%f, %f\n", 3.14, 9.1234);
        System.out.printf("실수%10f, %10f\n", 3.14, 9.1234);
        System.out.printf("실수%-10f, %-10f\n", 3.14, 9.1234);
        System.out.printf("실수%010f, %010f\n", 3.14, 9.1234); // 남은 공간 0으로 채우기
        System.out.printf("실수%010.1f, %010.3f\n", 3.14, 9.1234); // 소수점 뒷자리

    }
}
