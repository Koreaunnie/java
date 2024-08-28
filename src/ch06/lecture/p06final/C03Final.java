package ch06.lecture.p06final;

import java.util.Arrays;

public class C03Final {
    public static void main(String[] args) {
        final int[] a = {3, 4};
        a[0] = 33; // 가능 (a 값이 아닌 a가 가지고 있는 인스턴스의 값이 바뀐 거라)
        // a = new int[] {5, 6}; // 불가
        System.out.println(Arrays.toString(a));
        method1(a);
    }


    static void method1(final int[] a) {
        a[1] = 99;
        // a = new int[] {99, 88}; // 불가
    }
}
