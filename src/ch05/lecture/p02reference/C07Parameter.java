package ch05.lecture.p02reference;

public class C07Parameter {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4},
                {5, 6}
        };
        System.out.println("1 > " + arr[0][0]);
        method(arr);
        System.out.println("4 > " + arr[0][0]);
    }

    public static void method(int[][] b) {
        System.out.println("2 > " + b[0][0]);
        b[0] = new int[]{33, 44};
        System.out.println("3 > " + b[0][0]);
    }
}
