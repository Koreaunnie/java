package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int[] arr;

        a = 3;
        arr = new int[]{5, 6};

        System.out.println(a); // 3
        System.out.println(arr);
        System.out.println(System.identityHashCode(arr)); // 참조값 확인

        int b = a;
        System.out.println("b = " + b); // 3

        a = 30; // b는 그대로
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] brr = arr;
        System.out.println("brr[0] = " + brr[0]);

        arr[0] = 50;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]);
    }
}
