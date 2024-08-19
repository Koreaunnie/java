package ch02.lecture.p03string;

public class C01String {
    public static void main(String[] args) {
        // charater : 문자 하나만 저장하는 타입
        char a = '가';
        System.out.println("a = " + a);
        // char b = '가나'; -> 불가

        // String : 여러 문자(문자열)를 저장하는 타입
        String c = "가나"; // 큰 따옴표 사용
        System.out.println("c = " + c);

        String d = "It's good"; // 큰 따옴표 안 작은 따옴표는 가능
        System.out.println("d = " + d);

        String e = "It is \"good\""; // String 내에서 큰 따옴표는 역슬래시와 함께
        System.out.println("e = " + e);

        String f = "\\는 특수기호 사용시"; // 역슬래시는 역슬래시와 함께
        System.out.println("f = " + f);

        // 역슬래시 사용 예시 (책 52쪽)
        String g = "작은 따옴표 \'";
        System.out.println("g = " + g);
        String h = "다음 줄\n표현";
        System.out.println("h = " + h);
        String i = "탭\t표현";
        System.out.println("i = " + i);
    }
}
