import java.util.Scanner;

public class AstronautExam {

    /* =======================================
    ===== Challenge 3.3 - Astronaut Exam =====
    ==========================================

    We have developed an exam consisting of five tasks for our astronauts and we need
    to convert their raw score into a percentage that we can later use to rank astronauts.

    The conversion should work as follows:
    - If an astronaut completes 0 tasks, he or she earns 0 percent.
    - If an astronaut completes 1 task, he or she earns 10 percent.
    - If an astronaut completes 2 tasks, he or she earns 25 percent.
    - If an astronaut completes 3 tasks, he or she earns 45 percent.
    - If an astronaut completes 4 tasks, he or she earns 70 percent.
    - If an astronaut completes 5 tasks, he or she earns 100 percent.

    Please write us a program that asks the user to enter the number of tasks that a
    given astronaut has completed an then displays the percentage scored.

    Things you need to pass the tests:
    Input 1 - "How many tasks did the astronaut complete?"
    Output 1 - "The astronaut's score is [percentage] percent."
     */

    public static void main(String[] args) {
        // Variables
        String percentage;
        int task;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the number of tasks completed.
        System.out.print("How many tasks did the astronaut complete?");
        task = keyboard.nextInt();
        // Close the keyboard
        keyboard.close();
        // Determine the percentage.
        if (task == 0){
            percentage = "0";
        }
        else if (task == 1){
            percentage = "10";
        }
        else if (task == 2){
            percentage = "25";
        }
        else if (task == 3){
            percentage = "45";
        }
        else if (task == 4){
            percentage = "70";
        }
        else {
            percentage = "100";
        }
        // Display the percentage.
        System.out.print("The astronaut's score is " + percentage + " percent.\n");
    }
}
