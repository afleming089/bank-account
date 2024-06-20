
/**
 * Savings
 * Anton Fleming
 * A account subclass that allows no over drafts.
 * Stops balance from falling below 0 dollars.
 */

public class Savings extends Account {

    Savings(int id, double balance) {
        super(id, balance);

        System.out.printf("Created new savings account...\n%s\n", toString());
    }

    void withdraw(double amount) {
        System.out.printf("Withdrawing %s from savings...\n", amount);
        if (0 <= getBalance() - amount) {
            super.withdraw(amount);
            System.out.println(toString());
        } else {
            System.out.printf("ERROR: Your savings account balance is %s. Max overdraft is 0.\n", getBalance());
        }
    }

    void deposit(double amount) {
        System.out.printf("Depositing %s into savings\n", amount);
        super.deposit(amount);
        System.out.println(toString());
    }

    public String toString() {
        // account details
        return "\nSavings " + super.toString();
    }
}