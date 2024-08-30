package ch07.sec07.exam01;

class A {
}

class B extends A {

}

class C extends B {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // B b3 = e; // x
        // C c2 = d; // x

        // 참조값 확인
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));

        System.out.println(System.identityHashCode(a1));
        System.out.println(System.identityHashCode(a2));
        System.out.println(System.identityHashCode(a3));
        System.out.println(System.identityHashCode(a4));

        System.out.println(System.identityHashCode(b1));
        System.out.println(System.identityHashCode(c1));
    }
}