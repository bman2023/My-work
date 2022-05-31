// Create a class named CharacterTranslator
public class CharacterTranslator{
    // Create a character returning method named getPhoneDigit that accepts a character
    public static char getPhoneDigit(char in){
    // Create a character variable to hold the character
    char digit;
        // Convert the character to uppercase
        char upper = Character.toUpperCase(in);
        // Use a series of else-if statements to see if the character matches a letter

        // Use the following table for conversion:

            // 2 = A, B, C
            if(upper == 'A' || upper == 'B' || upper == 'C'){
                digit = '2';
            }
            // 3 = D, E, F
            else if(upper == 'D' || upper == 'E' || upper == 'F'){
                digit = '3';
            }
            // 4 = G, H, I
            else if(upper == 'G' || upper == 'H' || upper == 'I'){
                digit = '4';
            }
            // 5 = J, K, L
            else if(upper == 'J' || upper == 'K' || upper == 'L'){
                digit = '5';
            }
            // 6 = M, N, 0
            else if(upper == 'M' || upper == 'N' || upper == 'O'){
                digit = '6';
            }
            // 7 = P, Q, R, S
            else if(upper == 'P' || upper == 'Q' || upper == 'R' || upper == 'S'){
                digit = '7';
            }
            // 8 = T, U, V
            else if(upper == 'T' || upper == 'U' || upper == 'U' || upper == 'v'){
                digit = '8';
            }
            // 9 = W, X, Y, Z
            else if(upper == 'W' || upper == 'X' || upper == 'Y' || upper == 'Z'){
                digit = '9';
            }
        // If the character doesn't match anything in the table, just copy the character
            else {
                digit = in;
            }
        // Return the digit
            return digit;
        }
}