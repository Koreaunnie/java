package ch04.lecture.p04for;

public class C05Gugudan {
    public static void main(String[] args) {
        // 구구단 9단부터 2단까지

        for (int i = 9; i >= 2; i--) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(STR."\{i} X \{j} = \{i * j}");
            }
        }
    }
}
