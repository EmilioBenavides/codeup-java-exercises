package OOP;

public class Person {
    private String name;  // this is an instance variable
    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;  // we use the "this" keyword to access properties within the class.
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;  // this sets the instance variable = to the passed in parameter as we see in line #24.
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Name is: " + name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person();  // This is the new "object" created that inherits all four of the properties of the Person class above. To access any of the public properties
//                                        // you would need to call objectname.property ex. person1.getname
//        System.out.println(person1.getName());
//        person1.setName("Tony");
//        System.out.println(person1.getName());
//        person1.sayHello();

//        Person person1 = new Person("John");  // Person1 and Person2 are not the equal to each other because they take up 2 different memory slots
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2); // this is true because person2 was not previously assigned to anything

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // "John"
//        System.out.println(person2.getName()); // "John"
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // look at line #37 this is now assigned the name "Jane"
//        System.out.println(person2.getName()); // they are both assigned the name "Jane" because they have the same memory slot.
    }
}
