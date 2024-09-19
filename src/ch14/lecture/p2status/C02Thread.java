package ch14.lecture.p2status;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("스레드 1#####");
            }
        });
        t1.start();
        t1.join(); // t1 스레드가 끝나기를 기다림 (C01에서는 섞여서 실행)
        for (int i = 0; i < 10; i++) {
            System.out.println("메인 스레드 @@@@@@");
        }
    }
}
