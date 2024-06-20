
/**
 * Checking
 * Anton Fleming
 * A account subclass that allows an over draft of 100 dollars.
 * If it is more than 100 it stops the user from taking any more money.
 */

public class Checking extends Account {
    private double overdraft;

    Checking(int id, double balance, double overdraft) {
        super(id, balance);
        this.overdraft = overdraft;

        System.out.printf("Created new checking account...\n%s\n", toString());
    }

    void withdraw(double amount) {
        System.out.printf("Withdrawing %s from checking...\n", amount);
        if (overdraft <= getBalance() - amount) {
            super.withdraw(amount);
            System.out.println(toString());
        } else {
            System.out.printf("ERROR: Your checking account balance is %s. Max overdraft is -100.\n", getBalance());
        }
    }

    void deposit(double amount) {
        System.out.printf("Depositing %s into checking\n", amount);
        super.deposit(amount);
        System.out.println(toString());
    }

    public String toString() {
        // account details
        return "Checking " + super.toString();
    }
}