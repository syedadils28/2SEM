/*
4. Write a Java program to demonstrate a division by zero exception
 */

public class Program4 {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            System.out.println("Quotient: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Number cant be divided by zero ");
        }
    }
}