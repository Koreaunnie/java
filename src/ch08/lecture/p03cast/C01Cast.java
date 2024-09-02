package ch08.lecture.p03cast;

public class C01Cast {
    public static void main(String[] args) {
        MyInterface1 o = new MyClass1();
        o.method1();
        // o.otherMethod(); // x

        // 강제현변환 (Cast)
        MyClass1 p = (MyClass1) o;
        p.otherMethod();
    }
}

// 강제 타입 변환 연산 (Cast, Casting)

interface MyInterface1 {
    void method1();
}

class MyClass1 implements MyInterface1 {
    @Override
    public void method1() {
        System.out.println("MyClass1.method1");
    }

    public void otherMethod() {
        System.out.println("MyClass1.otherMethod");
    }
}