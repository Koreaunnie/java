package ch21.sec01;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getDate();
        var userName = getDate();
    }

    public static String getDate() {
        return "홍길동";
    }
}
