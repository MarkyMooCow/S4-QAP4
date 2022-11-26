package Question1;

// I have never done an ellipse in my life therefore I will follow the sheet
public class Ellipse extends Shape {
    protected double a, b;

    public Ellipse() {
        super();
        a = 1.0;
        b = 1.0;
    }
    public Ellipse(double x, double y) {
        super();
        a = x;
        b = y;
    }
    public Ellipse(String c, boolean f) {
        super(c, f);
        a = 1.0;
        b = 1.0;
    }
    public Ellipse(double x, double y, String c, boolean f) {
        super(c, f);
        a = x;
        b = y;
    }
    // Getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    // Setters
    public double setA(double a) {
        return a = a;
    }
    public double setB(double b) {
        return b = b;
    }

    // Area and perimeter
    public double getArea() {
        return pi * a + b;
    }
    // Found a different solution to the perimeter
    // Discovered by an Indian Mathematician named Ramanujan
    // Coders Note: HOW IN THE WORLD DID PEOPLE FIGURE OUT THESE THINGS?!
    public double getPerimeter() {
        return pi * ((3 * (a + b)) - (Math.sqrt((3 * a) + b) * (a + (3 * b)))); // LIKE HOW?!
    }

    // Unused function that I was using for my original perimeter code.
    public double calculateExponent(double x, int exponent) {
        double y = x;
        for(int i = 1; i <= exponent; i++ ) {
            y = y * x;
        }
        return y;
    }
    public void scale(double x) {
        a = a * x;
        b = b * x;
    }
    public String toString() {
        return "An Ellipse with an A of " + getA() + " and a B of " + getB() + " which is a subclass of " + super.toString();
    }
    /* Original Perimeter Solution

    π √ 2(a2 + b2) - (a - b)2/2
    public double getPerimeter() {
        double a2 = calculateExponent(a, 2);
        double b2 = calculateExponent(a, 2);

        double s = (2 * (a2 - b2)) - (calculateExponent(a - b, 2) / 2);
        return Math.sqrt(s);
        [This is as far as I could get with this formula]
        }
     */
}