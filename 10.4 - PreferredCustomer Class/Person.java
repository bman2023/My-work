/*
============================================================================
===== COPY AND PASTE THE ENTIRE CONTENTS OF PERSON FROM CHALLENGE 10.3 =====
============================================================================
 */
// Create a class named Person
public class Person{
    // Create strings for name, address, and phone number
    private String name;
    private String address;
    private String phonenumber;
    // Create a no-arg constructor
    public Person(){
        // Set name, address, and phone to empty strings.
        name = "";
        address = "";
        phonenumber = "";
    }
    // Create a constructor that accepts strings for name, address, and phone number
    public Person(String n, String a,String p){
        // Set name, address, and phone number to the user's inputs
        name = n;
        address = a;
        phonenumber = p;
    }
    // Create a void method named setName that accepts a string
    public void setName(String n){
        // Set name to the user's input
        name = n;
    }
    // Create a void method named setAddress that accepts a string
    public void setAddress(String a){
        // Set name to the user's input
        address = a;
    }
    // Create a void method named setPhone that accepts a string
    public void setPhone(String p){
        // Set phone to the user's input
        phonenumber = p;
    }
    // Create a method named getName that returns a string
    public String getName(){
        // Return the user's input for name
        return name;
    }
    // Create a method named getAddress that returns a string
    public String getAddress(){
        // Return the user's input for address
        return address;
    }
    // Create a method named getPhone that returns a string
    public String getPhone(){
        // Return the user's input for phone
        return phonenumber;
    }
}