package ch02.lecture.p03string;

public class C05Parsing {
    public static void main(String[] args) {
        // parsing (p.67)
        // 문자열을 기본 타입으로 변환
        String a = "33"; // 2 * a 해서 66을 만들고 싶으나, String과 Integer는 곱하기(*) 연산이 안 됨

        int a1 = Integer.parseInt(a); // 문자열을 int로 변환(파싱)
        int b = 2 * a1; // 66
        System.out.println("b = " + b);


        String c = "3.14";

        double c1 = Double.parseDouble(c); // 문자열을 double로 parsing
        double d = 5 + c1; // 8.14
        System.out.println("d = " + c1);

    }
}
