package ch18.lecture.p2input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class C03InputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt"; // 13 bytes

        try (InputStream is = new FileInputStream(name)) {
            byte[] data = new byte[5];

            System.out.println(Arrays.toString(data));

            int r1 = is.read(data);
            System.out.println(Arrays.toString(data));

            int r2 = is.read(data);
            System.out.println(Arrays.toString(data));

            int r3 = is.read(data);
            System.out.println(Arrays.toString(data));

            int r4 = is.read(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
