/**
 The DriverExam class stores data about a driver's license exam
 for the Driver�s License Exam programming challenge.
 */

public class DriverExam
{
    // Minimum # of correct answers to pass
    private int pass = 15;
    // Array of correct answers
    private String[] answers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
    // The student's answers
    
    // The missed question numbers

    // The number correct
    private int correct;
    // The number incorrect
    private int incorrect;
    /**
     The constructor copies an array of answers
     to the student field.
     @param s The array of answers to copy.
     */

        // Create an array for the student answers.

        // Copy the student answers.

        // Grade the exam.

    /**
     The gradeExam method determines the number of
     correct and incorrect answers. It calls the
     makeMissedArray method.
     */

    /**
     The makeMissedArray method makes the missed array and
     stores the numbers of all the questions that the
     student missed in it.
     */

        // Index for missed array.

        // Did the student miss any questions?

            // Make an array of missed question numbers.

                    // Store the question number (i + 1)
                    // in the missed array.

                    // Increment missed array index.

    


    /**
     The passed method determines whether the student
     passed or failed the exam.
     @return true if the student passed, false otherwise.
     */

    /**
     The totalCorrect method returns the number of
     questions correctly answered.
     @return The number of questions correctly answered.
     */

    /**
     The totalInCorrect method returns the number of
     questions incorrectly answered.
     @return The number of questions incorrectly answered.
     */

    /**
     The questionsMissed method returns an array containing
     the numbers of the missed questions.
     @return An array containing the numbers of the missed
     questions.If no questions were missed, returns null.
     */
    }
}
