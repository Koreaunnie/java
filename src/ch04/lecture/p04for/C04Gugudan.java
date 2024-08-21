package ch04.lecture.p04for;

public class C04Gugudan {
    public static void main(String[] args) {
        // 구구단 홀수단만 출력

        for (int i = 2; i <= 9; i++) {
            if (i % 3 == 0) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " X " + j + " = " + (i * j));
                }
            }
        }
    }
}
