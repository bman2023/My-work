// Create a class named TeamLeader that extends ProductionWorker
    public class TeamLeader extends ProductionWorker{
    // Create doubles for monthlyBonus, requiredTrainingHours, and trainingHoursAttended
        double monthlyBonus;
        double requiredTrainingHours;
        double trainingHoursAttended;
    // Create a constructor that accepts the employee's name, employee number, hire date, shift, pay rate, monthly bonus, and number of training hours attended.
        public TeamLeader(String name, Double employeenumber, double hiredate, double shift, double monthlybonus, Double traininghours){

        // Name, employee number, hire date, shift, and pay rate should be handled by the superclass

        // Set monthlyBonus to the input value

        // Set requiredTrainingHours to the input value

        // Set trainingHoursAttended to the input value
     }
    // Create a no-arg constructor for TeamLeader
     public TeamLeader(){
        // Call the super method
        super();
        // Set monthlyBonus to 0.0
        monthlyBonus = 0.0;
        // Set requiredTrainingHours to 0.0
        requiredTrainingHours = 0.0;
        // Set trainingHoursAttended to 0.0
        trainingHoursAttended = 0.0;
     }
    // Create a void method named setMonthlyBonus that accepts a double
    public void setMonthlyBonus(double mb){
        // Set monthlyBonus to the input value
        monthlyBonus = mb;
    }
    // Create a void method named setRequired training hours that accepts a double
    public void setRequired(double r){
        // Set requiredTrainingHours to the input value
       requiredTrainingHours = r;
    }
    // Create a void method named setTrainingHoursAttended that accepts a double
    public void setTrainingHoursAttended(double a){
        // Set trainingHoursAttended to the input value
        trainingHoursAttended = a;
    }
    // Create double returning method named getMonthlyBonus
    public  getMonthlyBonus(){
        // Return the value for monthlyBonus
        return monthlyBonus;
    }
    // Create a double returning method named getRequiredTrainingHours
    public  getRequiredTrainingHours(){
        // Return the value of requiredTrainingHours
        return requiredTrainingHours;
    }
    // Create a double returning method named getTrainingHoursAttended
    public  getTrainingHoursAttended(){
        // Return the value of trainingHoursAttended
        return trainingHoursAttended;
    }
    // I didn't teach this, so it's free.
    @Override

    // Create a string returning method named toString
    public String toString(){
        // Create a string and set it to the value from the superclass set to a string
        String str = super.toString();
        // Set string to string plus the following:
        
        // "\nMonthly Bonus: $(monthlyBonus)"

        // Set string to string plus the following:

        // "\nRequired Training Hours: (requiredTrainingHours)"

        // Set string to string plus the following:
        
        // "\nTraining Hours Attended: (trainingHoursAttended)"

        // Return the string

        }
    }