package ch06.lecture.p03method;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class C10Return {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    public void method1() {
    }

    public int method2() {
        // void외에는 return이 꼭 실행되도록 코드 작성해야함

        // return:
        // 1. 메소드 종료
        // 2. 오른쪽 값을 호출한 곳으로 반환(return)
        // 오른쪽 값은 메소트의 리턴 타입과 타입이 일치해야함

        return 3;
    }

    public String method3() {
        return "종료";
    }

    public int[] method4() {
        return new int[]{3, 4};
    }

    public PrintStream method5() throws FileNotFoundException {
        return new PrintStream("");
    }
}