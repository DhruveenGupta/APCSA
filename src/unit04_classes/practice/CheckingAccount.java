package unit04_classes.practice;

public class CheckingAccount {
    private double myBalance;
    private int myAccountNumber;

    public CheckingAccount(int accountNumber, double initialBalance) {
        try {
            if (accountNumber < 0) {
                throw new IllegalArgumentException("Account number must be positive");
            }
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance must be positive");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
             System.exit(1);
        }
        this.myAccountNumber = accountNumber;
        this.myBalance = initialBalance;
    }

    public double getBalance() {
        return myBalance;
    }

    public int getAccountNumber() {
        return myAccountNumber;
    }

    public CheckingAccount() {
        myBalance = 0.0;
        myAccountNumber = 0;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        myBalance = myBalance + amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (myBalance < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        myBalance = myBalance - amount;
    }

    public static void main(String [] args) {
        CheckingAccount account = new CheckingAccount(19890, -300);
        System.out.println("Account number: " + account.getAccountNumber());
    }
}