package ch06.lecture.p04constructor;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(20, "lee");
        System.out.println(o.age);
        System.out.println(o.name);

        MyClass04 p = new MyClass04(20, "lee");
        System.out.println(p.age);
        System.out.println(p.name);
    }
}

class MyClass04 {
    int age;
    String name;

    MyClass04(int age, String name) {
        this.age = age;
        this.name = name;
    }
}