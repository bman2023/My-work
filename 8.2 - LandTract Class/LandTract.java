// Create a class named LandTract
public class LandTract
{
    // Create doubles for length and width
    double length, width, area;
    // Create a constructor named LandTract that accepts length and width
        // Set length to the input length
        // Set width to the input width
    public LandTract(double inputlength, double inputwidth)
    {
        length = inputlength;
        width = inputwidth;
        
    }
    // Create a method named getArea that returns a double
        // Return length * width
    public double getArea()
    {
        area = length * width;
       return area;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    // Create a method named equals that accepts a LandTract object and returns a bool
    public boolean equals(LandTract lt2){
        // Create a status bool  
        boolean status = false;
        // Compare tact2's length and width against tract1's length and width using this
        if((length == lt2.length)  &&  width == lt2.width){
        // If true, set status to true
         status = true;
         }
        // If false, set status to false
          else{
             status = false;
         }
        // Return the status
         return status;
         }
    // Freebie
    public String toString()
    {
        String str = String.format("Length = %,.2f\n" +
                        "Width = %,.2f\n" +
                        "Area = %,.2f\n",
                length, width, getArea());
        return str;
    }
}
