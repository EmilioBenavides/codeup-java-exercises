package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat = "n";
        do {

            System.out.printf("What would you like to say to Bob? ");
            String responseStr = input.nextLine();
            if (responseStr.endsWith("!")) {
                System.out.println("whoa chill out!");
            } else if (responseStr.endsWith("?")) {
                System.out.println("Sure.");
            } else if (responseStr.equalsIgnoreCase("")) {
                System.out.println("Fine, Be that way!");
            } else {
                System.out.println("Whatever");
            }
            System.out.print("Would you like to keep talking to Bob? [y/n] ");
            repeat = input.nextLine();
        } while (repeat.equals("y"));
    }
}
