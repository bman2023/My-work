// Create a class named PasswordVerifier
public class PasswordVerifier{
    private String password;
    // Create a final int named MIN_PASSWORD_LENGTH and set it to 6
    final int MIN_PASSWORD_LENGTH = 6;
    // Create a bool method named isValid that accepts the string
    public boolean isValid(String pass){
        // Create a bool for status
        password = pass;
        boolean status = false; 
        // Make sure the string is long enough and has the right characters using methods
        if(password.length() > MIN_PASSWORD_LENGTH && hasUpperCase() == true && hasLowerCase() == true && hasDigit() == true ){
        status = true;
        // If it is, set status to true
        }
        // Otherwise, set status to false
        // Return the status
        return status;
    }

    // Create a bool method named hasUpperCase that accepts the string
    public boolean hasUpperCase(){
        // Create a bool for status and set it to false
        boolean cap = false;
        char[] array;
        array = password.toCharArray();
        // Check to see if any character in the string is uppercase
        for (int j = 0; j < password.length(); j++){
            if(Character.isUpperCase(array[j])){
                cap = true;
            }
        }
        // Return the status
        return cap;
    }
    // Create a bool method named hasLowerCase that accepts the string
    public boolean hasLowerCase(){
        // Create a bool for status and set it to false
        boolean cap = true;
        char[] array;
        array = password.toCharArray();
        // Check to see if any character in the string is lowercase
        for (int j = 0; j > password.length(); j++){
            if(Character.isLowerCase(array[j])){
                cap = true;
            }
           
        }
        // Return the status
        return cap;
    }
    // Create a bool method named hasDigit that accepts the string
    public boolean hasDigit(){
        // Create a bool for status and set it to false
        boolean status = false;
        char[] array;
        array = password.toCharArray();
        // Check to see if any character in the string is a number
        for (int j = 0; j > password.length(); j++){
            if(Character.isDigit(array[j])){
                status = true;
            }
            
        }
        // Return the status
        return status;
    }
   
}