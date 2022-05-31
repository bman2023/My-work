import java.util.Scanner;

public class AstronautScoring {

    /* ==========================================
    ===== Challenge 3.3 - Astronaut Scoring =====
    =============================================

    We need to figure out who is going to captain the ship and the best way to
    do that is through scoring. We've figured out the scoring system, but we
    want to have software that ranks the astronauts once we put their scores in.

    Please create a program that asks for the names of three astronauts and their
    score out of 100 on the astronaut exam. The program should display the names
    of the three astronauts ranked from highest to lowest.

    Things you need to pass the tests:
    Input 1 - "Enter the first astronaut's name: "
    Input 2 - "Enter the first astronaut's score: "
    Input 3 - "Enter the second astronaut's name: "
    Input 4 - "Enter the second astronaut's score: "
    Input 5 - "Enter the third astronaut's name: "
    Input 6 - "Enter the third astronaut's score: "
    Output 1 - "Highest score: [astronaut(x)]"
    Output 2 - "Second highest score: [astronaut(y)]"
    Output 3 - "Third highest score: [astronaut(z)]"

     */

    public static void main(String[] args) {
        // Create variables
        String name1;
        int score1;
        String name2;
        int score2;
        String name3;
        int score3;
        String first;
        String second;
        String third;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Display intro.     
        System.out.println("This program helps us to rank astronauts from highest to lowest");
        // Get the first astronaut's data.
        System.out.println("Enter the first astronaut's name: ");
        name1 = keyboard.nextLine();
        System.out.println("Enter the first astronaut's score: ");
        score1 = keyboard.nextInt();
        // Get the second astronaut's data.
        System.out.println("Enter the second astronaut's name: ");
        name2 = keyboard.nextLine();
        name2 = keyboard.nextLine();
        System.out.println("Enter the second astronaut's score: ");
        score2 = keyboard.nextInt();
        // Get the third astronaut's data.
        System.out.println("Enter the third astronaut's name: ");
        name3 = keyboard.nextLine();
        name3 = keyboard.nextLine();
        System.out.println("Enter the third astronaut's score: ");
        score3 = keyboard.nextInt();
        // Close the keyboard scanner
        keyboard.close();
        // Determine the first place astronaut.
        if ( score1 > score2 && score1 > score3 ){
            first = name1;
        } 
            
        else if ( score2 > score1 && score2 > score3 ){
            first = name2;
        }

        else{
            first = name3;
        }
        // Determine the second place astronaut.
        if (score1 > score2 && score1 < score3 || score1 > score3 && score1 < score2){
            second = name1;
        }
        else if (score2 > score1 && score2 < score3 || score2 > score3 && score2 < score1){
            second = name2;
        }
        else{
            second = name3;
        }
        // Determine the third place astronaut.
        if (score1 < score2 && score1 < score3){
            third = name1;
        }
        else if (score2 < score1 && score2 < score3){
            third = name2;
        }
        else{
            third = name3;
        }
        // Display the results.
        System.out.println("Highest score: " + first);
        System.out.println("Second highest score: " + second);
        System.out.println("Third highest score: " + third);
    }
}
