package OOP;

public class AnimalApp {


    public static void main(String[] args) {

        boolean isDog = false;
        Pet pet;
        if (isDog) {
            pet = new Dog("Tommy", "Bulldog", "White");
        } else {
            pet = new Cat("felix", "calico", "calico");
        }
        System.out.println(pet.getColor());
    }

}
