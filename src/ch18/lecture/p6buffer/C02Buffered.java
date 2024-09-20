package ch18.lecture.p6buffer;

import java.io.*;

public class C02Buffered {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output62.txt";

        OutputStream os = new FileOutputStream(name);
        OutputStream os2 = new BufferedOutputStream(os);

        byte[] data = new byte[100];

        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            os2.write(data);
        }
        long end = System.nanoTime();

        long time = end - start;
        System.out.println("time = " + time);

        os2.close();
    }
}
