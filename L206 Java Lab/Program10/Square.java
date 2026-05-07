package Shape;

public class Square {
    private double side;

    public void setSquare(double val) {
        side = val;
    }

    public void area() {
        System.out.println("Area of Square=" + (side * side));
    }
}