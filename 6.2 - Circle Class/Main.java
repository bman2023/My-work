import java.util.Scanner;

public class Main {

    /* =====================================
    ===== Challenge 6-7 - Circle Class =====
    ========================================

    Write a Circle class that has the following fields:
        - radius: a double
        - PI - a final double initialized with the value 3.14159

    The class should have the following methods:
        - Constructor. Accepts the radius of the circle as an argument.
        - Constructor. A no-arg constructor that sets the radius field to 0.0.
        - setRadius. A mutator method for the radius field.
        - getRadius. An accessor method for the radius field.
        - area. Returns the area of the circle, which is calculated as
          area = PI * radius * radius
        - diameter. Returns the diameter of the circle, which is calculated as
          diameter = radius * 2
        - circumference. Returns the circumference of the circle, which is calculated as
          circumference = 2 * PI * radius

     Write a program that demonstrates the Circle class by asking the user for the circle's radius,
     creating a Circle object, and then reporting the circle's area, diameter, and circumference.

     */
    public static void main(String[] args) {
        // The radius of a circle
        Circle box = new Circle();
        double radius = 0.0; 
        double PI = 3.14159;
        double area = 0;
        double diameter = 0;
        double circumference = 0;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the radius of a circle.
        System.out.print("Enter the radius of a circle: ");
        radius = keyboard.nextDouble();
        // Create a Circle object.

        // Display geometric info about the circle.
        box.getRadius(radius);
        box.area(area, PI, radius);

        box.diamter(diameter, radius);
        box.bill(circumference, PI, radius);
    }
}
