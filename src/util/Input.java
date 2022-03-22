package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;// this is an instance variable
    public Input() {
        this.scanner = new Scanner(System.in); // We initialized the scanner with new Scanner once the object is created
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString(); // we use the getString method inside of method variable -userInput- to access the "userInput"
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {  // we use the .equalsIgnoreCase so that the input compares the value and
            // is automatically put into lower case. the variable will only take in one parameter at a time therefore you must put all possible answer inputs into single parameters.
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = getString();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {  // we use the .equalsIgnoreCase so that the input compares the value and
            // is automatically put into lower case. the variable will only take in one parameter at a time therefore you must put all possible answer inputs into single parameters.
            return true;
        } else {
            return false;
        }
    }

    public int getInt(String prompt) {
        try {
            int userInput = Integer.parseInt(getString(prompt));
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("You must enter value that is a numerical value");
            return getInt();
        }

    }

    public int getInt() {
        try {
            int userInput = Integer.parseInt(getString());
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("You must enter a numerical value." + e.getMessage());
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInput = getInt(); // we use the getInt method here to get the value of the userInput
        if (userInput >= min && userInput <= max) {  // int's are primatives and don't have anything attached to them other than the assigned value.
            return userInput;
        } else {
            return getInt(min, max); // We use the getInt method to continue to "prompt" the User to keep entering an integer
        }
    }

        public int getInt(int min, int max, String prompt){
            System.out.println(prompt);
            int userInput = getInt();
            if (userInput >= min && userInput <= max) {  // int's are primatives and don't have anything attached to them other than the assigned value.
                return userInput;
            } else {
                return getInt(min, max); // We use the getInt method to continue to "prompt" the User to keep entering an integer
            }
        }

            public double getDouble() {
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getDouble(min, max);
        }
    }

    public double getDouble(String prompt) {
        while(true) {
            try {
                String myString = getString(prompt);
                return  Double.valueOf(myString);
            } catch(NumberFormatException e) {
                System.out.println("You must enter a value that can be turned into a double.");
            }

        }
    }

        public double getDouble(double min, double max, String prompt) {
            System.out.println(prompt);
            double userInput = getDouble();
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                return getDouble(min, max);
            }
    }



}
