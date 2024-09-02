package ch08.sec03;

public class RemoteControlExample {
    public static void main(String[] args) {
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MIN_VOLUME);
    }
}

interface RemoteControl {
    // 상수 선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}