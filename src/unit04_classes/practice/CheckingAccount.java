package unit04_classes.practice;

public class CheckingAccount {
    private double myBalance;
    private int myAccountNumber;
    public double getBalance() {
        return myBalance;
    }
    public int getAccountNumber() {
        return myAccountNumber;
    }
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        myBalance = myBalance + amount;
    }
    public void withdraw(double amount) {
        myBalance = myBalance - amount;
    }
    public static void main(String [] args) {
        CheckingAccount account = new CheckingAccount();
        try {
            account.deposit(20);
            System.out.println("20 deposited");
            account.deposit(-100);
            System.out.println("-100 deposited");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}