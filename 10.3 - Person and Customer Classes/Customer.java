// Create a class named Customer that extend the Person class
public class Customer extends Person{
    // Create a string for customerNumber and a bool for mailingList
    String customerNumber;
    boolean mailingList;
    // Create a no-arg constructor for customer
    public Customer(){
        super();
        // Set customerNumber to an empty string
        customerNumber = "";
        // Set mailingList to false
        mailingList = false;
    }
    // Create a constructor for Customer that accepts name, address, phone,
    public Customer(String n, String a, String p, String cn, boolean m){
        // Call the super method passing through the name, address, and phone number
        super(n, a, p);
        // Set customerNumber to the input value
        customerNumber = cn;
        // Set mailing list to the value for mailing list
         mailingList = m;
    }
    // Create a void method named setCustomerNumber that accepts a string
    public void setCustomerNumber(String cn){
        // Set CustomerNumber to the user's input value
        customerNumber = cn;
    }
    // Create a void method named setMailingList that accepts a bool
    public void setMailingList(boolean m){
        // Set mailingList to the value for mailing list
        mailingList = m;
    }
    // Create a string returning method named getCustomerNumber
    public String getCustomerNumber(){
        // Return the customer number
        return customerNumber;
    }
    // Create a bool returning class named getMailingList
    public boolean getMailingList(){
        // Return the value for mailingList
        return mailingList;
    }
}