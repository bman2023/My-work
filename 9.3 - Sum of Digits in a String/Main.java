import java.util.Scanner;

public class Main {

    /* ==================================================
    ===== Challenge 9.3 - Sum of Digits in a String =====
    =====================================================

    Write a program that asks the user to enter a series of single digit numbers with nothing
    separating them. The program should display the sum of all the single digit numbers in the
    string. For example, if the user enters 2514, the method should return 12, which is the sum
    of 2, 5, 1, and 4. The program should also display the highest and lowest digits in the
    string. (Hint: Convert the string to an array)

     */
    public static void main(String[] args) {
        // Freebie
        String input;        // To hold keyboard input
        int sum = 0;         // Accumulator
        int num;             // To hold a number
        int highest = 0;     // The highest digit
        int lowest = 10;      // The lowest digit
        char[] array;        // Array to hold the characters
        String numAsString;  // To hold a number as a string
        int length = 0;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Ask the user to "Enter a string of digits: "
        System.out.println("Enter a string of digits:");
        // Get the user's input
        input = keyboard.nextLine();
        length = input.length();
        
        // Convert that input to a character array
        array = input.toCharArray();
        // Use a loop for each character in the array
        for(int j = 0; j < input.length(); j++){
            // Convert the given position in the array to a one character string
            numAsString = Character.toString(array[j]);
            // Convert the converted string into a number by parsing it
            num = Integer.parseInt(numAsString);
            // Set sum to sum + the number
            sum += num;
            if(num > highest)
            highest = num;
            if(num < lowest || num == 1)
             lowest = num;
        }
            // Set highest and lowest to the first number in the array
            

            // If not the first number, check to see if the number is greater than the highest

                // Set the number to highest
            
            // If not the first number, check to see if the number is less than the lowest

                // Set the number to lowest
        
        // Tell the user "The sum of those digits is (sum)"
        System.out.println( "The sum of those numbers is " + sum + ".");
        // Tell the user "The highest digit is (highest)"
        System.out.println( "The highest digit is " + highest + ".");
        // Tell the user "The lowest digit is (lowest)"
        System.out.println("The lowest digit is " + lowest + ".");
    }
}
