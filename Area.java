import java.util.Scanner;

class ShapeArea
    {
    double area(double radius) 
    { // Circle
        return 3.14 * radius * radius;
    }

    double area(double length, double width) 
    { // Rectangle
        return length * width;
    }

    double area(double base, double height, boolean triangle) 
    { // Triangle
        return 0.5 * base * height;
    }
}

public class Area 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ShapeArea shape = new ShapeArea();

        System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        if (choice == 1) 
        {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            System.out.println("Area: " + shape.area(radius));
        } else if (choice == 2) 
        {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            System.out.println("Area: " + shape.area(length, width));
        } else if (choice == 3)
        {
            System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            System.out.println("Area: " + shape.area(base, height, true));
        } else 
        {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

