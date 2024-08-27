package ch06.lecture.p03method;

public class C14Return {
    public static void main(String[] args) {

    }
}


// return
// 1. 메소드 종료
// 2. 오른쪽 값 반환

class MyClass14 {
    public int method1() {
        boolean a = true;
        if (a) {
            return 3;
        }
        System.out.println("실행문...");
        return 5;
    }

    public void method2() {
        // return - void 일 때 (안써도 되긴하지만 아래의 목적으로 사용 가능)
        // 1. 메소드 종료

        boolean a = true;
        if (a) {
            return;
        }
        System.out.println("실행문...");
    }
}