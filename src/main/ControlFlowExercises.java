package main;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//    }

//        for(int i = 1; i <= 10; i++) { // <--+
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }
//
//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);
//        }
//
//        long i = 2L;
//
//        do {
//            System.out.println(i);
//            i *= i; // We use this to square "i" and reassign the value of "i"
//        } while (i < 1000000L);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for (long i = 2L; i < 1000000L; i *= i) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i< 100; i++) {
//            if ((i% 3 == 0) && (i % 5 ==0)) {       // Make sure to always use the most strenuous validations first
//                System.out.println("FizzBuzz");
//            } else if (i % 5 ==0) {
//                System.out.println("Buzz");
//            }else if (i % 3 ==0) {
//                    System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


        Scanner eb = new Scanner(System.in);

        boolean userContinue = true;
        do {
            System.out.println("Please enter a number: ");
            int userinput = eb.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("Number  |  Squared  |  Cubed");
            System.out.println("------  | --------  | ------");
            for (int i = 1; i <= userinput; i++) {
                System.out.printf("%-7d", i);
                System.out.print(" | ");
                System.out.printf("%-9d", i * i);
                System.out.print(" | ");
                System.out.println(i * i * i);
            }
            System.out.println();
            System.out.println("Would you like enter another number? (y/n)");
            String userResponse = eb.next();
            if (!(userResponse.equalsIgnoreCase("y"))) {
                userContinue = false;
            }
        } while (userContinue);

        System.out.println("See you later!");
    }
}

//        do {
//            System.out.println("Please enter a numerical grade from 0 to 100.");
//
//            int userInput = eb.nextInt();
//
//            if (userInput >= 88) {
//                System.out.println("A");
//            } else if (userInput >= 80) {
//                System.out.println("B");
//            } else if (userInput >= 67) {
//                System.out.println("C");
//            } else if (userInput >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to enter another grade? (y/n)?");
//            String gradeUserInput = eb.next();
//
//            if (!(gradeUserInput.equalsIgnoreCase("y"))) {
//                userContinue = false;
//            }
//
//        } while (userContinue);
//
//    }
//
//    }
//            }
//
//
