// Define the Shape class
class Shape {
    double length; // Length of the shape
    double width;  // Width of the shape

    // Constructor to initialize length and width
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the shape
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the shape
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Shape objects
        Shape rectangle1 = new Shape(5.0, 3.0); // Example rectangle
        Shape rectangle2 = new Shape(7.0, 4.0); // Another rectangle

        // Print area and perimeter for rectangle1
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.area());
        System.out.println("Perimeter: " + rectangle1.perimeter());

        // Print area and perimeter for rectangle2
        System.out.println("Rectangle 2:");
        System.out.println("Area: " + rectangle2.area());
        System.out.println("Perimeter: " + rectangle2.perimeter());
    }
}
