package ch06.lecture.p04constructor;

public class C03Parameter {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03(1, "guest");
        MyClass03 o2 = new MyClass03(2, "hong");

        System.out.println(o1.age);
        System.out.println(o1.name);

        System.out.println(o2.age);
        System.out.println(o2.name);
    }
}

class MyClass03 {
    int age;
    String name;

    MyClass03(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
    }
}
