package ch05.lecture.p05null;

public class C01Null {
    public static void main(String[] args) {
        // null : 참조하는(가리키는) 객체(instance)가 없다
        String[] a = new String[3];

        System.out.println(a[0]); // null
        System.out.println(a[1]); // null
        System.out.println(a[2]); // null

        a[0].length(); // NullPointerException

        System.out.println("프로그램 종료");
    }
}
