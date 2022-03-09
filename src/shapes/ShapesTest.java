package shapes;

public class ShapesTest {
    public static void main(String[] args) {
            Measurable myShape;  //When declaring a variable it has the datatype before it
            myShape = new Rectangle(1.2, 3.4); // This is the instance variable
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(4);  // This is the instance variable
        System.out.println(myShape.getArea()); // This is the new Shapes area
        System.out.println(myShape.getPerimeter()); // This is how you get the new perimeter
       // System.out.println(myShape.getLength());
    }
}