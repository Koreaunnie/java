package ch06.lecture.p08access;

public class C01Access {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();
        o.method1();
        // o.method2(); // private라 접근 불가
    }
}

class MyClass01 {
    // 필드
    // 생성자
    // 메소드
    void method1() {
        method2();
    }

    private void method2() {
        System.out.println("어떤 일...");
    }
}