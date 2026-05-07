/*10. Write a Java program to implement a Queue using user defined
Exception Handling (also make use of throw, throws). a. Complete the
following: b. Create a package named shape. c. Create some classes in the
package representing some common shapes like Square, Triangle, and
Circle. d. Import and compile these classes in other program.
 */

package Shape;

public class Rectangle1 {
    private double length, breadth;

    public void setRectangle(double len, double br) {
        length = len;
        breadth = br;
    }

    public void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle =" + area);
    }
}
