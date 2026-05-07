/*7. Write a JAVA program to demonstrate Inheritance. Simple Program on
Java for the implementation of Multiple inheritance using interfaces to
calculate the area of a rectangle and triangle.
 */

interface Rectangle {
    void rectangleArea(double w, double h);
}

interface Triangle {
    void triangleArea(double b, double h);
}

class Shapes implements Rectangle, Triangle {
    public void rectangleArea(double w, double h) {
        System.out.println("Rectangle Area is: " + (w * h));
    }

    public void triangleArea(double b, double h) {
        System.out.println("Triangle Area is: " + (0.5 * b * h));
    }
}

class Program7 {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.rectangleArea(5, 6);
        s.triangleArea(4, 3);
    }
}