package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class C02Reader {
    public static void main(String[] args) throws Exception {
        String name = "C:/Temp/output33.txt";
        Reader reader = new FileReader(name);

        char[] data = new char[5];
        System.out.println(Arrays.toString(data));

        reader.read(data);
        System.out.println(Arrays.toString(data));

        reader.read(data);
        System.out.println(data[0]);
        System.out.println(Arrays.toString(data));

        reader.close();
    }
}
