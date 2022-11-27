package Question1;

public class Test {
    public static void main(String[] args) {
        // BOB THE CONSTRUCTOR CAN HE CONSTRUCT IT
        // BOB THE CONSTRUCTOR YES HE CAN
        // wait that sounds wrong
    Circle circle = new Circle(5, "Red", true);
    Ellipse ellipse = new Ellipse(4, 4, "Red", true);
    EquilateralTriangle eqTriangle = new EquilateralTriangle(10, "Blue", true);
    Triangle regTriangle = new Triangle(5, 4, 5, "Red", true);

    // ToString()
        System.out.println(circle);
        System.out.println("\n[++++++++++]");
        System.out.print(ellipse);
        System.out.println("\n[++++++++++]");
        System.out.println(regTriangle);
        System.out.println("\n[++++++++++]");
        System.out.println(eqTriangle);
        System.out.println("\n[++++++++++]");

        // Cool Methods
        System.out.println(
                circle.getCircumference() +
                        "///" +
                        ellipse.getPerimeter() +
                        "///" +
                        eqTriangle.getPerimeter() +
                        "///" +
                        regTriangle.getPerimeter()
        );
        System.out.println(
                circle.getArea() +
                        "///" +
                        ellipse.getArea() +
                        "///" +
                        eqTriangle.getArea() +
                        "///" +
                        regTriangle.getArea()
        );
    }}
