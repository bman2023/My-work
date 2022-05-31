
// Crete a class named Month
public class Month{


    // Create an int named monthNumber
    int monthNumber;
    // Create a no-arg constructor for Month
        // Set monthNumber to 1
    public Month(){
        monthNumber = 1;
    }
    // Create a constructor for Month that accepts an int
     public Month(int number){
         if(number > 12 || number < 1){
             monthNumber = 1;
         }
         else{
             monthNumber = number;
         }
         
     }
        // Validate the input (if larger than 12 or smaller than 1)
            // Set monthNumber to 1
        // If it's valid, set month number to whatever month it is
   
    // Create a constructor for Month that accepts a string
    public Month(String Monthname){
        Monthname = Monthname.toUpperCase();
        if(Monthname.equals("JANUARY")){
        monthNumber = 1;
    }
    else if(Monthname.equals("FEBRUARY")){
        monthNumber = 2;
    }
    else if(Monthname.equals("MARCH")){
        monthNumber = 3;
    }
    else if(Monthname.equals("APRIL")){
        monthNumber = 4;
    }
    else if(Monthname.equals("MAY")){
        monthNumber = 5;
    }
    else if(Monthname.equals("JUNE")){
        monthNumber = 6;
    }
    else if(Monthname.equals("JULY")){
        monthNumber = 7;
    }
    else if(Monthname.equals("AUGUST")){
        monthNumber = 8;
    }
    else if(Monthname.equals("SEPTEMBER")){
        monthNumber = 9;
    }
    else if(Monthname.equals("OCTOBER")){
        monthNumber = 10;
    }
    else if(Monthname.equals("NOVEMBER")){
        monthNumber = 11;
    }
    else if(Monthname.equals("DECEMBER")){
        monthNumber = 12;
    }
    else{
        monthNumber = 1;
    }
    }
    
        // Set a series of else-if statements that ignore case for the input
        // If "january" monthNumber is 1
        // If "february" monthNumber is 2
        // Continue the pattern
        // If something else, monthNumber defaults to 1


    // Create a void method named setMonthNumber that accepts an int.
    public void setMonthNumber(int number){
        if(number > 12 || number < 1){
            monthNumber = 1;
        }
        else{
            monthNumber = number;
        }
    }
        // If the number is smaller than 1 or larger than 12
        // Set monthNumber to 1
        // Otherwise set monthNumber to the input

    // Create an int returning method named getMonthNumber
        // Return the monthNumber
    public int getMonthNumber(){
        return monthNumber;
    }
    // Create a string returning method named getMonthName
    public String getMonthName(){
        String MonthName;
        switch(monthNumber){
            case 1:
            MonthName = "January";
            break;
            case 2:
            MonthName = "February";
            break;
            case 3:
            MonthName = "March";
            break;
            case 4:
            MonthName = "April";
            break;
            case 5:
            MonthName = "May";
            break;
            case 6:
            MonthName = "June";
            break;
            case 7:
            MonthName = "July";
            break;
            case 8:
            MonthName = "August";
            break;
            case 9:
            MonthName = "September";
            break;
            case 10:
            MonthName = "October";
            break;
            case 11:
            MonthName = "November";
            break;
            case 12:
            MonthName = "December";
            break;
            default:
                MonthName = "Unknown";
        }

            return MonthName;
    }
        // Create a string to hold the name of the month
        // Use a switch statement that checks monthNumber
            // Case 1, set to "January"
            // Case 2, set to "February"
            // Continue the pattern
            // Set the default to "Unknown"
        // Return the value for name

    // Create a string returning method named toString
        // Return the value from getMonthName

    // Create a boolean returning method named equals that accepts a month object
    public boolean equal(Month month1){
        boolean status;
        if(month1.monthNumber == monthNumber){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
        // Create a bool for status
        // If monthNumber for month 1 is the same as monthNumber for month 2
            // Set status to true
        // Otherwise
            // Set status to false
        // Return the status

    // Create a boolean returning method named equals that accepts a month object
    public boolean greaterThan(Month m1){
        boolean status;
        if(m1.monthNumber < monthNumber){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
        // Create a bool for status
        // If monthNumber for month 1 is greater than monthNumber for month 2
            // Set status to true
        // Otherwise
            // Set status to false
        // Return the status

    // Create a boolean returning method named equals that accepts a month object
    public boolean lessThan(Month m2){
        boolean status;
        if(m2.monthNumber > monthNumber){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
        // Create a bool for status
        // If monthNumber for month 1 is less than monthNumber for month 2
            // Set status to true
        // Otherwise
            // Set status to false
        // Return the status
}
