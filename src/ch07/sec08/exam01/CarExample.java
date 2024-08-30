package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        // HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        // KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }

}

class Tire {
    // 메소드 선언
    public void roll() {
        System.out.println("회전합니다.");
    }
}

class HankookTire extends Tire {
    // 메소드 재정의 (오버라이딩)
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전합니다.");
    }
}

class KumhoTire extends Tire {
    // 메소드 재정의 (오버라이딩)
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다.");
    }
}

class Car {
    // 필드 선언
    public Tire tire;

    // 메소드 선언
    public void run() {
        // tire 필드에 대입된 객체의 roll() 메소드 호출
        tire.roll();
    }
}