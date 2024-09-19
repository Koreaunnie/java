package ch14.lecture.p3synchronized;

public class C02Thread {
    private static int value = 0;

    private static Object o = new Object(); // lock, monitor

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) {
                    value++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) {
                    value++;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value = " + value);
    }
}
