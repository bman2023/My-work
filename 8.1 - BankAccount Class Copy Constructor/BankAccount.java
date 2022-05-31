
// Create a class named BankAccount
public class BankAccount
{
    // Create a double named balance
    double balance;
    // Create a no-arg constructor named BankAccount
        // Set balance to 0.0
    BankAccount(){
        balance = 0.0;
    }
    // Create a constructor named BankAccount that accepts a BankAccount object
        // Set balance to the balance of the BankAccount object
    BankAccount(double bal){
        balance = bal;
    }
    // Create a constructor named BankAccount that accepts a double
        // Set balance to the user's entered double
    BankAccount(BankAccount account1){
        balance = account1.balance;
    }
    // Create a constructor named BankAccount that accepts a string
        // Set balance to the user's entered string parsed as a double

    // Create a void method for deposits that accepts a double for the amount
        // Set balance to balance + the amount entered

    // Create a void method for deposits that accepts a string for the amount
        // Set balance to balance + the amount entered parsed as a double

    // Create a void method for withdrawals that accepts a double for the amount
        // Set balance to balance - the amount entered

    // Create a void method for withdrawals that accepts a string for the amount
        // Set balance to balance - the amount entered parsed as a double

    // Create a void method named setBalance that accepts a double
        // Set balance to the amount entered

    // Create a void method named setBalance that accepts a string
        // Set balance to the amount entered parsed to a double

    // Create a method that returns a double named getBalance and accepts no arguments
        // Return the balance
        public double getBalance(){
            return balance;
        }
}