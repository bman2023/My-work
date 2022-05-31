public class Main {

    /* ====================================
    ===== Challenge 8.3 - Month Class =====
    =======================================

    Write a class named Month. The class should have an int field named monthNumber that
    holds the number of the month. For example, January would be 1, February would be 2,
    and so forth. In addition, provide the following method:

    - A no-arg constructor that sets the monthNumber field to 1.
    - A constructor that accepts the number of the month as an argument. It should set the
      monthNumber field to the value passed as the argument. If a value less than 1 or greater
      than 12 is passed, the constructor should set monthNumber to 1.
    - A constructor that accepts the name of the month, such as "January" or "February"
      as an argument. It should set the monthNumber field to the correct corresponding value.
    - A setMonthNumber method that accepts an int argument, which is assigned to the
      monthNumber field. If a value less than 1 or greater than 12 is passed, the method
      should set monthNumber to 1
    - A getMonthNumber method that returns the value in the monthNumber field.
    - A getMonthName method that returns the name of the month. For example, if the
      monthNumber field contains 1, then this method should return "January."
    - A toString method that returns the same value as the getMonthName method.
    - An equals method that accepts a Month object as an argument. If the argument object
      holds the same data as the calling object, this method should return true. Otherwise,
      it should return false.
    - A greaterThan method that accepts a Month object as an argument. If the calling
      object's monthNumber field is greater than the argument's monthNumber field, this
      method should return true. Otherwise, it should return false.
    - A lessThan method that accepts a Month object as an argument. If the calling object's
      monthNumber field is less than the argument's monthNumber field, this method should
      return true. Otherwise, it should return false.

    This class is complete, your job is to develop the month class.
     */

    public static void main(String[] args) {
        // Use the no-arg constructor.
        Month m = new Month();
        String Mname = m.getMonthName();
        System.out.println("Month " + m.getMonthNumber() +
                " is " + Mname);
        // Set the month number to the values 0 through 12
        // (0 is invalid), and display the resulting month name.
        for (int i = 0; i <= 12; i++)
        {
            m.setMonthNumber(i);
            String Mname2 = m.getMonthName();
            System.out.println("Month " + m.getMonthNumber() +
                    " is " + Mname2);
        }

        // Use the 2nd constructor to create two objects.
        Month m1 = new Month(10);
        Month m2 = new Month(5);
        String m1name = m1.getMonthName();
        String m2name = m2.getMonthName();
        System.out.println("Month " + m1.getMonthNumber() +
                " is " + m1name);
        System.out.println("Month " + m2.getMonthNumber() +
                " is " + m2name);

        // Test for equality.
        if (m1.equal(m2))
            System.out.println(m1name + " and " + m2name + " are equal.");
        else
            System.out.println(m1name + " and " + m2name + " are NOT equal.");

        // Is m1 greater than m2?
        if (m1.greaterThan(m2))
            System.out.println(m1name + " is greater than " + m2name);
        else
            System.out.println(m1name + " is NOT greater than " + m2name);

        // Is m1 less than m2?
        if (m1.lessThan(m2))
            System.out.println(m1name + " is less than " + m2name);
        else
            System.out.println(m1name + " is NOT less than " + m2name);

        // Use the 3rd constructor to create three objects.
        Month m11 = new Month("March");
        String m11name = m11.getMonthName();
        Month m12 = new Month("December");
        String m12name = m12.getMonthName(); 
        Month m13 = new Month("Bad Month");
        String m13name = m13.getMonthName();
        System.out.println("Month " + m11.getMonthNumber() +
                " is " + m11name);
        System.out.println("Month " + m12.getMonthNumber() +
                " is " + m12name);
        System.out.println("Month " + m13.getMonthNumber() +
                " is " + m13name);    }
}
