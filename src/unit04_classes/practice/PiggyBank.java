package unit04_classes.practice;

public class PiggyBank {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }
    
    public PiggyBank(int pennies, int nickels, int dimes, int quarters) {
        if (pennies < 0 || nickels < 0 || dimes < 0 || quarters < 0) {
            throw new IllegalArgumentException("Coin counts must be non-negative");
        }
        this.pennies = pennies;
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;
    }

    public int getPennies(){
        return pennies;
    }

    public int getNickels(){
        return nickels;
    }

    public int getDimes(){
        return dimes;
    }

    public int getQuarters(){
        return quarters;
    }

    public void recieveCoins(int pennies, int nickels, int dimes, int quarters) {
        if (pennies < 0 || nickels < 0 || dimes < 0 || quarters < 0) {
            throw new IllegalArgumentException("Coin counts must be non-negative");
        }
        this.pennies += pennies;
        this.nickels += nickels;
        this.dimes += dimes;
        this.quarters += quarters;
    }

    public double getTotal() {
        return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
    }
}
