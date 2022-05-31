// Create a class named CourseGrades
public class CourseGrades{
    // Create a final int named NUM_GRADES and set it to 4
    final int NUM_GRADES = 4;
    // Create a GradedActivity array named grades
    private GradedActivity[] grades;
    // Create a no-arg constructor named CourseGrades
    public CourseGrades(){
        // Set the GradedActivity to the value of the GradedActivity array with NUM_GRADES elements.
        grades = new GradedActivity[NUM_GRADES];
    }
    // Create a void method named setLab that accepts a GradedActivity object
    public void setLab(GradedActivity aLab){
        // Set the GradedActivity at element 0 to the value entered
        grades[0] = aLab;
    }
    // Create a void method named setPassFailExam that accepts a PassFailExam object
    public void setPassFailExam(PassFailExam aFailExam){
        // Set the GradedActivity at element 1 to the value entered
        grades[1] = aFailExam;
    }
    // Create a void method named setEssay that accepts an Essay object
    public void setEssay(Essay anEssay){
        // Set the GradedActivity at element 2 to the value entered
        grades[2] = anEssay;
    }
    // Create a void method named setFinalExam that accepts a FinalExam object
    public void setFinalExam(FinalExam aFinalExam){
        // Set the GradedActivity at element 3 to the value entered
        grades[3] = aFinalExam;
    }
    // Create a String returning method named toString
    public String toString(){
        // Create a string that outputs the following (Note the formatting)
        // "Lab Score: (Lab grade score as a number)"
        String str = "Lab Score: " + grades[0].getScore() +
        // "\tGrade: (Lab grade grade as a letter)"
        "\tGrade: " + grades[0].getGrade() +
        // "\nPass/Fail Exam Score: (Pall/Fail Exam score as a number)"
        "\nPass/Fail Exam Score: " + grades[1].getScore() +
        // "\tGrade: (Pass/Fail Exam grade as a letter)"
        "\tGrade: " + grades[1].getGrade() +
        // "\nEssay Score: (Essay score as a number)"
        "\nEssay Score: " + grades[2].getScore() +
        // "\tGrade: (Essay grade as a letter)"
        "\tGrade: " + grades[2].getGrade() +
        // "\nFinal Exam Score: (Final Exam score as a number)"
        "\nFinal Exam Score: " + grades[3].getScore() +
        // "\tGrade: (Final Exam grade as a letter)"
        "\tGrade: " + grades[3].getGrade();
        // Return the string
        return str;
    }
}