import java.util.ArrayList;

public class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(2, 3);
        account1.depositChecking(5.0);
        account1.depositSavings(10);
        BankAccount.accountCount();
        BankAccount.totalMoneyCount();
        System.out.println(account1.totalMoney());
        System.out.println(account2.totalMoney());
        //has private access so commented out below code to be able to compile
        // account1.savingsBalance = 50;
        account1.displayAccount();
        account2.displayAccount();
    }
}
