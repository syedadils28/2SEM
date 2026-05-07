package Shape;

public class Circle1 {
    private double rad;

    public void setCircle(double radius) {
        rad = radius;
    }

    public void area() {
        double area = (0.5) * 3.14 * rad * rad;
        System.out.println("Area of Rectangle =" + area);
    }
}
