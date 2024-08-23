package ch05.exercise;

import java.util.Scanner;

public class Solution92 {
    public static void main(String[] args) {
        // 강사님 코드

        int[] scores = new int[0];
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("""
                    ------------------------------------------
                    1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
                    ------------------------------------------
                    """);
            System.out.print("선택>");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    //학생 수 입력받기
                    System.out.print("학생수>");
                    int numberOfStudents = scanner.nextInt();
                    scores = new int[numberOfStudents];
                }
                case 2 -> {
                    // 점수 입력 받기
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "] > ");
                        scores[i] = scanner.nextInt();
                    }
                }
                case 3 -> {
                    // 점수리스트 출력
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                }
                case 4 -> {
                    // 최고점수, 평균 점수 구해서 출력하기
                    int max = 0;
                    double sum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    double avg = sum / scores.length;
                    System.out.println("최고 점수:" + max);
                    System.out.println("평균 점수:" + avg);
                }
                case 5 -> {
                    // 종료
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
