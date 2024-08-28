package ch06.lecture.p07package;

public class C02Package {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용시 패키지명을 모두 적어야함 (복잡, 불편)
        ch06.lecture.p07package.package1.MyClass01 o1 = new ch06.lecture.p07package.package1.MyClass01();

        System.out.println(o1);
    }
}
