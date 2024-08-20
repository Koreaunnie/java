package ch03.lecture.p05priority;

public class C01Priority {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 책 107쪽

        int a = 3 + 5 * 2;
        System.out.println("a = " + a);

        // 먼저 연산되는 부분은 ()로 감싸기
        int b = 3 + (5 * 2);
        System.out.println("b = " + b);

        int c = (3 + 5) * 2;
        System.out.println("c = " + c);
    }
}
