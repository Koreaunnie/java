package ch07.lecture.p02override;

public class C02Override {
}

class Parent02 {
    public void method1() {
        System.out.println("Parent02.method1");
    }

    public void method2() {
        System.out.println("Parent02.method2");
    }
}

class Child02 extends Parent02 {
    // @Override : Override annotation (애노테이션)
    @Override
    public void method1() {
        System.out.println("Child02.method1");
    }

    // 인텔리제이 단축키
    // 1. 상위클래스 메소드명 일부 작성하면 됨
    // 2. alt + insert
    @Override
    public void method2() {
        super.method2();
    }
}