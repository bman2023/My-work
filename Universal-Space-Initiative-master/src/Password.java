import java.util.Random;

// import com.mifmif.common.regex.Generex;

public class Password {
    /**
     * Boolean isValid(String)
     * Checks given raw @param password against this.passwordRegex rules.
     *
     * @param password: UTF String of atempted password.
     * @return: True if valid password, false otherwise.
     */
    public boolean isValid(String password) {
        // Password requirements are outlined in this.passwordRegex. This could be
        // expanded into actual adjustable rules later on.
        // return password.matches(passwordRegex);
        return true;
    } // meth isValid

    /**
     * String generate()
     * Create a new password based off of this.passwordRegex rules.
     *
     * @return: UTF String of the generated password.
     */
    public String generate() {
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        return Integer.toString(random.nextInt(max - min) + min);
    } // meth generate
} // cls Password
