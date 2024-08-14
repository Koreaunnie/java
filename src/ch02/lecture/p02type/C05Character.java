package ch02.lecture.p02type;

public class C05Character {
    public static void main(String[] args) {
        // chart (2 byte)
        // 문자 하나 (작은 따옴표 사용)
        // unicode
        char a = 'a';
        char b = '가';
        char c = '한';
        char d = '8';

        char e = 65; // unicode 대문자 A -> unicode는 16진법이라 10진법으로 바꿔야함
        System.out.println(e);

        char f = 45206;
        System.out.println(f);

        char g = 3743; // unicode 16진법을 10 진법으로 변환
        System.out.println(g);

        char h = '\u0e9f'; // unicode 16진법 그대로 사용 시 앞에 역슬래시(\) u 붙이기
        System.out.println(h);
    }

}
