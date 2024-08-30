package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

    }
}

class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 기본 생성자 선언
    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }
}

class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
