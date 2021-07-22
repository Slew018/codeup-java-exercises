package shapes;

public class ShapeTest {
    public static void main(String[] args) {

        Quadrilateral myShape;

        myShape = new Square(5);
        System.out.println("Area for square: " + myShape.getArea());
        System.out.println("Perimeter for square: " + myShape.getPerimeter());

        myShape = new Rectangle(5);
        System.out.println("Area for rectangle: " + myShape.getArea());
        System.out.println("Perimeter for rectangle: " + myShape.getPerimeter());
    }
}
