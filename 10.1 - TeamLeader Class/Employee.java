// Create a class named Employee
public class Employee{
    // Create strings for name, employeeNumber, and hireDate
    String name;
    String employeeNumber;
    String hireDate;
    // Create a constructor that accepts name, employee number, and hiredate
    public Employee(String n, String e, String h){
        // Set name to the input for name
        name = n;
        // Call the setEmployeeNumber passing the employee number to it
        setEmployeeNumber(e);
        // Set hire date to the input for hire date
        hireDate = h;
    }
    // Create a no-arg constructor for employee
    public Employee(){
        // Set name, employee number, and hire date all to empty strings
        name = "";
        employeeNumber = "";
        hireDate = "";
    }
    // Create a void method named setName that accepts a string
    public void setName(String n){
        // Set name to the input value for name
        name = n;
    }
    // Create a void method named setEmployeeNumber that accepts a string
    public void setEmployeeNumber(String e){
        isValidEmpNum(e);
        employeeNumber = e;
        // Check to see if the input is valid using the isValidEmpNum method
        // If it is, set employeeNumber to the input
        // Otherwise, set employee number to an empty string
    }
    // Create a method named setHireDate that accepts a string
    public setHireDate(){
        // Set hireDate to the input
    }
    // Create a string returning method named getName that returns the value for name
    // Create a string returning method named getEmployeeNumber that returns the value for employee number
    // Create a string returning method named getHireDate that returns a hire date

    // Create a bool returning method named isValidEmpNum that accepts a string
    public boolean isValidEmpNum(String e){
        // Create a bool for status and set it to false
        boolean status = false;
        char [] empNum = e.toCharArray();
        // Verify the following things. If any of them are not true, set status to false.
         // The length should be exactly 5 characters

        if(empNum.length < 5 || empNum.length > 5){
            status = false;
        }
        else{
            for(int i = 0; i < empNum.length; i++){
              char emp = empNum[i];
            // The first 3 characters should be digits
            
            // The next character should be a dash

            // The last character should be a letter
            }
        }
        // Return the value for status
        return status;
        
    }
    // This is the toString method referenced in the TeamLeader class.
    // This method is complete and correct. Do not modify.
    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber == "")
            str += "INVALID EMPLOYEE NUMBER";
        else
            str += employeeNumber;

        str += ("\nHire Date: " + hireDate);
        return str;
    }
}