/*  
2. Write a Java program to list the factorial of the numbers 1 to 10. To
 calculate the factorial value, use while loop. (Hint Fact of 4 = 4*3*2*1)
*/

class Program2 {
    public static void main(String[] args) {
        int fact = 1, i = 1;
        while (i <= 10)
            System.out.println(i + "! = " + (fact = fact * i++));
    }
}