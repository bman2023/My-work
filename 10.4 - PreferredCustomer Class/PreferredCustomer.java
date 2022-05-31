// Create a class named PreferredCustomer that extends Customer
public class PreferredCustomer extends Customer{
    // Create doubles for purchase and discount level
    double purchase;
    double discountlevel;
    // Create a no-arg constructor for PreferredCustomer
    public PreferredCustomer(){
        // Run the super method
        super();
        // Set purchases to 0.0
        purchase = 0.0;
        // Set discountLevel to 0.0
        discountlevel = 0.0;
    }
    // Create a constructor that accepts the following arguments:
    // Name, address, phone, customer number, mailing list, and amount purchased
    public PreferredCustomer(String n, String a, String p, String cn, boolean ml, double ap){
        // Run the super method passing the following:
        // Name, address, phone, customer number, and amount purchased
        super(n, a, p, cn, ml);
        // Call the setPurchase method passing the amount purchased value
        setPurchases(ap);
    }
    // Create a void method named setPurchases that accepts a double
    public void setPurchases(double ap){
        // Set purchases to the value passed
        purchase = ap;
        // Determine the discount using the following values/table
        if(purchase >= 2000){
            discountlevel = .10; 
        }
        else if(purchase >= 1500 && purchase < 2000){
            discountlevel = .07;
        }
        else if(purchase >= 1000 && purchase < 1500){
            discountlevel = .06;
        }
        else if(purchase >= 500 && purchase < 1000){
            discountlevel = .05;
        }
        else{
            discountlevel = .0;
        }
            // >=$2000 = 10% Discount
            // >=$1500 = 07% Discount
            // >=$1000 = 06% Discount
            // >=$ 500 = 05% Discount
            // Else    = 00% Discount
    }
    // Create a double returning method named getPurchases
    public double getPurchases(){
        // Return the value for purchases
        return purchase;
    }
    // Create a double returning method named getDiscountLevel
    public double getDiscountLevel(){
        // Return the value for discountLevel
        return discountlevel;
    }
}