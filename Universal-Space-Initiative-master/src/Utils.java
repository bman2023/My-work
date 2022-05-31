import java.io.*;

public class Utils {
    /**
     * void writeBinaryFile(String, String)
     * Outputs data to the project's 'data' path as a '.dat' file.
     *
     * @param name:    File name, not including path or filetype.
     * @param content: String data to be sent to the file.
     *
     * @throws IOException
     **/
    public static void writeBinaryFile(String name, String content) throws IOException {
        // Plug entered name into predetermined path, localizes file saving locations.
        FileOutputStream fstream = new FileOutputStream("Data/" + name + ".dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);
        // No type checking, can easily make override methods later that send to this
        // one with a String.
        outputFile.writeUTF(content);
        // Clean up resources.
        outputFile.close();
    } // meth writeBinaryFile

    /**
     * String readBinaryFile(String)
     * Reads the contents of a binary file from project's 'data' path.
     *
     * @param name: The name of the file, not including path or filetype.
     *
     * @throws IOException
     */
    public static String readBinaryFile(String name) throws IOException {
        // Initialized String to hold parsed content.
        String content = "";
        boolean endOfFile = false; // EOF flag
        // Automatically plug filename into predetermined path to localize file
        // locations.
        FileInputStream fstream = new FileInputStream("Data/" + name + ".dat");
        DataInputStream inputFile = new DataInputStream(fstream);
        // Parse file to UTF until the end is reached, and then break silently.
        while (!endOfFile) {
            try {
                content += inputFile.readUTF();
            } catch (EOFException e) {
                // Handle error gracefully to end outer loop.
                endOfFile = true;
            } // try
        } // while
          // Clean up resources.
        inputFile.close();
        return content;
    } // meth readBinaryFile
} // cls Utils
