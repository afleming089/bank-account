package bank-account;
/*
 * TestProblemTwo
 * Anton Fleming
 * A test class for problem two
 */
public class TestAccount {
    public static void main(String[] args) {
        Account defaultAccount = new Account();
        System.out.println(defaultAccount.toString());

        Checking checking = new Checking(1, 100, -100);
        checking.withdraw(210);
        checking.deposit(210);
        checking.withdraw(300);
        checking.withdraw(20);
        checking.withdraw(90);

        Savings savings = new Savings(2, 100);
        savings.withdraw(110);
        savings.deposit(110);
        savings.withdraw(20);
        savings.withdraw(190);

    }
}
