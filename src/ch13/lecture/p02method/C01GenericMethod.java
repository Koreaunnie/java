package ch13.lecture.p02method;

import ch06.lecture.p07package.package1.MyClass01;

public class C01GenericMethod {
    public static void main(String[] args) {
        MyClass1 o = new MyClass1();
        o.<String>action1(); // 볼 일 없음
        o.<String>action2();
        String s = o.action2();
        o.<Integer>action2();
        Integer r1 = o.<Integer>action2();
        Integer r2 = o.action2();

        o.<String>action3("java"); // <String> 생략하여 아래처럼 작성
        o.action3("java");

        o.<Double, Long>action4(3.14, 5L);
        o.action4(3.14, 5L);
    }
}

class MyClass1 {
    // generic method : 타입파라미터가 있는 메소드
    public <T> void action1() {
    }

    public <T> T action2() {
        return null;
    }

    public <T> void action3(T param) {

    }

    public <T, U> void action4(T p1, U p2) {

    }

    public <T> T action5(T p1) {
        return null;
    }
}
