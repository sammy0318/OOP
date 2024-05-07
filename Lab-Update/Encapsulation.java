class Account {
    private int balance = 10000;
    private int interestRate = 5;

    int getBalance() {
        return balance;
    }

    int getInterestRate() {
        return interestRate;
    }

    void setBalance(int balance) {
        this.balance += balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println("Initial balance: " + account.getBalance());
        System.out.println("Interest rate: " + account.getInterestRate());

        account.setBalance(5000);
        System.out.println("Updated balance: " + account.getBalance());
    }
}
