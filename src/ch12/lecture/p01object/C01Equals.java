package ch12.lecture.p01object;

public class C01Equals {
    public static void main(String[] args) {
        // Object는 모든 클래스의 상위 클래스
        // -> Object의 메소드는 모든 클래스가 가짐

        // 주요메소드
        // equals, hashcode, toString

        MYClass1 o = new MYClass1();
        Object a = 0;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(o));
    }
}


// 직접만든 클래스도 Object를 부모 클래스로 둠
// extends Object 생략 가능
class MYClass1 extends Object {

}