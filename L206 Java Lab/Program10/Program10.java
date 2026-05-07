/*10. Write a Java program to implement a Queue using user defined
Exception Handling (also make use of throw, throws). a. Complete the
following: b. Create a package named shape. c. Create some classes in the
package representing some common shapes like Square, Triangle, and
Circle. d. Import and compile these classes in other program.
 */

import Shape.Rectangle1;
import Shape.Square;
import Shape.Circle1;

public class Program10 {
    public static void main(String args[]) {
        Rectangle1 rect = new Rectangle1();
        rect.setRectangle(5.6, 6.4);
        rect.area();
        Square sq = new Square();
        sq.setSquare(10.5);
        sq.area();
        Circle1 round = new Circle1();
        round.setCircle(5.6);
        round.area();
    }
}