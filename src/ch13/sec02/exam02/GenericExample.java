package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}

interface Rentable<P> {
    P rent();
}

class Home {
    public void turnOnLight() {
        System.out.println("전등을 켭니다.");
    }
}

class Car {
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}

class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}

class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car();
    }
}