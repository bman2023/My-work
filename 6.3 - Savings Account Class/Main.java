import java.util.Scanner;

public class Main {

    /* ==============================================
    ===== Challenge 6-12 - SavingsAccount Class =====
    =================================================

    Design a SavingsAccount class that stores a savings account's annual interest rate and
    balance. The class constructor should accept the amount of the savings account's starting
    balance. The class should also have methods for subtracting the amount of a withdrawal, adding
    the amount of a deposit, and adding the amount of monthly interest to the balance. The
    monthly interest rate is the annual interest rate divided by twelve. To add the monthly
    interest to the balance, multiply the monthly interest rate by the balance, and add the
    result to the balance.

    Test the class in a program that calculates the balance of a savings account at the end of a
    period of time. It should ask the user for the annual interest rate, the starting balance, and
    the number of months passed since the account was established. A loop should then iterate once
    for every month, performing the following:

        a. Ask the user for the amount deposited into the account during the month. Use the class
           method to add this amount to the account balance.
        b. Ask the user for the amount withdrawn from the account during the month. Use the class
           method to subtract this amount from the account balance.
        c. Use the class method to calculate the monthly interest.

    After the last iteration, the program should display the ending balance, the total amount of
    deposits, the total amount of withdrawals, and the total interest earned.
     */

    public static void main(String[] args) {
        // Annual interest rate
        double interestrate, balance, deposit, withdraw = ;
        int i, months;
         // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the starting balance.
        System.out.print("Enter the savings account's starting balance: ");
        balance = keyboard.nextDouble();
        // Get the annual interest rate.
        System.out.print("Enter the account's annual interest rate: ");
        interestrate = keyboard.nextDouble();
        
        // Create a SavingsAccount object.
        SavingsAccount A = new SavingsAccount(balance);
        A.getInterestRate(interestrate);
        // Get the number of months that have passed.
        System.out.print("how many months have passed since the account was opened? ");
        i = keyboard.nextInt();
        i = 1;
        // Get the deposits and withdrawals for each month.
        while(i < months){
            System.out.print("Enter the amount deposited during month" + i);
            deposit = keyboard.nextDouble();
            A.deposit(deposit);
            System.out.print("Enter the amount withdrawn during month ");
            A.withdraw(withdraw);
            withdraw = keyboard.nextDouble();
            A.getLastInterest();
            balance = A.getBalance();
            i++;
        }
            // Get the withdrawals.

            // Add the deposits to the account.

            // Subtract the withdrawals.

            // Add the monthly interest.

            // Accumulate the amount of interest earned.

        // Display the totals and the balance.

    }
}
