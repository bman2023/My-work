import java.io.*;

// Create a class named Crypto
public class Crypto{
    // Create a void method named encryptFile that accepts a string for the input and
    public void encryptFile(String in, String filename)throws IOException, EOFException{
    // a string for the output file name and throws an IOException
        // Create a bool for end of file and set it to false
        boolean end = false;
        // Create a FileInputStream that accepts the filename that the user entered
        FileInputStream fStream = new FileInputStream(filename);
        // Create a DataInputStream that accepts the FileInputStream
        DataInputStream dStream = new DataInputStream(fStream);
        // Create a FileOutputStream that accepts the encrypted.txt filename
        FileOutputStream fOutputStream = new FileOutputStream("encrypted.txt");
        // Create a DataOutputStream that accepts the FileOutputStream
        DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
        // Use a loop to check to see if not the end of file to process it
        do{
            // try
            try{
                // Create a byte that reads the input
                
                // Encrypt the byte by adding 10 to it

                // Output the byte that was encrypted
            }
            // Catch an error
            catch(EOFException){
                // set end of file to true
                end = true;
            }
            // Close both files
        } while(end == false);
    } 
}