import OOP.Person;

import java.net.PortUnreachableException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        //This will give you the memory address

        Person[] people = new Person[3];  // This is how you create an array of 3 person objects
        people[0] = new Person("Mike"); // This is how you create a new instance of the person class
        people[1] = new Person("John");
        people[2] = new Person("Bobby");

        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i]);
        }
    }
    public static Person[]addPerson(Person[] peopleArray, Person lilPeep) { // You have to have the return data type before the variable name. "Person[]" is the return data type.
                                                                            // It has to match what you expect to return

        Person[] group = Arrays.copyOf(peopleArray, peopleArray.length + 1); // Here
        group[group.length - 1] = lilPeep;
        return group;
    }


}
