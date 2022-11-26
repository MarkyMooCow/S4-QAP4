package Question1;

public class EquilateralTriangle extends Triangle {
    protected double side1, side2, side3;

    // Constructors
    public EquilateralTriangle() {
        super();
    }
    public EquilateralTriangle(double s) {
        super(s);
    }
    public EquilateralTriangle(String c, boolean f) {
        super(c, f);
    }
    public EquilateralTriangle(double s, String c, boolean f) {
        super(s, c, f);
    }

    // Setters
    @Override
    public double setSide1(double s) {
        side2 = s;
        side3 = s;
        return side1 = s;
    }
    @Override
    public double setSide2(double s) {
        side1 = s;
        side3 = s;
        return side2 = s;
    }
    @Override
    public double setSide3(double s) {
        side1 = s;
        side2 = s;
        return side3 = s;
    }
}