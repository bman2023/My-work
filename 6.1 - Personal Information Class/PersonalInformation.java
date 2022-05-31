public class PersonalInformation{

    /* ===================================================
    ===== Challenge 6.1 - Personal Information Class =====
    ======================================================

    Design a class that holds the following personal data: name, age, and phone number.
    Write appropriate accessor and mutator methods. Demonstrate the class by writing a
    program that creates three instances of it. One instance should hold your information,
    and the other two should hold your friends' or family member's information.

     */

    public static void main(String[] args) {
        // Create three PersonlInformation objects named myInfo, myFriend1, and myFriend2
        PersonBuilder joe = new PersonBuilder();
        PersonBuilder bob = new PersonBuilder();
        PersonBuilder bill = new PersonBuilder();
        String name1, name2, name3;
        int age1, age2, age3;
        String phone1, phone2, phone3;
        String address1, address2, address3;
        // Set myInfo as follows by calling the appropriate methods:
        
        // Name: "Joe Mahoney"
        name1 = "Joe Mahoney";
        joe.setName(name1);
        // Age: 27
        age1 = 27;
        joe.setAge(age1);
        // Address: "724 22nd Street"
        address1 = "724 22nd Street";
        joe.setAddress(address1);
        // Phone: "(555)555-1234"
        phone1 = "(555)555-1234";
        joe.setPhone(phone1);

        // Set myFriend1's info as following by calling the appropriate methods:
        // Name: "Geri Rose"
         name2 = "Geri Rose";
        bob.setName(name2);
        // Age: 24
        age2 = 24;
        bob.setAge(age2);
        // Address: "149 East Bay Street"
        address2 = "149 East Bay Street";
        bob.setAddress(address2);
        // Phone: "(555)555-5678"
        phone2 = "(555)555-5678";
        bob.setPhone(phone2);
        // Set myFriend2's info as following by calling the appropriate methods:
        // Name: "John Carbonni"
        name3 = "John Carbonni";
        bill.setName(name3);
        // Age: 28
        age3 = 28;
        bill.setAge(age3);
        // Address: "22 King Street"
        address3 = "22 King Street";
        bill.setAddress(address3);
        // Phone: "(555)555-0123"
        phone3 = "(555)555-0123";
        bill.setPhone(phone3);
        // Display myInfo as follows by calling the appropriate methods:

        // My information:

        // Name: Joe Mahoney
        name1 = joe.getName();
        // Age: 27
        age1 = joe.getAge();
        // Address: 724 22nd Street
        address1 = joe.getAddress();
        phone1 = joe.getPhone();
        // Display myFriend1's info as follows by calling the appropriate methods:
        // Friend 1's information:
        // Name: Geri Rose
        name2 = bob.getName();
        // Age: 24
        age2 = bob.getAge();
        // Address: 149 East Bay Street
        address2 =bob.getAddress();
        // Phone: (555)555-5678
        phone2 = bob.getPhone();
        // Display myFriend2's info as follows by calling the appropriate methods:
        // Friend 2's information:
        // Name: John Carbonni
        name3 = bill.getName();
        // Age: 28
        age3 = bill.getAge();
        // Address: 22 King Street
        address3 = bill.getAddress();
        // Phone: 724 22nd Street
        phone3 = bill.getPhone();

        System.out.println("My information:\nName: " + name1 + "\nAge: "+ age1 +"\nAddress: " + address1 + "\nPhone: " + phone1 + "\n\nFriend #1's information:\nName: " + name2 + "\nAge: " + age2 + "\nAddress: "+ address2 + "\nPhone: " + phone2 + "\n\nFriend #2's information:\nName: " + name3 + "\nAge: " + age3 + "\nAddress: " + address3 + "\nPhone: " + phone3);

    }
}

