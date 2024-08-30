package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone(); // x

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}

abstract class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    Phone(String owner) {
        this.owner = owner;
    }

    // 메소드 선언
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}

class SmartPhone extends Phone {
    // 생성자 선언
    SmartPhone(String owner) {
        // Phone 생성자 호출
        super(owner);
    }

    // 메소드 선언
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
