package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        } catch (InSufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}


class InSufficientException extends Exception {
    public InSufficientException() {

    }

    public InSufficientException(String message) {
        super(message);
    }
}

class Account {
    private long balance;

    public Account() {

    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InSufficientException {
        if (balance < money) {
            throw new InSufficientException("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}