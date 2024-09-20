package ch18.exercise.solution10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // 원본 파일 경로와 복사 파일 경로를 입력받고
        // 원본 파일을 복사하는 프로그램 만들기

        try {
            // 원본 파일 경로와 복사 파일 경로를 입력받기
            Reader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            Scanner scanner = new Scanner(System.in);

            System.out.print("원본 파일 경로: ");
            String origin = scanner.next();
            System.out.print("복사 파일 경로: ");
            String target = scanner.next();

            File fileOrigin = new File(origin);
            File fileTarget = new File(target);


            if (fileOrigin.exists()) {
                // 복사 파일 경로에서 디렉토리가 존재하지 않으면
                File parentDir = fileTarget.getParentFile();
                if (!parentDir.exists()) {
                    parentDir.mkdirs(); // 경로상의 모든 디렉토리를 생성
                }

                // 파일 복사
                FileInputStream fis = new FileInputStream(origin);
                FileOutputStream fos = new FileOutputStream(target);

                BufferedInputStream is = new BufferedInputStream(fis);
                BufferedOutputStream os = new BufferedOutputStream(fos);

                try (os; is; fos; fis) {
                    is.transferTo(os);
                    os.flush();
                }

                System.out.println("복사가 성공되었습니다.");
            } else {
                // 원본 파일이 존재하지 않은 경우 "원본 파일이 존재하지 않습니다." 출력
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
