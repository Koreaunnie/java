package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();
    }
}

class A {
    // 인스턴스 맴버 클래스
    class B {
    }

    // 인스턴스 필드값으로 B 객체 대입
    B field = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}