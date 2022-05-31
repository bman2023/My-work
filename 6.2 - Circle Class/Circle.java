public class Circle
{
    double circle;
    double radius;
    /**
     This constructor initializes the object with
     a radius of 0.0.
     */
     
         
     
    /**
     The constructor initializes the object with
     a specified radius.
     @param r The circle's radius.
     */
    public void constructor(){
        radius = 0.0;
    }
    /**
     The setRadius method sets the circle's radius.
     @param r The radius.
     */
    public void setRadius(){
        System.out.println("the radius is " + radius);
    }
    /**
     The getRadius method returns the circle's radius.
     @return The radius.
     */
    public double getRadius(double radius){
    
        return radius;
    }
    /**
     The area method returns the circle's area.
     @return The area of the circle.
     */
    public static double area(double area, double PI, double radius){
        PI = 3.14159;
        area = PI * radius * radius;
        System.out.printf("The circle's area is %,.2f\n" , area);
        return area;
    }
    /**
     The diameter method returns the circle's diameter.
     @return The diamter of the circle.
     */
    public static double diamter(double diameter, double radius) {
        diameter = radius * 2;
        System.out.printf("The circle's diameter is %,.2f\n" , diameter);
        return diameter;
    }
    /**
     The circumference method returns the
     circle's circumference.
     @return The circumference of the circle.
     */
    public static double bill(double circumference, double PI, double radius ){
        PI = 3.14159;
        circumference = 2 * PI * radius;
        System.out.printf("The circle's circumference is %,.2f\n" , circumference);
        return circumference;
    }
        
    
        
    
}
