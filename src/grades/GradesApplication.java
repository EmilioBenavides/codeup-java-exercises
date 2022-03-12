package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        //Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
        // It should have keys that are strings that represent github usernames, and values that are Student objects. Create
        // at least 4 Student objects with at least 3 grades each, and add them to the map.
        //Be creative! Make up GitHub usernames and grades for your student objects.
        HashMap<String, Student> students = new HashMap<>();

        Student Karol = new Student("Karol");
        Student Justin = new Student("Justin");
        Student Mary = new Student("Mary");
        Student Lucas = new Student("Lucas");

        Karol.addGrades(87); // The grades are added to the targeted student. They are now attached to the student object
        Karol.addGrades(98);
        Karol.addGrades(79);
        Justin.addGrades(76);
        Justin.addGrades(88);
        Justin.addGrades(92);
        Mary.addGrades(87);
        Mary.addGrades(99);
        Mary.addGrades(79);
        Lucas.addGrades(99);
        Lucas.addGrades(97);
        Lucas.addGrades(95);

        students.put("KaroltheDestroyer", Karol); // We added the student to the hashmap
        students.put("JustintoslickforYOU", Justin);
        students.put("MarysonaMission", Mary);
        students.put("LucasJavaMaster", Lucas);
        Input eb = new Input();

        Object[] githubUserNamesList = students.keySet().toArray(); // Here we grab the actual "keys" of the hashmap which are "strings" ie the githubUsernames
        System.out.println("Welcome! \n" + "Here are the GitHub usernames of our students: ");

        do {
            for (Object githubUserName : githubUserNamesList) { // The githubUserNamesList is the collection ex. Its holds multiple items
                // The githubUserName is the single piece of the object
                System.out.print("|" + githubUserName.toString() + "| "); // Here we are adding the correct spacing and adding the pipes in between the githubUserNames

            }
            String userInput = eb.getString("\nWhich student would you like to see more information about?");
            if (students.containsKey(userInput)) {
                System.out.println(students.get(userInput));
            } else if (!students.containsKey(userInput)) {
                System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\""); //The while loop
            }
        } while (eb.yesNo("\nWould you like to see another student? (y/n)"));
        System.out.println("Goodbye, have a wonderful day!");
    }
}

















