package trainingprojects.taskOne;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select the shape\n\t1- Circle\n\t2- Square\n\t3- Triangle\n\t4- Rectangle\nShape:");
        int shape = in.nextInt();
        System.out.println("\n\t1- Area\n\t2- Circumference\nType: ");
        int type = in.nextInt();
        switch (shape) {
            case 1:
                System.out.println("Enter radius of circle:");
                float radius = in.nextFloat();
                Circle circle = new Circle(radius);

                if (type == 1) {
                    circle.area();
                } else {
                    circle.circumference();
                }
                break;

            case 2:
                System.out.println("Enter length of square:");
                float length = in.nextFloat();
                Square square = new Square(length);

                if (type == 1) {
                    square.area();
                } else {
                    square.circumference();
                }
                break;

            case 3:
                
                if (type == 1) {
                    System.out.println("Enter base length of triangle:");
                    float baseLength = in.nextFloat();
                    System.out.println("Enter height of triangle:");
                    float height = in.nextFloat();
                    Triangle triangle = new Triangle(baseLength, height);
                    triangle.area();
                } else {
                    System.out.println("Enter first rib length of triangle:");
                    float firstRib = in.nextFloat();
                    System.out.println("Enter second rib length of triangle:");
                    float secondRib = in.nextFloat();
                    System.out.println("Enter third rib length of triangle:");
                    float thirdRib = in.nextFloat();
                    Triangle triangle = new Triangle(firstRib, secondRib, thirdRib);
                    triangle.circumference();
                }
                break;
            case 4:
                System.out.println("Enter width of rectangle:");
                float width = in.nextFloat();
                System.out.println("Enter height of rectangle:");
                float height = in.nextFloat();
                Rectangle rectangle = new Rectangle(width, height);
                if (type == 1) {
                    rectangle.area();
                } else {
                    rectangle.circumference();
                }
                break;
            default:
                break;
        }
    }
}
