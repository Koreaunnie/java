package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        // SmartPhon의 필드 읽기
        System.out.println("와이파이 상태: " + myPhone.wifi);

        // Phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동 인데요.");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
    }
}


class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}

class SmartPhone extends Phone {
    // 필드 선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 메소드 선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}