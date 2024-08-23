package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10ArrayCopy {
    public static void main(String[] args) {
        // 1차원 배열
        // new int[]로 배열을 새로 생성하고, for문으로 값만 복사하여, 기존 배열에 영향을 안 미침
        int[] a = {6, 7, 8};
        int[] b = new int[a.length]; // 추가 배열 생성

        for (int i = 0; i < a.length; i++) { // for문으로 값만 복사
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b[0] = 99;

        System.out.println(Arrays.toString(a)); // [6, 7, 8]
        System.out.println(Arrays.toString(b)); // [99, 7, 8]
    }
}
