import java.io.*;
import java.util.Scanner;

public class FileLetterCounter {

    /*=============================================
    ===== Challenge 4.3 - File Letter Counter =====
    ===============================================

    We told you this one wasn't going to be great either. After this, it's back to space, though.
    Our boss wants to be able to access astronaut names from individual files. You don't need to
    worry about creating those files or anything for right now. He already has them, but he wants
    to be able to open them using your software. Opening files will come in handy later.

    Anyway. Please write a program that asks the user to enter the name of a file, and then asks
    the user to enter a character. The program should count and display the numbero f times that 
    the letter appears in the file. The files are already provided and are named "Astronaut[x].txt."

    You can recycle a lot of code from the last assignment. This type of change to add functionality
    to an old piece of software is referred to as "iterative design", and it is how the software 
    industry works. Everyone is iterating everything all the time.


    Things you need to pass the tests:
    Input 1 - "Please enter the name of the file."
    Input 2 - "Enter a letter that you want counted."
    Output 1 - "The letter [letter] appears [number] times in that file."
    Error output - Should display the actual error message generated by Java.

     */

    public static void main(String[] args) throws FileNotFoundException, java.io.IOException {
        // Variables for filename, output, input, letter, and count
        try {
        String name, letter, fileName;
       int i = 0, count = 0;
        // Keyboard Scanner
        Scanner keyboard = new Scanner(System.in);
        
            // Get the file name and letter to count from the user.
            System.out.println("Please enter the name of the file.");
            fileName = keyboard.nextLine();
            System.out.println( "Enter a letter that you want counted.");
            letter = keyboard.nextLine();
            // Close the keyboard
            keyboard.close();
            // Make sure the letter is uppercase.
            String letterup = letter.toUpperCase();
            // Retrieve the letter.
            // Open the file.
            File file = new File(fileName);
            // Read the first line from the file.
            Scanner inputFile =new Scanner(file);
            // Process the entire file.
                // Get the uppercase equivalent of the line.
                name = inputFile.nextLine(); 
                // Count the number of times the letter appears
                String upname = name.toUpperCase();
                while (i < name.length()){
                    if (letterup.charAt(0) == upname.charAt(i)){
                    count++;
                }
                i++;
            }
                // in the line.

                // Read the next line.

            // Close the file.
            inputFile.close();
            // Format and display the count.
            System.out.println("The letter " + letterup + " appears " + count +" times in that file.");
            // Close the application
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
