import java.util.Scanner;

public class engineTest {

    /* ========================================
    ===== 2.3 Engine Test Fuel Calculator =====
    ===========================================

    We need help to figure out how much fuel our different engines need for 
    our engine tests based on time. In order to calculate this, we will use 
    the following equation where fuel is measured in pounds:

    fuelRequired = fuelPerSecond * burnTime

    Write a porogram that asks the user for the fuel per second that the engine 
    uses at full thrust and the duration of the burn. It should calculate the
    amount of fuel required for the test. Make sure that the program closes
    after the calculation is complete.

    Things you will need to pass the tests:
    Prompt 1 - "How many pounds of fuel does the engine use per second?"
    Prompt 2 - "For how many seconds will the engine be on?"
    Formula - fuelRequired = fuelPerSecond * burnTime
    Output - "You need [fuelRequired] pounds of fuel.

     */

    public static void main(String[] args) {    
        
        // Create a scanner object for the keyboard.
        Scanner keyboard = new Scanner(System.in);
        double fuel;
        int second;
        double pounds;
        // Get the fuel per second used.
        System.out.print("How many pounds of fuel does the engine use per second?\n");
        fuel = keyboard.nextDouble();
        // Get the length of the burn in seconds.
        System.out.print("For how many seconds will the engine be on?\n");
        second = keyboard.nextInt();
        // Calculate the amount of fuel required.
        pounds = fuel * second ;
        // Display the fuel required.
        System.out.print("You need " + pounds + " pounds of fuel.\n");
        // Exit the program.
        System.exit(0);
       
    }
}