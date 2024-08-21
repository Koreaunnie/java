package ch04.lecture.p02switch;

public class C11SwitchExpression {
    public static void main(String[] args) {
        // 1~3 정수
        int n = (int) (Math.random() * 3) + 1;

        // 1 -> 1등급
        // 2 -> 2등급
        // 3 -> 3등급
        // 그외 등급

        System.out.println(switch (n) { // print 안에도 넣을 수 있음
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            default -> "그외";
        } + "등급");
    }
}
