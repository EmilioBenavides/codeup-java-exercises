package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
    }
}