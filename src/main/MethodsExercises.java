package main;

import java.util.Scanner;

public class MethodsExercises {

    public static void main (String[] args) {

        Scanner eb = new Scanner(System.in);

        System.out.println("Addition method sum: " + addMethod(5, 5));

        System.out.println("Subtraction method sum: " + subMethod(5, 4));

        System.out.println("Multiplication method sum: " + multiMethod( 5, 3));

        System.out.println("Division method sum: " + diviMethod(10, 5));

        System.out.println("Modulus method sum: " + modMethod(14, 7));

    }

    public static int addMethod (int num1, int num2) { return  num1 + num2; }

    public static int subMethod (int num3, int num4) { return num3 - num4; }

    public static int multiMethod (int num5, int num6) { return num5 * num6; }

    public static int diviMethod ( int num7, int num8) { return num7 / num8; }

    public static int modMethod ( int num9, int num10) { return num9 % num10; }

}