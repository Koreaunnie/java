package ch11.lecture.p01exception;

public class C01NullPointerException {
    public static void main(String[] args) {
        // ok
        String s = "java";
        System.out.println(s.length());

        // NullPointerException
        String t = null;
        System.out.println(t.length());

        System.out.println("다음 코드");
    }
}
