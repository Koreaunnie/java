package ch09.lecture.p02nested;

public class C05FinalLocalVariable {
    public static void main(String[] args) {

    }
}


class MyClass5 {
    void some() {
        // local class에서 사용되는 local variable(지역 변수)은 final 이어야함
        // final 키워드 붙이지 않으면 effectively final
        final int a = 5;
        class Nested5 {
            void action() {
                System.out.println("a = " + a);
                // a = 6
            }
        }
        // a =7
        Nested5 o = new Nested5();
        o.action();
    }
}