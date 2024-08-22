package ch04.exercise;

public class Solution6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄을 바꿔 출력하는 역할
        }
    }
}
