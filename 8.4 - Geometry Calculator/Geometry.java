// Create a class named Geometry
public class Geometry{
    // Create a static class named circleArea that returns a double and accepts a double
        // Return pi * r * r
    public static double circleArea(double r){
        double area;
        area = r * r * Math.PI;
        return area;
    }
    // Create a static class named rectangleArea that returns a double and accepts two doubles
        // Return length times width
    public static double rectangleArea(double L, double w){
        double area;
        area = L * w;
        return area;
    }
    // Create a static class named triangleArea that returns a double and accepts two doubles
        // Return base * height * 0.5
        public static double triangleArea(double B, double h){
            double area;
            area = B * h * .5;
            return area;
        }
}