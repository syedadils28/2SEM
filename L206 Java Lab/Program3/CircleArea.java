/*3.1 To find the area and circumference of the circle by accepting the radius
from the user. */

import java.util.Scanner;

public class CircleArea {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: " + circumference);

        input.close();

    }
}
