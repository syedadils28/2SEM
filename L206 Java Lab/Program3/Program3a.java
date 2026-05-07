/*3.1 To find the area and circumference of the circle by accepting the radius
from the user. */

import java.util.Scanner;

public class Program3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Circle Radius: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
        System.out.println("Circumference of Circle: " + (2 * Math.PI * radius));
    }
}
