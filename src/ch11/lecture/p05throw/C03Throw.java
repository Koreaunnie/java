package ch11.lecture.p05throw;

import java.io.IOException;

public class C03Throw {
    public static void action1() throws Exception {
        throw new Exception(); // checked  -> throws 키워드 반드시 써야함
    }

    public static void action2() throws ClassNotFoundException, IOException {
        boolean a = true;
        if (a) {
            throw new ClassNotFoundException();
        } else {
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        try {
            action2();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
