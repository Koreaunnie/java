package ch11.lecture.p02try;

public class C04Finally {
    public static void main(String[] args) {
        try {
            int[] a = {3, 4};
            int b = a[0]; // 예외 발생 가능

            // try 블럭 내의 다음 코드
            System.out.println("b = " + b);
        } catch (Exception e) {
            // catch 블럭 내의 코드
            e.printStackTrace();
        } finally {
            // finally 블럭 내의 코드
            // : 예외 발생 여부와 상관 없이 무조건 실행
            System.out.println("꼭 실행되어야 하는 코드");
        }

        // try 블럭 밖의 코드
        System.out.println("다음 실행 흐름");
    }
}
