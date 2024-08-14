package ch02.lecture.p02type;

public class C02Double {
    public static void main(String[] args) {
        // 실수

        // int a = 3.14; 불가능

        // float (4 byte)
        float b = 3.14F;
        System.out.println(b);

        // double (8 byte)
        double c = 3.14;
        System.out.println(c);

        double d = 3000000;
        System.out.println(d);

        double e = 3e6; // 3 곱하기 10의 6승
        System.out.println(e);

        double f = 314e-2; // 314 곱하기 10의 -2승
        System.out.println(f);

    }
}
