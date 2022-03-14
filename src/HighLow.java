import util.Input;

import java.util.Random;

public class HighLow {
    private static Random randoNum = new Random(); // this is now an instance variable. You can use it in any method within this class.

    public static void main(String[] args) {
        Input userInput = new Input();
        int userPick;
        int numberToGuess = randoNum.nextInt(100 - 1) + 1;

        do {
            System.out.println(numberToGuess);
            userPick = userInput.getInt(1, 100, "Please guess a number between 1 - 100.");
            if (userPick < numberToGuess) {
                System.out.println("Higher");
            } else if ( userPick > numberToGuess){
                System.out.println("lower");
            } else {
                System.out.println("Good Guess");
            }
        } while(userPick != numberToGuess) ;

    }
}
