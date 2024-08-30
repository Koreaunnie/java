package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 변환
        Parent parent = new Child();

        // Parent 타입으로 필드와 메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
        parent.field2 = "data2" // 불가능
        parent.method3(); // 불가능
         */

        // 갈제 타입 변환
        Child child = (Child) parent;

        // Child 타입으로 필드와 메소드 사용
        child.field2 = "data2"; // 가능
        child.method3(); // 가능
    }
}

class Parent {
    // 필드 선언
    public String field1;

    // 메소드 선언
    public void method1() {
        System.out.println("Parent-method1()");
    }

    // 메소드 선언
    public void method2() {
        System.out.println("Parent-method2()");
    }
}

class Child extends Parent {
    // 필드 선언
    public String field2;

    // 메소드 선언
    public void method3() {
        System.out.println("child-method3()");
    }
}