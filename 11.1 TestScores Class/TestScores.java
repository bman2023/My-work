// Create a class named TestScores
public class TestScores{
    // Create a variable named scores to hold a double array
    private double[] Scores;
    // Create a method named TestScores that accepts a double array and throws an IllegalArgumentException
    public TestScores(double[] D) throws IllegalArgumentException{
        // Set scores to the length of the array
        int i = 0;
        // Copy the scores passed as an argument into the new scores array
        Scores = new double[D.length];
        // Make sure to check for illegal values (<100 or >0) as you step through the loop
        try {for(; i < Scores.length; i++){
            if(D[i] < 0 || D[i] > 100){
        throw new IllegalAccessException("Invalid number");
            }
            Scores[i] = D[i];
            }
        }
        catch(IllegalAccessException e){
            System.out.println("Invalid score found.");
            System.out.println("Element: " + i  + " Score: " + D[i] );
        }
        finally{ 
        }
        // If an error is found, output the following:
            // "Element: (element number) Score: (value for the element)"
        // Otherwise
            // Actually perform the copy
        
        
    }
    // Create a method named getAverage that returns a double
    public double getAverage(){
        // Create a double named total and set it to 0
        double total = 0;
        // Use a loop to accumulate the test scores in the array
        for (int i = 0; i < Scores.length; i++){
            total += Scores[i];
           
        }
         total = total/Scores.length;
        // Return the total divided by the number of scores to get an average.
        return total;
    
    }
}