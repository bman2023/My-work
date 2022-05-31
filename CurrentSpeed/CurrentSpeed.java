import java.util.Scanner;

public class CurrentSpeed {

    /* ======================================
    ===== Challenge 5.4 - Current Speed =====
    =========================================

    Future speed
    Speed increase %
    How long until you reach your target speed
    your current speed is
    
    We need a way for astronauts to determine their current speed based on their rate of
    increase, how long they have to go until they are at the correct speed, and target
    speed. The formula to determine this is as follows:

    C = (T)/(1+R)^N

    The terms in the formula are as follows:

        - C is the current relative speed of the spacecraft in km/s.
        - T is the target speed that the spacecraft will end at km/s.
        - R is the percent increase per minute of the spacecraft's speed.
        - N is the number of minutes that are left until the spacecraft meets the target speed.

    Write a method named currentSpeed that performs this calculation. The method should accept
    the target speed value, percent increase per minute, and number of minutes as arguments.
    It should return the current speed of the spacecraft. Demonstrate the method in a program
    that lets our astronauts experiment with different values for the formula's terms.

    Things you need to pass the tests:
        Input 1 - Enter target speed: 
        Input 2 - Rate of speed increase per minute: 
        Input 3 - Minutes until target speed achieved: 
        Formula - current = target / (1 + rate)^minutes)
        Output - Current speed: [current](be sure to include 2 decimal places and commas)

     */

    public static void main(String[] args) {
        // Variables
        double targetspeed;
        double increase;
        double minutes;
        double current;
        // Scanner
        Scanner keyboard = new Scanner(System.in);
        // Get the target speed.
        System.out.println("Enter target speed: ");
        targetspeed = keyboard.nextDouble();
        // Get the rate of increase.
        System.out.println("Rate of speed increase per minute: ");
        increase = keyboard.nextDouble();
        // Get the number of minutes until the spacecraft reaches target speed.
        System.out.println("Minutes until target speed achieved: ");
        minutes = keyboard.nextDouble();
        // Close the keyboard
        keyboard.close();
        // Call the currentSpeed method
        currentSpeed(targetspeed, increase, minutes);
        current = currentSpeed(targetspeed, increase, minutes);
        // Display the result.
        System.out.printf("The current speed is %,.2f ", current);

    }

    // Declare your method accepting target, rate, and minutes
    public static double currentSpeed(double num1, double num2, double num3 ) {  
        // Create a double for current speed
        double num4;
        // Calculate the current speed.
        num4 = num1/Math.pow((1+num2/100), num3);
        // Return the current speed.
        return num4;
    }
}

