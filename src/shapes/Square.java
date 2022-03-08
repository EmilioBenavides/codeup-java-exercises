package shapes;

public class Square extends Rectangle{
    private int side;

    @Override
    public int getArea() {
        return (int)Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    public String sayHello(){
        return "Hello!!";
    }
    public Square(int side) {
        super(side, side); // this is calling the superclass variables
        this.side = side;
    }

}
