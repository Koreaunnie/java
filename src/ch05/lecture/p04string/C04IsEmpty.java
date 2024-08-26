package ch05.lecture.p04string;

public class C04IsEmpty {
    public static void main(String[] args) {
        // isEmpty : 길이가 0일 때만 true

        String a = "";
        String b = "";
        String c = "a";
        String d = "abc";

        System.out.println(a.isEmpty()); // true
        System.out.println(b.isEmpty()); // false
        System.out.println(c.isEmpty()); // false
        System.out.println(d.isEmpty()); // false
    }
}
