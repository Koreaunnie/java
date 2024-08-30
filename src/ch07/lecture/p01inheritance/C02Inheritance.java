package ch07.lecture.p01inheritance;

public class C02Inheritance {
    public static void main(String[] args) {

    }
}

class ParentClass02 {
    private String name;
    private int age;

    ParentClass02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드들...
}

class ChildClass02 extends ParentClass02 {
    ChildClass02(String name, int age) {
        // 부모클래스 필드에 직접 접근할 수 없기 때문에
        // 자식클래스 생성자에는
        // 꼭 부모클래스 생성자를 호출해서
        // 필드 초기화 해야함
        // this.name = name // 불가
        // this.age = age // 불가
        super(name, age);
    }

    void method() {
        // private 필드 접근 불가
        // this.name = "a";
        // this.age = 99;
    }
}