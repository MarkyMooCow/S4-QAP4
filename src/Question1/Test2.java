package Question1;
// The difference between this and Test is that this includes the scaling method!
public class Test2 {
    public static void main(String[] args) {
        // BOB THE CONSTRUCTOR CAN HE CONSTRUCT IT
        // BOB THE CONSTRUCTOR YES HE CAN
        // wait that sounds wrong
        Circle circle2 = new Circle(5, "Red", true);
        Ellipse ellipse2 = new Ellipse(4, 4, "Red", true);
        EquilateralTriangle eqTriangle2 = new EquilateralTriangle(10, "Blue", true);
        Triangle regTriangle2 = new Triangle(5, 4, 5, "Red", true);

        // Scaling Time
        circle2.scale(5);
        ellipse2.scale(0.5);
        eqTriangle2.scale(2);
        regTriangle2.scale(3);

        // ToString()
        System.out.println(circle2);
        System.out.println("\n[++++++++++]");
        System.out.print(ellipse2);
        System.out.println("\n[++++++++++]");
        System.out.println(regTriangle2);
        System.out.println("\n[++++++++++]");
        System.out.println(eqTriangle2);
        System.out.println("\n[++++++++++]");

        // Cool Methods
        System.out.println(
                circle2.getCircumference() +
                "///" +
                ellipse2.getPerimeter() +
                "///" +
                eqTriangle2.getPerimeter() +
                "///" +
                regTriangle2.getPerimeter()
        );
        System.out.println(
                circle2.getArea() +
                "///" +
                ellipse2.getArea() +
                "///" +
                eqTriangle2.getArea() +
                "///" +
                regTriangle2.getArea()
        );
    }
}
