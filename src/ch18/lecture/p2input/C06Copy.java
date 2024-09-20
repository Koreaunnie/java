package ch18.lecture.p2input;

import java.io.*;

public class C06Copy {
    public static void main(String[] args) {
        String origin = "C:/Temp/펭귄.jpg";
        String target = "C:/Temp/펭귄3.jpg";

        try {
            InputStream is = new FileInputStream(origin);
            OutputStream os = new FileOutputStream(target);

            try (is; os) {
                is.transferTo(os);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
