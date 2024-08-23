package ch05.exercise;

import java.util.Scanner;

public class Solution91 {
    public static void main(String[] args) {
        // 내 코드

        Scanner scanner = new Scanner(System.in);

        int totalStudents = 0;
        int[] scores = new int[0];
        int highestScore = 0;
        double avgScore = 0;
        double totalScore = 0;
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택 > ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    // 학생수 입력
                    System.out.print("학생수 > ");
                    totalStudents = scanner.nextInt();
                }
                case 2 -> {
                    // 점수 입력
                    scores = new int[totalStudents];

                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "] > ");
                        scores[i] = scanner.nextInt();
                    }
                }
                case 3 -> {
                    // 점수 리스트 출력
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                }
                case 4 -> {
                    // 최고 점수 출력
                    for (int i = 0; i < scores.length; i++) {
                        if (highestScore < scores[i]) {
                            highestScore = scores[i];
                        }
                    }

                    // 평균 점수 출력
                    for (int i = 0; i < scores.length; i++) {
                        totalScore += scores[i];
                    }
                    avgScore = totalScore / totalStudents;
                    
                    System.out.println("최고 점수: " + highestScore);
                    System.out.println("평균 점수: " + avgScore);
                }
                case 5 -> {
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
