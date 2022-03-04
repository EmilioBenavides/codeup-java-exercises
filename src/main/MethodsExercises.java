package main;


import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addMethod(5, 5));
        getInteger(2, 9);
    }

    public static int addMethod(int x, int y) {
        return x + y;
    }

    public static int subMethod(int x, int y) {
        return x - y;
    }

    public static int multiMethod(int x, int y) {
        return x * y;
    }

    public static int diviMethod(int x, int y) {
        if (y == 0) {
            System.out.println("Can't divide by zeros");
            return 0;
        }
        return x / y;
    }

    public static int modMethod(int x, int y) {
        return x % y;
    }


    public static int getInteger(int min, int max) {
        Scanner eb = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = eb.nextInt();

        // HOW TO PROCEED
        if (userInput < min || userInput > max) {
            System.out.println("Number is outside of range");
            return getInteger(min, max);
        } else {
            //  HOW TO STOP
            System.out.println("Number is within range");
            return userInput;
        }
    }
}
