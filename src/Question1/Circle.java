package Question1;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
        radius = 1.0;
    }
    public Circle(double r) {
        super();
        radius = r;
    }
    public Circle(String c, boolean f) {
        super(c, f);
        radius = 1.0;
    }
    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }
    // Getter and Setter because there is literally one whole variable
    public double getRadius() {
        return radius;
    }
    public double setRadius(double r) {
        return radius = r;
    }
    public double getCircumference() { return 2 * pi * radius; }
    public double getArea() { return 3.14 * (radius * radius);}
    @Override
    public String toString() {
        return "A Circle with a radius of " + getRadius() + " which is a subclass of " + super.toString();
    }

    public void scale(double x) {
        radius = radius * x;
    }
}