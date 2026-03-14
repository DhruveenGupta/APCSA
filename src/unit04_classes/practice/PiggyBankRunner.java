package unit04_classes.practice;

public class PiggyBankRunner {
    PiggyBank myPiggyBank = new PiggyBank(10, 4, 2, 1);
    public static void main(String [] args) {
        PiggyBankRunner runner = new PiggyBankRunner();
        System.out.println("Pennies: " + runner.myPiggyBank.getPennies());
        System.out.println("Nickels: " + runner.myPiggyBank.getNickels());
        System.out.println("Dimes: " + runner.myPiggyBank.getDimes());
        System.out.println("Quarters: " + runner.myPiggyBank.getQuarters());
        System.out.println("Total: $" + runner.myPiggyBank.getTotal());
        runner.myPiggyBank.recieveCoins(5, 10, 10, 2);
        System.out.println("Pennies: " + runner.myPiggyBank.getPennies());
        System.out.println("Nickels: " + runner.myPiggyBank.getNickels());
        System.out.println("Dimes: " + runner.myPiggyBank.getDimes());
        System.out.println("Quarters: " + runner.myPiggyBank.getQuarters());
        System.out.println("Total: $" + runner.myPiggyBank.getTotal());
    }
}
