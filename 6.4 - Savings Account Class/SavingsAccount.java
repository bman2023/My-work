/**
 The SavingsAccount class stores data about a savings account
 for the SavingsAccount Class programming challenge.
 */

public class SavingsAccount
{
    // The account balance
    private double bal = 0;
    // The annual interest rate
    private double intrate = 0;
    // Last amount of interest earned
    private double LastInt = 0;
    /**
     The constructor initializes an object with a
     balance and an annual interest rate.
     @param bal The account balance.
     @param intRate The annual interest rate.
     */
    public SavingsAccount(double balance, double irate){
        bal = balance;
        intrate = irate;
    }
    /**
     The withdraw method withdraws an amount from
     the account.
     @param amount The amount to withdraw.
     */
    public double withdraw(double W){
        bal = (bal - W);
        return bal;
    }
    /**
     The deposit method deposits an amount into
     the account.
     @param amount The amount to deposit.
     */
    public double deposit(double D){
        bal = bal + D;
        return bal;
    }
    /**
     The addInterest method calculates the monthly
     interest and adds it to the account balance.
     */
    public double addInterest(double irate){
        intrate = irate / 100;
        intrate = intrate/11;
        bal = bal * (1 + intrate);
        return bal - intrate;
    }
    /**
     The getBalance method returns the account balance.
     @return The account balance.
     */
    public double getBalance(){
        return bal;
    }
    /**
     The getInterestRate method returns the annual
     interest rate.
     @return The annual interest rate.
     */
    public double getInterestRate(double in){
        return intrate * 12;
    }
    /**
     The getLastInterest method returns the last amount
     of interest earned.
     @return The last amount of interest earned.
     */
    public double getLastInterest(double b){
        b = b / (1 +  intrate);
        return bal - b; 
    }
}

