import java.util.Random;
import java.util.Scanner;

public class Flight {
    public static void Launch(Scanner keyboard) throws InterruptedException {
        double fuel;
        double burned;
        double burnRate;
        double speed;
        double hight = 0;
        double finalFuel; 
        System.out.println("Welcome to the launch pad.");
        while (true) {
            System.out.println("How much fuel do you have?");
            fuel = keyboard.nextDouble();
            if (fuel <= 1) {
                System.out.println("You cant have less than 1");
            }
            break;
        } // while
        while (true) {
            System.out.println("How long was the fuel burned for ");
            burned = keyboard.nextDouble();
            if (burned <= 1) {
                System.out.println("You cant have less than 1");
            }
            break;
        }
        burnRate = (fuel / burned);
        while (true) {
            System.out.println("How much do you want left.");
            finalFuel = keyboard.nextDouble();
            if (finalFuel <= -1) {
                System.out.println("You cant have less than 0");
            }
            break;
        }
        // Count down.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Take off!");
        speed = burnRate * 30;
        long sleepTime = 100;
        while (fuel > finalFuel) {
            fuel -= burnRate;
            System.out.print(fuel + " Fuel Remaining.\t");
            Thread.sleep(sleepTime);
            hight += speed;
            System.out.println(hight + " Meter High");
        }
        if (hight > 70000) {
            System.out.println("Space walk: ACTIVE");
            for (int i = 0; i < 100; i++) {
                Thread.sleep(150);
                System.out.println("Time left in free fall: " + i + " Second");
            }
        }
        System.out.println("\nYou're out of fuel.");
        while (hight >= 10000) {
            speed += -9.8;
            hight += speed;
            Thread.sleep(sleepTime);
            System.out.println(hight + " Meter High");
            if (speed <= -3000 && hight < 7000) {
                System.out.println("BOOM BOOM!");
                System.exit(0);
            }
        }
        System.out.println("Parachute");
        while (hight > 0) {
            speed = -7;
            hight += speed;
            Thread.sleep(sleepTime);
            if (hight < 0) {
                hight = 0;
            }

            System.out.println(hight + " Meter High");

        }
        System.out.println("Your landing! Great Job!");
    }
}
