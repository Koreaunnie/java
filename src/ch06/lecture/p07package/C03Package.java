package ch06.lecture.p07package;

import ch06.lecture.p07package.package1.MyClass01;

public class C03Package {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용 시
        // import에 명시하여 C02Package와 다르게 패키지명 줄여서 쓸 수 있음
        MyClass01 o1 = new MyClass01();

        System.out.println(o1);
    }
}
