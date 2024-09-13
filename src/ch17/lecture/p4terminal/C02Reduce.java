package ch17.lecture.p4terminal;

import java.util.Arrays;

public class C02Reduce {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};

        // 고전적
        int result = 0;
        for (int n : arr) {
            result = apply(result, n);
        }
        ;
        System.out.println("result = " + result); // 합계

        // reduce
        int r2 = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);
        System.out.println("r2 = " + r2);
        int r3 = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + 1);
        System.out.println("r3 = " + r3);
        int min = Arrays.stream(arr)
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("min = " + min);
        int max = Arrays.stream(arr)
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("max = " + max);
    }

    public static int apply(int a, int b) {
        return a + b;
    }
}
