import java.util.Scanner;

public class GForceTest {

    /* =====================================
    ===== Challenge 5.2 - G-Force Test =====
    ========================================

    We need to figure out how many G's our astronauts can handle and apply a grade of,
    "Excel, Pass, or Fail" depending on what those scores are when we put them in the
    centrifuge. Write a program that asks the user to enter the G's applied when the 
    astronaut candidate passes out. The program should display a grade for each test.
    It should then get the average score and display it in G's and give a total grade.
    If somehow, the astronaut makes it past 9.0 G's, the centrifuge should shut down
    automatically as it is dangerous for the astronaut to endure more than 9.0 G's and
    you should output a warning notification so that our staff can correct the problem.
    
    Use the following methods in the program.
    - calcAverage - This method should accept the five scores as arguments and return
      the average of the scores.
    - determineGrade - This method should accept a score as an argument and return a
      grade for the score based on the following score:

    Score       Grade
    ==================
    Over 9.1    Warning
    6.1-9.0     Excel
    3.1-6.0     Pass
    1.0-3.0     Fail

    Things you will need to pass the tests:
    Input 1 - "Enter the first score: "
    Input 2 - "Enter the second score: "
    Input 3 - "Enter the third score: "
    Input 4 - "Enter the fourth score: "
    Input 5 - "Enter the fifth score: "
    Output 1 - "Here are the grades and the average:
                Score 1: [grade1]
                Score 2: [grade2]
                Score 3: [grade3]
                Score 4: [grade4]
                Score 5: [grade5]
                Average score: [averageScore]
                Average Grade: [averageGrade]

    All calculations should round to the second decimal.

     */

    public static void main(String[] args) {

        // Create variables and scanner object.
        Scanner keyboard = new Scanner(System.in);
        double score1, score2, score3, score4, score5;
        String grade1, grade2, grade3, grade4, grade5;
        // Get the five test scores in order.
        System.out.println("Enter the first score: ");
        score1 = keyboard.nextDouble();

        System.out.println("Enter the second score: ");
        score2 = keyboard.nextDouble();

        System.out.println("Enter the third score: ");
        score3 = keyboard.nextDouble();

        System.out.println("Enter the fourth score: ");
        score4 = keyboard.nextDouble();

        System.out.println("Enter the fifth score: ");
        score5 = keyboard.nextDouble();
        // Get the average.
        double average = calcAverage(score1, score2, score3, score4, score5);
        grade1 = determinegrade(score1);
        grade2 = determinegrade(score2);
        grade3 = determinegrade(score3);
        grade4 = determinegrade(score4);
        grade5 = determinegrade(score5);
        String grade = determinegrade(average);
        // Display the grades, average, and average grade.
        System.out.printf("Here are the grades and the average:\n Score 1: " + grade1  + "\nScore 2: " + grade2 + "\nScore 3: " + grade3 + "\nScore 4: " + grade4 + "\nScore 5: " + grade5 + "\nAverage score: %.2f" + "\nAverage Grade: " + grade, average);
        }
        
    /**
     The calcAverage method calculates the average of five scores.
     @param score1 The first score.
     @param score2 The second score.
     @param score3 The third score.
     @param score4 The fourth score.
     @param score5 The fifth score.
     @return The average of the five scores.
     */
    public static double calcAverage(double num1, double num2, double num3, double num4, double num5) {
      double average = (num1 + num2 + num3 + num4 + num5) /5;
      return average;
    }
    
    public static String determinegrade(double score){
      String grade;
      if (score >= 9.1)
        grade = "Warning";
      else if (score <= 9.0 && score >= 6.1)
        grade = "Excel";
      else if (score <= 6.0 && score >= 3.1)
        grade = "Pass";
      else 
        grade = "Fail";
        return grade;
    }
    
    /**
     The determineGrade method determines the grade
     for a numeric score.
     @param score The numeric score.
     @return The grade.
     */

    // To hold the grade
    // Determine the grade.
    }
  