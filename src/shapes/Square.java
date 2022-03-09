package shapes;

public class Square extends Quadrilateral{

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    public double getArea() {
        return length * length;
    }

    public Square(double side) { // You only have to use one parameter here due because all sides are equal.
        super(side, side);
    }
}
