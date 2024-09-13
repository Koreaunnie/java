package ch11.lecture.p05throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05Throw {
    public static void main(String[] args) throws Exception {
        // ClassNotFoundException 을 throws 해야하지만 다형성 덕에 상위인 Exception으로 던져도 됨
        Class.forName("");
    }

    public static void action() throws ClassNotFoundException, FileNotFoundException {
        Class.forName("");

        var io = new FileInputStream("");
    }

    public static void action2() throws Exception {
        Class.forName("");
        new FileInputStream("");
    }
}
