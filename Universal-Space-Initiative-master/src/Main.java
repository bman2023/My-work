import java.io.File;
import java.util.Scanner;

public class Main {
    private static Astronaut[] astronauts;
    private static String password = "";

    public static void main(String[] args) throws Exception {
        // Global keyboard handler.
        Password generator = new Password();
        Scanner keyboard = new Scanner(System.in);
        File passwordFile = new File("Data/Password.dat");
        File dataPath = new File("Data/");
        if (!dataPath.isDirectory()) {
            dataPath.mkdir();
        } // if
        System.out.print("Welcome to the Human Space Initiative.\t");
        // Check if "Password" file exists.
        if (passwordFile.exists()) {
            // Ask for password, considering 'password' exists.
            password = Utils.readBinaryFile("Password");
            System.out.println("Please enter the access password that was given to you upon original launch.");
            String input = keyboard.nextLine();
            if (input.equals(password)) {
                System.out.println("Password correct. Proceeding to Main Control.");
                // If statements both fall through, leading on in the method.
            } else {
                System.out.println(
                        "We are sorry, that password is incorrect. Please contact a superior and explain why you failed.");
                System.exit(0);
            } // if
        } else {
            // Generate new password and save it.
            password = generator.generate();
            System.out.println(
                    "Considering this is your first time running the program, we have generated a password for you. Do not loose this, there is no way to get it back. The password follows:\n"
                            + password);
            passwordFile.createNewFile();
            Utils.writeBinaryFile("Password", password);
        } // if
          // Regardless of path, if chains lead here if the program should continue.
        boolean running = true; // Program finite state machine.
        int input = 0; // Captures input from the menu. Declare it outside the loop to reduce overhead
                       // of regeneration.
        // Main loop, print menu, collect data and pass relevant data to relevant
        // method.
        while (running) {
            // display menu.
            System.out.println(
                    "Main Control: Select an option numerically\n\t\t1\tLaunch a Flight,\n\t\t2\tView Astronaut Listing,\n\t\t3\tModify An Astronaut's Records,\n\t\t4\tAdd or Remove Astronaut Records,\n\t\t5\tExit the program.");
            // Gather input.
            input = Integer.parseInt(keyboard.nextLine());
            switch (input) {
                case 1:
                    Flight.Launch(keyboard);
                case 2:
                    displayRecords();
                case 3:
                    modifyRecords();
                case 4:
                    addOrRemoveRecords(keyboard);
                case 5:
                    running = false;
            } // Switch input
        } // while
          // Fallthrough: Exit program.
        System.out.println("Thank you for using the Universal space Initiative. Exitting.");
        System.exit(0);
    } // meth Main

    public static void displayRecords() {
        // Gracefully handle 'no astronauts' case.
        if (astronauts != null) {
            // Iterate over Astronauts, display data.
            System.out.println(astronauts.length + " astronauts:");
            for (Astronaut a : astronauts) {
                String data = a.getSerialNumber() + ": " + a.getName() + ": " + a.getBirth() + "-present\n";
                data += "Contact:\n\t\tEmail: " + a.getEmail() + "\n\t\tPhone: " + a.getPhoneNumber()
                        + "\n\t\tEarth address: " + a.getAddress() + "\n";
                System.out.println(data + "\n\n");
            } // foreach astronauts
        } else {
            System.out.println("There are no astronauts entered into the system.");
        } // if
    } // meth displayRecords

    public static void modifyRecords() {
        // TODO.
    } // meth modifyRecords

    public static void addOrRemoveRecords(Scanner keyboard) {
        int input = 0; // Declare outside of loop for overhead.
        boolean running = true;
        // Menu loop.
        while (running) {
            // Quick buildup of dynamic String. Messy solution, large overhead from
            // regenerating string every frame.
            String data = "Select an option:";
            int counter = 0;
            if (astronauts != null) {
                for (int i = 0; i < astronauts.length; i++) {
                    counter += 1;
                    data += i + "\tDelete " + astronauts[i].getName() + "\n";
                } // for
            } // if
            data += counter + 1 + "\t\tAdd a Record.";
            data += counter + 2 + "\t\tBack.";
            System.out.println(data);
            input = Integer.parseInt(keyboard.next());
            if (input > 0 && input < counter + 2) {
                System.out.print("Are you sure you wish to delete Astronaut " + astronauts[input].getName()
                        + "? This action is permanent. If you do, please enter the password below.");
                String result = keyboard.next();
                if (result.equals(password)) {
                    System.out.println("Astronaut " + astronauts[input].getName() + " has been deleted.");
                    // Create a smaller array, copy over the original, minus the removed astronaut,
                    // and replace.
                    Astronaut[] temp = new Astronaut[astronauts.length - 1];
                    System.arraycopy(astronauts, 0, temp, 0, input);
                    System.arraycopy(astronauts, input + 1, temp, input, astronauts.length - input - 1);
                    astronauts = temp;
                } else {
                    System.out.println("Apologies, password incorrect.");
                } // if
            } else if (input == counter + 1) {
                System.out.println("Please enter the name of the new astronaut.");
                String name = keyboard.next();
                System.out.println("enter the date of birth.");
                String birth = keyboard.next();
                System.out.println("Enter the Earth Address.");
                String address = keyboard.next();
                System.out.println("Enter the EMail.");
                String email = keyboard.next();
                System.out.println("Enter the phone number.");
                String phone = keyboard.next();
                System.out.println("How much does the Astronaut get payed?");
                double payRate = Double.parseDouble(keyboard.next());
                System.out.println("How much does the astronaut weigh?");
                int weight = Integer.parseInt(keyboard.next());
                System.out.println("Finally, please enter any \'Next of Kin\' information, if any.");
                String nextOfKin = keyboard.next();
                // Serial number = last number + 1.
                int serialNumber = astronauts[-1].getSerialNumber() + 1;
                Astronaut astronaut = new Astronaut(name, birth, address, email, phone, payRate, weight, nextOfKin,
                        serialNumber);
                // Replace old astronauts array.
                Astronaut[] temp = new Astronaut[astronauts.length + 1];
                for (int i = 0; i < astronauts.length; i++) {
                    temp[i] = astronauts[i];
                } // for
                temp[-1] = astronaut; // Autofill the last index with the newly created astronaut.
                astronauts = temp;
                System.out.print(astronauts[-1].getName() + " now has records. Congratulations!\n\n");
            } else if (input == counter + 2) {
                running = false;
            } // if
        } // while
        System.out.print("Exitting to Main Menu.\n\n");
    } // meth addOrRemoveRecords
} // cls Main
