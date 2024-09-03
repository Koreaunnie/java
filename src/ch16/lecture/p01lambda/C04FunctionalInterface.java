package ch16.lecture.p01lambda;

public class C04FunctionalInterface {
    public static void main(String[] args) {


    }
}

// Functional Interface
// @FunctionalInterface 어노테이션으로 맞는지 검사 가능 (Override 처럼)
@FunctionalInterface
interface MyInterface4 {
    void method1();
}

// Functional Interface X
interface MyInterface42 {
}

// Functional Interface X
interface MyInterface43 {
    void method1();

    void method2();
}


interface MyInterface44 {
    // 추상메소드 추가만 안되고 나머지는 가능 (추상메소드는 기존 거만 오버라이드 가능)
    int MAX_VALUE = 100;

    void method1();

    default void method2() {
    }

    ;

    private void method3() {
    }

    ;

    static void method4() {
    }

    ;

    private static void method5() {
    }

    ;
}