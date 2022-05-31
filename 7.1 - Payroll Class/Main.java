import java.util.Scanner;

public class Main {

    /* ======================================
    ===== Challenge 7-2 - Payroll Class =====
    =========================================

    Write a Payroll class that uses the following arrays as fields:

        - employeeID. An array of seven integers to hold employee identification numbers.
          The array should be initialized with the following numbers:
          5658845  4520125  7895122  8777541  8451277  1302850  7580489
        - hours. An array of seven integers to hold the number of hours worked by each
          employee.
        - payRate. An array of seven doubles to hold each employee's hourly pay rate.
        - wages. An array of seven doubles to hold each employee's gross wage.

    The class should relate the data in each array through the subscripts. For example, the
    number in element 0 of the hours array should be the number of hours worked by the employee
    whose identification number is stored in element 0 of the employeeId array. That same
    employee's pay rate should be stored in element 0 of the payRate array.

    In addition to the appropriate accessor and mutator methods, the class should have a method
    that accepts an employee's identification number as an argument and returns the gross pay
    for that employee.

    Demonstrate the class in a complete program that displays each employee number and asks
    the user to enter that employee's hours and pay rate. It should then display each employee's
    identification number and gross wages.

    *Input Validation: Do not accept negative values for hours or numbers less than 6.00 for pay rate.*

     */

    public static void main(String[] args) {
      int i = 0;
      // Employee ID numbers
      int[] IDnumber = new int [7];
      IDnumber[0] = 5658845;
      IDnumber[1] = 4520125;
      IDnumber[2] = 7895122;
      IDnumber[3] = 8777541;
      IDnumber[4] = 8451277;
      IDnumber[5] = 1302850;
      IDnumber[6] = 7580489;
      // Hours worked
      int hours;
      // Hourly pay rate
      double pay;
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      // Create a Payroll object.
      Payroll boss = new Payroll();
      boss.setEmployeeIdAt(IDnumber);
      // Get the hours and pay rate for each employee.
      for(i = 0; i < 7; i++){
          // Get the hours worked.
          System.out.print("Enter the hours worked by employee number " + IDnumber[i] + ": ");
          hours = keyboard.nextInt();
          
          // Validate hours worked.
          if(hours < 0){
              System.out.print("ERROR: Enter 0 or greater for hours:");
              hours = keyboard.nextInt();
          }
          boss.setHours(hours, i);
          // Get the hourly pay rate.
          System.out.print(" Enter the hourly pay rate for employee number " + IDnumber[i] + ": ");
          pay = keyboard.nextDouble();
         
          // Validate pay rate.
          if(pay <= 6){
              System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
              pay = keyboard.nextDouble();
          }
          boss.setPayRate(pay,i);
          boss.setWages(i);
      }
      keyboard.close();
      // Display the payroll data for each employee.
      for(i = 0; i <= 6; i++);
      boss.display();
    }
}

