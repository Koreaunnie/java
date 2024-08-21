package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        // Java 11 이전 문법 (고전적)
        char grade = 'c';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
