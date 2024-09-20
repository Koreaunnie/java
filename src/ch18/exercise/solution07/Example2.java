package ch18.exercise.solution07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example2 {
    private static int lineNumber = 0;

    public static void main(String[] args) {
        String filePath = "src/ch18/exercise/solution07/Example.java";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            try (fr; br) {
                br.lines()
                        .map(s -> "%4d : %s".formatted(++lineNumber, s))
                        .forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
