import java.util.Scanner;

public class TimeCalculator {

    /* ========================================
    ===== Challenge 3.2 - Time Calculator =====
    ===========================================

    Our software currently tells us how long we need to turn our engines on in seconds.
    That's great, but it isn't very easy for our astronauts to work with while in space.
    We need you to write a program that converts seconds to minutes, hours, and days.

    Write a program that asks the user to enter a number of seconds.

    - There are 60 seconds in a minute. If the number of seconds entered by the user is
      greater than or equal to 60, the program should display the number of minutes in that
      many seconds.
    - There are 3,600 seconds in an hour. If the number of seconds entered by the user is
      greater than or equal to 3,600, the program should display the number of hours in
      that many seconds.
    - There are 86,400 seconds in a day. If the number of seconds entered by the user is
      greater than or equal to 86,400, the program should display the number of days in
      that many seconds.

    Things you need to pass the tests:
    Input 1 - "Enter the number of seconds for this burn."
    Formula 1 (Days) - seconds/86400
    Formula 2 (Hours) - seconds/3600
    Formula 3 (Minutes) - seconds/60
    Output - "Burn for [days] day(s), [hours] hour(s), [minutes] minute(s), [seconds] second(s)."

    */

    public static void main(String[] args) {
        // Create ints for seconds, minutes, hours, and days. Initialize them all to "0."
        int seconds;
        int minutes;
        int hours; 
        int days;
        int input = 500000;
        // Create a string for input.
        
        // Create a scanner.
        Scanner keyboard = new Scanner(System.in);
        // Ask, "Enter the number of seconds"
        System.out.println("Enter the number of seconds for this burn.");
        input = keyboard.nextInt();
        // Read the input to input

        // Parse the input to seconds

        // Close keyboard input
        keyboard.close();
        // Do the math for days
        days =  input/86400;
        // Do the math for hours
        hours = (input % 86400)/3600;
        // Do the math for inutes
        minutes = ((input % 86400) % 3600)/60;
        seconds = ((input % 86400) % 3600)%60;
        // Output the answer
        System.out.println("Burn for " + days +  " day(s), " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s).");
        // Exit the applicaton
        System.exit(0);
    }
}
