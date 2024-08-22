package ch05.exercise;

public class Solution7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("배열의 최댓값 : " + max);

        System.out.println("---enhanced for---");

        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("배열의 최댓값 : " + max);
    }
}
