package ch16.lecture.p01lambda;

public class C09Parameter {
    public static void main(String[] args) {
        MyInterface9 o = (int x) -> System.out.println(x);
        o.method(999);

        // 파라미터 타입 생략 가능 (선호하는 방법)
        MyInterface9 p = (x) -> System.out.println(x * 2);
        p.method(5);

        // 파라미터 하나면 () 괄호 생략 가능
        MyInterface9 q = x -> System.out.println(x * x);
        q.method(3);

        MyInterface9 r = asdf -> System.out.println(asdf + asdf);
        r.method(7);
    }
}

interface MyInterface9 {
    void method(int x);
}
