
/**
 * Account
 * Anton Fleming
 * A class that allows for the creation of account objects with
 * an id, balance, date of creation, and annual interest rate.
 */
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        // 1200 is 100 * 12 or the reduced fraction of (rate / 100 / 12)
        return (annualInterestRate / 1200);
    }

    double getMonthlyInterest() {
        // 1200 is 100 * 12 or the reduced fraction of (rate / 100 / 12)
        return balance * (annualInterestRate / 1200);
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void getAccountDetails() {
        System.out.println("\nBalance: " + getBalance());
        System.out.println("Monthly Interest: " + getMonthlyInterest());
        System.out.println("Date Created: " + getDateCreated());
        System.out.println("---------------------\n\n");
    }

    public String toString() {
        // account details
        return "Account Details \nID: " + id + "\nDate Created: " + getDateCreated() + "\nBalance: " + getBalance()
                + "\n\n";
    }
}