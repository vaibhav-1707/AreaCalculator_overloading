import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaCalculator {

    // Overloaded methods for area calculation
    double area(double side) {
        return side * side;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double base, double height, boolean isTriangle) {
        return isTriangle ? (base * height) / 2 : area(base, height);
    }

    double area(int radius) {
        return Math.PI * radius * radius;
    }

    // Reusable method for reading a double input with a message
    public static double getDoubleInput(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid numeric value.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.print("Enter the shape (square, rectangle, triangle, circle): ");
        String shape = sc.nextLine().trim().toLowerCase();

        switch (shape) {
            case "square" -> {
                double side = getDoubleInput(sc, "Enter the side of the square: ");
                System.out.println("The area of the square is: " + ac.area(side));
            }
            case "rectangle" -> {
                double length = getDoubleInput(sc, "Enter the length of the rectangle: ");
                double width = getDoubleInput(sc, "Enter the width of the rectangle: ");
                System.out.println("The area of the rectangle is: " + ac.area(length, width));
            }
            case "triangle" -> {
                double base = getDoubleInput(sc, "Enter the base of the triangle: ");
                double height = getDoubleInput(sc, "Enter the height of the triangle: ");
                System.out.println("The area of the triangle is: " + ac.area(base, height, true));
            }
            case "circle" -> {
                double radius = getDoubleInput(sc, "Enter the radius of the circle: ");
                System.out.println("The area of the circle is: " + ac.area((int) radius));
            }
            default -> System.out.println("Invalid shape. Please enter square, rectangle, triangle, or circle.");
        }

        sc.close();
    }
}