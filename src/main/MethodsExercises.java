package main;


import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.awt.im.spi.InputMethod;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        rollDice();


//
//        System.out.println(addMethod(5, 5));
//        getInteger(2, 9);
//            factorialQuestion(9);

    }

//    public static int addMethod(int x, int y) {
//        return x + y;
//    }
//
//    public static int subMethod(int x, int y) {
//        return x - y;
//    }
//
//    public static int multiMethod(int x, int y) {
//        return x * y;
//    }
//
//    public static int diviMethod(int x, int y) {
//        if (y == 0) {
//            System.out.println("Can't divide by zeros");
//            return 0;
//        }
//        return x / y;
//    }
//
//    public static int modMethod(int x, int y) {
//        return x % y;
//    }
//
//
//    public static int getInteger(int min, int max) {
//        Scanner eb = new Scanner(System.in);
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userInput = eb.nextInt();
//
//        // HOW TO PROCEED
//        if (userInput < min || userInput > max) {
//            System.out.println("Number is outside of range");
//            return getInteger(min, max);
//        } else {
//            //  HOW TO STOP
//            System.out.println("Number is within range");
//            return userInput;
//        }
//    }
//    private static void factorialQuestion(int aNum) {
//        StringBuilder factoralString = new StringBuilder();
//        factoralString.append(aNum + "! = ");
//        long factoral = 1;
//        for (int i = aNum; i >= 1; i--) {
//            factoralString.append(i);
//            if (i != 1) {
//                factoral *= (long) i * (i - 1);
//                factoralString.append(" x ");
//            }
//        }
//        System.out.println(factoralString + " = " + factoral);

    public static void rollDice() {

        Input eb = new Input();

        do {
            int numberSides = eb.getInt("Please enter a number of sides for the die");
            int numOfDie = eb.getInt("Please enter number of die to be used");
            int diceTotal = rollSomeDice(numberSides, numOfDie);
            System.out.printf("You rolled %d\n", diceTotal);

        } while (eb.yesNo("Would you like to roll some dice? (y/n)"));

    }

    private static int rollSomeDice(int numberSides, int numOfDice) {
        int total = 0;
        for (int i = 0; i < numOfDice; i++) {
            int dieRoll = rollADice(numberSides);
            System.out.printf("Die roll %d\n", dieRoll);
            total += dieRoll;
        }
        return total;
    }

    public static int rollADice(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }

    }





















