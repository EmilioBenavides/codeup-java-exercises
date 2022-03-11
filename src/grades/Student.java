package grades;

import java.util.ArrayList;

public class Student {
    @Override
    public String toString() { // We override this method so when we "sout" the hashmap "students" we dont get the
                                // memory address printed out.
        return studentName; // we return what we want to see in the console. Here we just want to see the name value.
                            // in the GradesApp page
    }

    //Create a class named Student. It should have private properties for the student's name, and grades. The grades
    // property should be an ArrayList of integers. The student class should have a constructor that sets name property
    // , and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
    public static void main(String[] args) {
        Student howard = new Student("Tom"); // "howard" is the variable name, the student name property is  "Tom"
        howard.addGrades(87); // .addgrades is how you assign the 87 to the "grade" property.
        howard.addGrades(99);
        System.out.println(howard.getGradeAverage());
    }

   private String studentName;  // this is how to make the properties private the "data type" must be before the variable name
   private ArrayList<Integer> grades; // This is how you assign the "data type" of the ArrayList. "grades" is the property

   public Student(String pupilName) { //This is the constructor
       this.studentName = pupilName; // Here we assign the value of "studentName" to "pupilName".
       this.grades = new ArrayList<>(); // this is how you create a new empty ArrayList. The "grades" property is now holding the value
   }

   public String getName() {
       return studentName;
   }

    public void addGrades(int grade) { //This is the addGrade method
        this.grades.add(grade);
    }

    public double getGradeAverage() {
       double studentGrade = 0;
       double numberOfGrades = 0;
       for (int index = 0; index < grades.size(); index++) { // "index" holds the value "0" we iterate through the ArrayList property "grades".
                                                            // we use the .get to return the element at the specified index which starts at [0] --> the end of the ArrayList
           studentGrade += grades.get(index); // this is how you add the "index value and assign it to "studentGrade" this way you don't lose the value of each index
           numberOfGrades++; // This is how you get the total number of grades
       }
       return studentGrade / numberOfGrades;

    }

}
