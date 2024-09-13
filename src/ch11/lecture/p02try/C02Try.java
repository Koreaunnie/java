package ch11.lecture.p02try;

public class C02Try {
    public static void main(String[] args) {
        try {
            int[] a = {3, 3};
            int i = a[2];
            System.out.println("i = " + i);
        } catch (IndexOutOfBoundsException e) {
            // 어떤 일...
            e.printStackTrace(); // 출력해서 무슨일이 있는지 확인하는게 좋음
        }
        System.out.println("다음 코드들");
    }
}
