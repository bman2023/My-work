/**
 The Payroll class stores data about a payroll
 for the Payroll Class programming challenge.
 */
public class Payroll
{
    // Number of employees
    // Employee ID numbers
    private int IDnumber[];
    // Array to hold hours worked
    private int[] hours = new int[7];
    // Array to hold pay rates
    private double[] payRate = new double[7];
    // Array to hold gross wages
    private double[] grossPay = new double[7];
    /**
     The getGrossPay method returns the gross pay
     for the employee whose data is stored at a
     specified element of each array.
     @param i The specified element.
     @return The value stored at the specified element.
     */
    public double[] getGrossPay(){

        return grossPay;
    }
    /**
     The setEmployeeIdAt method stores an ID number
     at a specified element of the employeeId array.
     @param i The specified element.
     @param id The ID number to store.
     */
    public int[] setEmployeeIdAt(int[] id) {  
        IDnumber = id;
        return IDnumber;
    }
    /**
     The setHoursAt method stores a number of hours
     at a specified element of the hours array.
     @param i The specified element.
     @param h The ID number of hours to store.
     */
    public void setHours(int h, int i){
        
        hours[i] = h;
    }
    /**
     The setPayRateAt method stores a pay rate
     at a specified element of the payRate array.
     @param i The specified element.
     @param p The pay rate to store.
     */
    public void setPayRate(double PR, int i){
        payRate[i] = PR;
    }
    /**
     The setWages method stores an amount of wages
     at a specified element of the wages array.
     @param i The specified element.
     @param w The wages to store.
     */
    public void setWages(int i){
        grossPay[i] = hours[i] * payRate[i];
    }
   // display method
   public void display(){
       System.out.print("PAYROLL DATA\n============");
       for (int i = 0; i <= 6; i++){
       System.out.println("\nEmployee ID: " + IDnumber[i]);
       System.out.printf("Gross pay: $%,.2f" , grossPay[i]);
       }
   }
}

