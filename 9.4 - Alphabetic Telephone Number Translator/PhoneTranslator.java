public class PhoneTranslator
{
    // This creates a StringBuilder variable named "translated"
    private StringBuilder translated = new StringBuilder(10);

    // Create a constructor named PhoneTranslator that accepts a string
    public PhoneTranslator(String phone){
        char[] ptn = phone.toCharArray();
        // Create a loop to step through each character of the loop
        for (int i = 0; i < ptn.length; i++){
            char untrans = CharacterTranslator.getPhoneDigit(ptn[i]);
            translated.append(untrans);
        }
    // Create a string returning method named getTranslated that accepts no arguments
    }
    public String getTranslated(){
        // Return translated as a string.
        String translate = translated.toString();
        return translate;
    }
}
