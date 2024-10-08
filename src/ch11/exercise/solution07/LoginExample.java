package ch11.exercise.solution07;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void login(String id, String password) throws Exception {
        // id가 blue가 아니라면 NotExistIDException 발생 시킴
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }

        // password가 12345가 아니라면 WrongPasswordException 발생 시킴
        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}

class NotExistIDException extends Exception {
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}