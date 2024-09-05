package ch13.lecture.p01generic;

public class C05Generic {
    public static void main(String[] args) {
        MyClass4<String> o1 = new MyClass4<>();
        MyClass4<Integer> o2 = new MyClass4<>();

        int i = 3;
        var j = 5;

        var o3 = new MyClass4<String>();
        var o4 = new MyClass4<Integer>();
    }
}

// 타입 파라미터명 작성 관습
// : 대문자 한글자

// 자주 사용되는 이름
// E : Element
// K : Key
// N : Number
// T : Type
// V : Value
// S, U, V etc. : 2nd, 3rd, 4th types
// T1, T2, T3 etc. : 1st, 2nd, 3rd... types