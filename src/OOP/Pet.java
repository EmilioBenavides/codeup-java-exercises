package OOP;

abstract class Pet {
    protected String name;
    protected String breed;
    protected String color;


    public Pet(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

   abstract String getColor();

}
