package ch06.lecture.p03method;

public class C11Return {
    public static void main(String[] args) {

    }
}

class MyClass11 {
    public void method1() {

    }

    public int method2() {
        System.out.println("어떤 명령문...");
        boolean a = true;

        if (a) {
            return 3;
        }
        return 4;
    }
}