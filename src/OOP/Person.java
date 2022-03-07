package OOP;

public class Person {
    private String name;  // this is an instance variable

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
        Person person1 = new Person();  // This is the new "object" created that inherits all four of the properties of the Person class above. To access any of the public properties
                                        // you would need to call objectname.property ex. person1.getname
        System.out.println(person1.getName());
        person1.setName("Tony");
        System.out.println(person1.getName());
        person1.sayHello();
    }
}
