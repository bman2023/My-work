
/**
 The Validator class stores data about valid account numbers
 for the Charge Account Validation programming challenge.
 This version of the class uses a sequential search.
 */

public class Validator
{
    // Array of valid numbers
    int[] IDnumber = new int [18];
{
    IDnumber [0] = 5658845;
    IDnumber [1] = 4520125;
    IDnumber [2] = 7895122;
    IDnumber [3] = 8777541;
    IDnumber [4] = 8451277;
    IDnumber [5] = 1302850;
    IDnumber [6] = 8080152;
    IDnumber [7] = 4562555;
    IDnumber [8] = 5552012;
    IDnumber [9] = 5050552;
    IDnumber [10] = 7825877;
    IDnumber [11] = 1250255;
    IDnumber [12] = 1005231;
    IDnumber [13] = 6545231;
    IDnumber [14] = 3852085;
    IDnumber [15] = 7576651;
    IDnumber [16] = 7881200;
    IDnumber [17] = 4581002;
}

    /**
     The isValid method uses a sequential search
     to determine whether a number appears in
     the array of valid numbers.
     @param number The number to search for.
     @return true if the number is found, false
     otherwise.
     */
        public void isValid(int number)
        {
            boolean results;
           
            
            results = Search(IDnumber, number);
            if(results == true)
            {
                System.out.println("That's a valid account number. ");
            }
            else
            {
                System.out.println("That's an INVALID account number.");
            }
        }
            

            public boolean Search(int[] array, int input){
                int i = 0;
                boolean match = false;
                while((IDnumber.length > i ) && match == false){
                    if(IDnumber[i] == input){
                        match = true;
                    }
                    i++;
                }
                 return match;
        }


        
            
        
                
            
         
        
    
}

