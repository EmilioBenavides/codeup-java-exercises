package grades;

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

        System.out.println(students);
        Scanner eb = new Scanner(System.in);
        System.out.println("Which student would you like to see more information about?");
        String userInput = eb.nextLine();

    }
}