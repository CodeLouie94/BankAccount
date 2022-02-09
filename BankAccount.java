import java.util.ArrayList;
import java.util.Random;

class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;
    private static int numberOfBankAccounts = 0;
    private static double totalAmountStored = 0;
    

    //CONSTRUCTORS
    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = randomAccountNumber();
        totalAmountStored = (this.checkingBalance + this.savingsBalance);
        numberOfBankAccounts++;
    }

    public BankAccount(double checkingDeposit, double savingsDeposit){
        this.checkingBalance = checkingDeposit;
        this.savingsBalance = savingsDeposit;
        this.accountNumber = randomAccountNumber();
        totalAmountStored = (this.checkingBalance + this.savingsBalance);
        numberOfBankAccounts++;
    }

    //##########GETTERS AND SETTERS####################

    //CHECKING ACCOUNT BALANCE

    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public void depositChecking(double amountDeposited){
        this.checkingBalance += amountDeposited;
        totalAmountStored += amountDeposited;
    }
    public void withdrawChecking(double amountWithdrawn){
        if(this.checkingBalance > amountWithdrawn){
            this.checkingBalance -= amountWithdrawn;
        }else{
            System.out.println("You have insufficient funds in your checking account");
        }
    }

    //SAVINGS ACCOUNT BALANCE

    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void depositSavings(double amountDeposited){
        this.savingsBalance += amountDeposited;
        totalAmountStored += amountDeposited;

    }
    public void withdrawSavings(double amountWithdrawn){
        if(this.savingsBalance > amountWithdrawn){
            this.savingsBalance -= amountWithdrawn;
        }else{
            System.out.println("You have insufficient funds in your savings account");
        }
    }

    //Account number
    public long getAccountNumber(){
        return this.accountNumber;
    }


    public double totalMoney(){
        return this.savingsBalance + this.checkingBalance;
    }



    public static void accountCount(){
        System.out.println("There are "+numberOfBankAccounts+ " bank accounts.");
    }
    public static void totalMoneyCount(){
        System.out.println("The total amount in the bank is "+ totalAmountStored);

    }
    public static long randomAccountNumber(){
        long accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return accountNumber;
    }

    public void displayAccount(){
        System.out.println(this.getAccountNumber());
        System.out.println(this.totalMoney());
    }

}

