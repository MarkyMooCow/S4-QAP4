package Question1;
import java.lang.Math;

public class Triangle extends Shape {

    protected double side1, side2, side3;

    // Constructors
    public Triangle() {
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double s) {
        super();
        side1 = s;
        side2 = s;
        side3 = s;
    }

    public Triangle(double s1, double s2, double s3) {
        super();
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public Triangle(String c, boolean f) {
        super(c, f);
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle(double s, String c, boolean f) {
        super(c, f);
        side1 = s;
        side2 = s;
        side3 = s;
    }
    public Triangle(double s1, double s2, double s3, String c, boolean f) {
        super(c, f);
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // Getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Setters
    public double setSide1(double s) {
        return side1 = s;
    }
    public double setSide2(double s) {
        return side2 = s;
    }
    public double setSide3(double s) {
        return side3 = s;
    }

    // Equations
    public double getS() {
        return (side1 + side2 + side3) / 2;
    }

    public double getArea() {
        double s = getS();
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        if (side1 == side2 && side1 == side3 && side2 == side3) {
        return "An Equilateral Triangle with each side equaling " + getSide1() + " which is a subclass of " + super.toString();
    } else {
        return "A Triangle with lengths of (" + getSide1() + "/" + getSide2() + "/" + getSide3() + ") which is a subclass of " + super.toString();
    }}
    public void scale(double x) {
        side1 = side1 * x;
        side2 = side2 * x;
        side3 = side3 * x;
    }
}
