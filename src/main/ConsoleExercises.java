package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("Pie is: %.2f\n", pi); // the .2 refers to the decimal place

        System.out.print("Please enter an integer ");
        int myInt = input.nextInt();
        input.nextLine();

        //When you enter a non-integer it throws an error

        System.out.print("Enter 3 words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        System.out.printf("You entered: \n%s, \n%s, \n%s\n", word1, word2, word3);

        input.nextLine();

        System.out.print("enter a sentence: ");
        String sentence = input.nextLine();
        System.out.printf("You entered: %s\n", sentence);

        System.out.print("enter a room length (int): ");
        String lengthString = input.nextLine();
        System.out.print("enter room width (int): ");
        String widthString = input.nextLine();

        int length = Integer.parseInt(lengthString);
        int width = Integer.parseInt(widthString);
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        System.out.printf("Area of the room: %d\n", area);
        System.out.printf("The perimeter of the room: %d", perimeter);
    }
}
