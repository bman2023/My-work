public class MonthDays
{
    // Fields
    // The mont
    private int m;
    // The year
    private int y;
    /**
     The constructor accepts two integer values,
     the month and year, as arguments.
     @param m The month.
     @param y The year.
     */
    public void getMonth(int mon){
        m = mon;
    }
    public void getYear(int yea){
        y = yea;
    }

    /**
     The numberOfDays method returns the number
     of days in the specified month.
     @return The number of days in the month.
     */
  
        // Local variable for the number of days,
        // initialized to 31.
            public void getDays() {
            if (m == 5 || m == 7 || m == 8 || m == 10 || m == 12 || m == 1 || m == 3){
            System.out.print(" 31 days");
            }
            else if (m == 6 || m == 11 || m == 4 || m == 9){
                System.out.print(" 30 days");
            }
            if (m == 2)
            if (y % 4 == 0){
            System.out.print(" 29 days");
            }
            else
            System.out.print(" 28 days");
        }
        
        // Determine the number of days in the month.
                // January has 31 days.
                // Determine if the year is a leap year.
                    // If so, February has 29 days.
                    // If not, February has 28 days.
                // March has 31 days.
                // April has 30 days.
                
                // May has 31 days.
               
                // June has 30 days.
                
                // July has 31 days.
                
                // August has 31 days.
                
                // September has 30 days.
                
                // October has 31 days.
                
                // November has 30 days.
                
                // Decemeber has 31 days.
                
        // Return the number of days.

}


