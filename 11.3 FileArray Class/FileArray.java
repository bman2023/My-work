import java.io.*;

// Create a class named FileArray
public class FileArray{
    // Create a void method named writeArray that accepts the filename and the array.
    public static void writeArray(String file, int[] number) throws IOException{
        // This method should throw an IOException


    // Create a FileOutputStream and a DataOutputStream
    try{
    FileInputStream fStream = new FileInputStream(file);
    DataInputStream outputfile = new DataInputStream(fStream);
       for(int i = 0; i < number.length ; i++){
        number[i] = outputfile.readInt();
    }
    }
    catch(FileNotFoundException e){
        throw new IOException();
        
    }

    // Use a loop to write the array to the file
 
    // Close the file

    }
    // Create a void array named readArray that accepts the filename and the array.
    public static void readArray(String file, int[] number) throws IOException, FileNotFoundException{
        // This method should throw an IOException

    // Create a FileInputStream and a DataInputStream
    try{
        DataInputStream outputfile = new DataInputStream(new FileInputStream(file));
    for(int i = 0; i < number.length ; i++){
        number[i] = outputfile.read();
        }
        }
        catch(FileNotFoundException e){
            throw new IOException();        
        }
    // Use a loop to read the file into the array
    
    // Close the file
    
        }
    }
