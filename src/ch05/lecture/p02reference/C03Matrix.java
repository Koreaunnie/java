package ch05.lecture.p02reference;

import java.util.Arrays;

public class C03Matrix {
    public static void main(String[] args) {
        // matrix (행렬, 2차원 배열)
        // new int[행 갯수][열 갯수]
        int[][] m1 = new int[3][2];

        /*
        [0, 0]
        [0, 0]
        [0, 0]
         */

        m1[0][0] = 55;
        m1[0][1] = 66;

        m1[1][0] = 77;
        m1[1][1] = 88;

        m1[2][0] = 99;
        m1[2][1] = 1010;

        System.out.println(Arrays.toString(m1[0]));
        System.out.println(Arrays.toString(m1[1]));
        System.out.println(Arrays.toString(m1[2]));
    }
}
