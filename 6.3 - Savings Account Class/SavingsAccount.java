/**
 The SavingsAccount class stores data about a savings account
 for the SavingsAccount Class programming challenge.
 */

public class SavingsAccount
{
    // The account balance
    private double balance; 
    private double bal;
    // The annual interest rate
    private double interestrate;
    // Last amount of interest earned
    private double interestearned;
    private double LastInterest;
    /**
     The constructor initializes an object with a
     balance and an annual interest rate.
     @param bal The account balance.
     @param intRate The annual interest rate.
     */
    public SavingsAccount(){
        balance = 0;
    }
    public SavingsAccount(double balance){
        balance = bal;
    }
    /**
     The withdraw method withdraws an amount from
     the account.
     @param amount The amount to withdraw.
     */
    public void withdraw(double W){
        balance -= W;
    }
    /**
     The deposit method deposits an amount into
     the account.
     @param amount The amount to deposit.
     */
    public void deposit(double D){
        balance =+ D;
    }
    /**
     The addInterest method calculates the monthly
     interest and adds it to the account balance.
     */

    /**
     The getBalance method returns the account balance.
     @return The account balance.
     */
    public double getBalance(){
        return balance;
    }
    /**
     The getInterestRate method returns the annual
     interest rate.
     @return The annual interest rate.
     */
    public void getInterestRate(double in){
        interestrate = in;
    }
    /**
     The getLastInterest method returns the last amount
     of interest earned.
     @return The last amount of interest earned.
     */
    public void getLastInterest(){
        balance =+ (interestrate * balance) - balance;
    }
}

