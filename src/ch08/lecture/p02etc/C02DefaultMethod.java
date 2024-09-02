package ch08.lecture.p02etc;

public class C02DefaultMethod {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        o.method1();
        o.method2();

        MyInterface2 p = new MyClass22();
        o.method1();
        o.method2();
    }
}

interface MyInterface2 {
    void method1();

    // 코드블럭 (메소드 몸총, body)이 있는 인터페이스의 메소드
    // 코드블럭이 있어 추상메소드 x
    // 기존 추상메소드는 하위클래스에서 재정의해야하므로 귀찮을 때 사용
    // 필요하면 재정의도 가능
    // public 생략 가능
    default void method2() {
        System.out.println("MyInterface2.method2");
    }
}

class MyClass21 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass21.method1");
    }
}

class MyClass22 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass22.method1");
    }
}