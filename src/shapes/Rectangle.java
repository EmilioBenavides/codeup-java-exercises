package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    void setLength(double length) { //We have to have a parameter here so it can take in a value
        this.length = length;
    }

    void setWidth(double width) {  // Void will never return anything
        this.width = width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    public Rectangle(double length, double width) { // You don't have to put double on the super parameters because
                                                    // its inherited from Quadrilateral class
        super(length, width);
    }
}

