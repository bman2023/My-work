import java.util.Scanner;

public class ConversionProgram {

    /* ===========================================
    ===== Challenge 5.3 - Conversion Program =====
    ==============================================

    We've been working on a project with the Europeans to do some mining on the moon. There's
    just one problem. They use the Metric system. We need a way to quickly convert between
    their measurements and our measurments.

    The program should ask the user to enter a distance in meters. Once the user has entered
    the distance the program should display the following menu of options for conversion:
    
      1. Convert to kilometers
      2. Convert to inches
      3. Convert to feet
      4. Quit the program
    
    The program should then convert the distance to kilometers, inches, or feet depending on
    the user's selection. Here are the specific requirements.

    - Write a void method named showKilometers, which accepts the number of meters
      as an argument. The method should display the argument converted to kilometers
      Convert the meters to kilometers using the following formulaL

      kilometers = meters * 0.001

    - Write a void method named showInches, which accepts the number of meters as an
      argument. The method should display the argument converted to inches. Convert the
      meters to inches using the following formula:

      inches = meters * 33.37

    - Write a void method named showFeet, which accepts the number of meters as an
      argument. The method should display the argument converted to feet. Convert the
      meters to feet using the following formula:

      feet = meters * 3.281

    - Write a void method named menu that displays the menu of the selections. This method
      should not accept any arguments.

    - The program should continue to display the menu until the user enters 4 to quit the
      program.

    - If the user selects an invalid choice from the menu, the program should display an
      error message.

    Here is an example session with the program, using console input. The user's input is
    indicated as (1).

        Enter a distance in meters: (500)[Enter]
        1. Convert to kilometers
        2. Convert to inches
        3. Convert to feet
        4. Quit the program

        Enter your choice: (1)[Enter]
        500 meters is 0.5 kilometers.

        1. Convert to kilometers
        2. Convert to inches
        3. Convert to feet
        4. Quit the program

        Enter your choice: (3)[Enter]
        500 meters is 1640.5 feet

        1. Convert to kilometers
        2. Convert to inches
        3. Convert to feet
        4. Quit the program

        Enter your choice: (4)[Enter]
        Thank you. Have a nice day!

        Things you need to pass the tests:
        Request 1 - "Enter a distance in meters: "
        Request 2 - "Enter your choice: "
        Request Invalid - "Invalid selection. Enter your choice: "
        When quit - "Thank you. Have a nice day!"
        Output for km - "___ meters is ____ kilometers."
        Output for in - "___ meters is ____ inches."
        Output for ft - "___ meters is ____ feet."
        Prompt 1 - "1. Convert to kilometers"
        Prompt 2 - "2. Convert to inches"
        Prompt 3 - "3. Convert to feet"
        Prompt 4 - s"4. Quit the program"
     */

    public static void main(String[] args) {
      // Create variables for input, selection, and output
      double meters;
      double output;
      // Create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      // Get the distance from the user
      System.out.println("Enter a distance in meters: ");
      meters =keyboard.nextDouble();
        // Display the menu and process the user's
        display(meters, keyboard);
        // selection until 4 is selected.
        

          // Display the menu.
           
          // Tet the user's selection.

          // Validate the user's selection.

          // Process the user's selection.
    }
    // Create a method that displays the program's menu.
    public static void display(double meters, Scanner keyboard){
      System.out.println("1. Convert to kilometers" + "\n2. Convert to inches" + "\n3. Convert to feet" + "\n4. Quit the program\n\nEnter your choice:\n ");
      int i;
      i = keyboard.nextInt();
      double output;
        if (i >= 5 || i <= 0){
        System.out.println("Invalid selection. Enter your choice: ");
        display(meters, keyboard);
         }else if (i == 2){
        output = inches(meters);
        System.out.println( meters + " meters is " + output + " inches.");
        display(meters, keyboard);
         }else if (i == 1){
        output = kilometers(meters);
        System.out.println( meters + " meters is " + output + " kilometers.");
        display(meters, keyboard);
         }else if (i == 3){
        output = feet(meters);
        System.out.println(meters + " meters is " + output + " feet.");
        display(meters, keyboard);
         }else 
          System.out.println("Thank you. Have a nice day!\n");
         System.exit(0);
    }
    // Create a method that displays the km that are equivelent to meters
    public static double inches (double num1){
     double num2;
      num2 = num1 * 39.37;
      return num2;
    }
    // Create a method that displays the inches that are equivelent to meters
    public static double kilometers(double num1) {
       double num2;
       num2 = num1 * 0.001;
       return num2;
    }
    // Create a method that displays the feet that are equivelent to meters
    public static double feet(double num1) {
      double num2;
      num2 = num1 * 3.281;
      return num2;
    }
  }