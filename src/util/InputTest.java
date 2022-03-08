package util;

public class InputTest {
    public static void main(String[] args) {
        Input eb = new Input();  // eb is now an instance object of the Input class
        System.out.println(eb.getString("Please enter a string: "));
        System.out.println(eb.getString());
        System.out.println(eb.yesNo("Are you interested in CodeUp (Y/N)!"));
        System.out.println(eb.yesNo());
        System.out.println(eb.getInt(1, 10, "Please enter a number between 1 and 10."));
        System.out.println(eb.getInt());
        System.out.println(eb.getDouble(1, 20, "Please enter a number between 1 and 20"));
        System.out.println(eb.getDouble());
    }

}
