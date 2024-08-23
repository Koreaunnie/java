package ch05.lecture.p02reference;

import java.util.Arrays;

public class C09ArrayCopy {
    public static void main(String[] args) {
        // 1차원 배열
        // 배열의 주소값을 가르켜 기존 배열에 영향을 미침
        int[] a = {6, 7, 8};
        int[] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b[0] = 99;

        System.out.println(Arrays.toString(a)); // [99, 7, 8]
        System.out.println(Arrays.toString(b)); // [99, 7, 8]
    }
}
