package ch05.lecture.p04string;

public class C01String {
    public static void main(String[] args) {
        String a = new String("java"); // new 연산자 생략 가능
        String b = new String("java");

        System.out.println("a = " + a);
        System.out.println(a == b);
    }
}
