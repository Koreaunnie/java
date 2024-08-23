package ch05.lecture.p02reference;

public class C11MatrixCopy {
    public static void main(String[] args) {
        // 2차원 배열
        // 기존 배열에 영향
        int[][] m1 = {
                {30, 40},
                {22, 11}
        };
        int[][] m2 = new int[m1.length][]; // 추가 배열 생성

        for (int i = 0; i < m1.length; i++) { // for문으로 값 복사
            m2[i] = m1[i];
        }

        m2[0][0] = 90;

        System.out.println(m1[0][0]); // 90
    }
}
