package ch09.lecture.p01anonymous;

public class C03Anonymous {
    public static void main(String[] args) {
        MyInterface3 o = new MyInterface3() {
            @Override
            public void someMethod() {
                System.out.println("재정의 메소드");
            }
        };
    }
}

interface MyInterface3 {
    // public abstract
    void someMethod();
}