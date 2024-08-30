package ch07.sec05.exam02;

public class Car {
    // 필드 선언
    public int speed;

    // 메소드 선언
    public void speedUP() {
        speed += 1;
    }

    // final 메소드
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}

class SportsCar extends Car {
    @Override
    public void speedUP() {
        speed += 10;
    }

    // 오버라이딩 불가
    // @Override
    // public void stop() {
    //     System.out.println("스포츠카를 멈춤");
    //     speed = 0;
    // }
}
