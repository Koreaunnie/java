package ch02.lecture.p02type;

public class C04Boolean {
    public static void main(String[] args) {
        // boolean (1 byte)
        // true 또는 false
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if(a){
            System.out.println("참일 때 실행 1");
        } else {
            System.out.println("거짓일 때 실행 1");
        }

        if(b){
            System.out.println("참일 때 실행 2");
        } else {
            System.out.println("거짓일 때 실행 2");
        }

    }
}
