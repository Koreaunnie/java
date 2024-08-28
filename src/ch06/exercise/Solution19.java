package ch06.exercise;

public class Solution19 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(30000);
        System.out.println("현재 잔고: " + account.getBalance());
    }
}

class Account {
    private int balance;
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if (balance >= 0 && balance <= 1000000) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}