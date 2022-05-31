import java.util.Scanner;

public class LetterCounter {

    /* =======================================
    ===== Challenge 4.2 - Letter Counter =====
    ==========================================

    We need you to help us write a piece of software to count the number of letters in our
    astronaut's names. We know, "What does this have to do with space", right? We are not
    entirely sure either. Our boss asked for this one and we're just going to roll with it
    even though it's a strange request.

    Anyway, please write a program that asks the user to enter an astronaut's name and then
    asks the user to enter the character that they want counted. The program should then 
    display the number of times that character appears in the astronatu's name. Seriously,
    sorry about this one being a bummer. The next one wont be much good either, but then
    we're back to space!

    Things you need to pass the tests:
    Input 1 - "Please enter the name of the astronaut."
    Input 2 - "Please enter the letter you want counted."
    Output 1 - "The letter [letter] appears [number] time(s) in [astronautsName]."

     */

    public static void main(String[] args) {
        // Variables for input, output, name, letter, count, etc.
        String name;
        String letter;
        int i =0;
        int count = 0;
        // Keyboard Scanner
        Scanner keyboard = new Scanner(System.in);
        // Get a name from the user.
        System.out.println("Please enter the name of the astronaut.");
        name = keyboard.nextLine();
        // Get the uppercase equivalent of the name.
        String upperName = name.toUpperCase();
        // Get the letter to count.
        System.out.println("Please enter the letter you want counted.");
        letter = keyboard.nextLine();
        // Close the keyboard
        keyboard.close();
        // Make sure the letter is uppercase.
        String upperLetter =  letter.toUpperCase();
        // Retrieve the letter.
    
        // Count the number of times the letter appears in the string.
        while (i < name.length()){
            if ( upperLetter.charAt(0) == upperName.charAt(i)) {
                count++;
            }
            i++;
        }
        
        
        // Format and display the count.
        System.out.println("The letter " + letter.toUpperCase() + " appears " + count + " time(s) in "  + name );
        // Close the application
        System.exit(0);
    }
}
