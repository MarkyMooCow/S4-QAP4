package Question1;

public class Shape {
    protected double pi = 3.14;
    protected String color;
    protected boolean filled;

    public Shape() {
        color = null;
        filled = true;
    }
    public Shape(String c) {
        color = c;
        filled = true;
    }
    public Shape(boolean c) {
        color = null;
        filled = c;
    }
    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() {
        if (color == null) {
            return "Undefined";
        } else {
            return color;
        }
    }
    public String getFilled() {
        if (filled == true) {
            return "filled";
        } else {
            return "not filled";
        }
    }
    public String setColor(String c) {
        return color = c;
    }
    public boolean setFilled(boolean f) {
        return filled = f;
    }
    public String toString() {
        return "A Shape with color of " + getColor(); // + " and is " + getFilled();
    }
}
