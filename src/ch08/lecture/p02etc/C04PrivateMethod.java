package ch08.lecture.p02etc;

public class C04PrivateMethod {
}

interface MyInterface4 {
    default void method1() {
        System.out.println("어떤 코드 1");
        System.out.println("어떤 코드 2");
        System.out.println("어떤 코드 3");
    }

    default void method2() {
        extracted();
        System.out.println("어떤 코드 4");
    }

    private static void extracted() {
        System.out.println("어떤 코드 2");
        System.out.println("어떤 코드 3");
    }
}