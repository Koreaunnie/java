package ch18.exercise.solution07;

import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/exercise/solution07/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 1;
        String rowData;
        while (true) {
            rowData = br.readLine(); // 1행을 읽음
            if (rowData == null) break; // 더이상 읽을 내용이 없으면 while문 종료
            System.out.println(rowNumber + ": " + rowData);
            rowNumber++;
        }

        br.close();
        fr.close();
    }
}
