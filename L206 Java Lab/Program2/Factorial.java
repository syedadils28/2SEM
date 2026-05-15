/*  
2. Write a Java program to list the factorial of the numbers 1 to 10. To
 calculate the factorial value, use while loop. (Hint Fact of 4 = 4*3*2*1)
*/

public class Factorial {
    public static void main(String args[]) {
        int i = 1;
        int fact = 1;
        while (i <= 10) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " is: " + fact);
            i++;
        }
    }
}