package ch04.lecture.p04for;

public class C03Gugudan {
    public static void main(String[] args) {
        // 구구단 2단부터 9단까지
        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{j} X \{i} = \{j * i}");
            }
        }
    }
}
