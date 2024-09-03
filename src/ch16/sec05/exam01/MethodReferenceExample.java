package ch16.sec05.exam01;

import ch08.sec10.exam01.C;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메소드일 경우
        // 람다식
        // person.action((x, y) -> Computer.staticMethod(x, y));
        // 메소드 참조
        person.action(Computer::staticMethod);

        // 인스턴스 메소드일 경우
        Computer com = new Computer();
        // 람다식
        // person.action((x, y) -> com.instanceMethod(x, y));
        //메소드 참조
        person.action(com::instanceMethod);
    }
}

@FunctionalInterface
interface Calcuable {
    double calc(double x, double y);
}

class Person {
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}

class Computer {
    public static double staticMethod(double x, double y) {
        return x + y;
    }

    public double instanceMethod(double x, double y) {
        return x + y;
    }
}