package ch07.lecture.p04cast;

public class C03InstanceOf {
    public static void main(String[] args) {
        Parent3 a = new Child31();

        if (a instanceof Child31) {
            Child31 b = (Child31) a; // ok
        }

        if (a instanceof Child32) {
            Child32 c = (Child32) a; // x
        }

        System.out.println("다음 코드");
    }
}

// @formatter: off
class Parent3 {
}

class Child31 extends Parent3 {
}

class Child32 extends Parent3 {
}