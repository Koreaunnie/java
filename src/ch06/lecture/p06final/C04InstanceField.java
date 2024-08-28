package ch06.lecture.p06final;

public class C04InstanceField {
    public static void main(String[] args) {
    }
}

class MyClass04 {

    // final instance field(변수)는 생성자에서 또는 직접 초기화해야함
    int a; // 초기값 0
    final int b = 3; // final은 초기값을 반드시 할당해야함
    final int c;

    MyClass04() {
        c = 9; // 생성자를 통해 필드 초기화 가능
    }

    MyClass04(String a) {
        c = 99;
    }
}