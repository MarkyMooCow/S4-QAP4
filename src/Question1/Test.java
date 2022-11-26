package Question1;

public class Test {
    public static void main(String[] args) {
        // BOB THE CONSTRUCTOR CAN HE CONSTRUCT IT
        // BOB THE CONSTRUCTOR YES HE CAN
        // wait that sounds wrong
    Circle circle = new Circle(4, "Red", true);
    Ellipse ellipse = new Ellipse(4, 4, "Red", true);
    EquilateralTriangle eqTriangle = new EquilateralTriangle(3, "Blue", true);
    Triangle regTriangle = new Triangle(5, 5, 3, "Red", true);

    // ToString()
    System.out.println(circle);
    System.out.println(ellipse);
    System.out.println(eqTriangle);
    System.out.println(regTriangle);

    // Cool Methods
    System.out.println(circle.getCircumference());
    System.out.println(circle.getArea());

    System.out.println(ellipse.getPerimeter());
    System.out.println(ellipse.getArea());

    System.out.print(eqTriangle.getPerimeter());
    System.out.print(eqTriangle.getArea());

    System.out.println(regTriangle.getPerimeter());
    System.out.println(regTriangle.getArea());
}}
