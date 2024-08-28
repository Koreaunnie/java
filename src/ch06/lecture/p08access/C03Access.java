package ch06.lecture.p08access;

import ch06.lecture.p08access.package1.MyClass03;

public class C03Access {
    public static void main(String[] args) {
        MyClass03 o = new MyClass03();
        o.name = "son";
        // o.email = "abc"; // 불가
        // o.address = "seoul"; // 불가
    }
}
