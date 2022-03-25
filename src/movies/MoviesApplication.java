package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        Input userInput = new Input();
        int userRequest;

        do {
            printMenu();
            userRequest = userInput.getInt("What would you like to do?");
            if (userRequest == 1){
                System.out.println(Arrays.toString(MoviesArray.findAll()));
            } else if (userRequest == 2){
               searchForCategory("animated");
            } else if (userRequest == 3){
                searchForCategory("drama");
            } else if (userRequest == 4){
                searchForCategory("horror");
            } else if (userRequest == 5){
                searchForCategory("scifi");
            } else if (userRequest == 0){
                System.out.println("See ya later alligator!");
            }
        } while (userRequest != 0);

    }

    public static void printMenu(){
        System.out.println("0 - Exit\n1 - View all movies\n2 - View movies in the animated category\n3 - View movies in the drama category\n4 - View movies in the horror category\n5 - View movies in the scifi category");
    }

    public static void searchForCategory(String category){
        Movie[] movieList = MoviesArray.findAll();
        ArrayList<Movie> movieBucket = new ArrayList<>();
        for (int i = 0; i < movieList.length; i++) {
            if (movieList[i].getCategory().equalsIgnoreCase(category)){
                movieBucket.add(movieList[i]);
            }
        }
        System.out.println(movieBucket);
    }
}
