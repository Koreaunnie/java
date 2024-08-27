package ch06.lecture.p03method;

public class C09Varargs {
    public static void main(String[] args) {

    }
}

class MyClass09 {
    // Varargs를 다른 타입과 섞어 쓸 땐 가장 마지막에 작성
    public void method1(String n, int... a) {
    }

    // public void method1(int... a, String n) { // 불가
    // }
}