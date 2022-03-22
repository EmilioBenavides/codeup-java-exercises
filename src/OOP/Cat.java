package OOP;

public class Cat extends Pet {

    public Cat(String name, String breed, String color) {
        super(name, breed, color);

    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
