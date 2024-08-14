package ch02.lecture.p02type;

public class C01Type {
    public static void main(String[] args) {
        // java data type - 2 types

        //  1.  primitive type - 8 types (기본타입, 원시타입) (* 친 걸 많이 씀)
        //      byte : 1 byte 정수
        //      short : 2 byte 정수
        //      int : 4 byte 정수 *
        //      long : 8 byte 정수 *
        //      float : 4 byte 실수
        //      double : 8 byte 실수 *
        //      boolean : 1 byte 논리 *
        //      char : 2 byte 문자

        //  2.  reference type 무한대 (참조타입)
        //      primitive type 빼고 모두

        /////////////////////////////////////
        // primitive type
        // 정수형 (byte(1), short(2), int(4), long(8))


        // byte (1 byte)
        byte b1;
        b1 = 127;
        byte b2;
        b2 = -128;
        // byte b3 = 128;  안됨
        // byte b4 = -129; 안됨

        // int (4 byte)
        int v1 =2147483647;
        System.out.println("v1 = " + v1);

        // long (8 byte)
        // 4 byte 이상의 수 작성 시 끝에 L 붙이기
        long v2 = 2147483647; // 가능
        // long v3 = 2147483648; 불가능
        long v4 = 2147483648L; // 가능
        long v5 = 2_147_483_648_000_000L; // 가능 (_는 아무데나 상관 없음)


    }
}
