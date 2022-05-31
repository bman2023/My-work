import java.util.Scanner; // Needed for the Scanner class

public class fuelMixer {

    /* =========================
    ===== 2.4 - Fuel Mixer =====
    ============================

    In the last problem, we needed you to figure out how much fuel we needed,
    but we doing some additional calculations behind the scenes that we need
    your help to automate.
    
    Now that we know how much fuel (Kerosene) we for our test, we need you to
    figure out out how much liquid oxidizer (LOX) is needed per pound of fuel
    and how much the total propellant, "Rocket Propellant 1" (RP-1) weighs.
    Every pound of kerosene requires 2.56 pounds of LOX to create the RP-1
    mixture for our rockets. Make sure that you use a constant for the ratio
    value named "LOX_RECIPE."

    Write a program that accepts an input for how much fuel we need for a test
    and then gives us a value for how much LOX we need and what the total weight
    of the propellant is once mixed.

    Things you will need to pass the tests:
    Prompt 1 - "How many pouds of fuel are needed for the test?"
    Formula 1 - LOX = fuel * 2.56
    Formula 2 - RP1 = LOX + fuel
    Output 1 - "You need [LOX] pounds of oxidizer for [fuel] pounds of fuel."
    Output 2 - "The total weight of RP-1 required is [RP1] pounds."

     */

    public static void main(String[] args) {
        // Named constant for the mixture.
        
        // Variables for the adjusted mixture.
        double lox;
        double rp1;
        double fuel;
        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Get the amount of fuel being used.
        System.out.print("How many pouds of fuel are needed for the test? ");
        fuel = keyboard.nextDouble();
        // Close the keyboard scanner;
        keyboard.close();
        // Calculate how much oxidizer is required for that much fuel.
        lox = fuel * 2.56;
        // Calculate the total propellant weight
        rp1 = lox + fuel;
        // Display the outputs.
        System.out.print("You need " + lox + " pounds of oxidizer for " + fuel + " pounds of fuel.\n");
        System.out.print("The total weight of RP-1 required is " + rp1 + " pounds.\n");
    }
}
