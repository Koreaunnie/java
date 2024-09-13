package ch11.lecture.p05throw;

public class C02Throw {
    public static void action1() throws ArithmeticException {
        throw new ArithmeticException(); // unchecked exception -> throws 키워드 안 써도 됨
    }

    public static void main(String[] args) {
        action1();
    }
}
