/*
4. Write a Java program to demonstrate a division by zero exception
 */

public class DivByzero {
    public static void main(String args[]) {
        try {
            int a = 5, b = 0;
            System.out.println("Quotient is : " + (a / b));
        } catch (Exception e) {
            System.out.println("Number cannot be divided by zero ");
        }
    }
}