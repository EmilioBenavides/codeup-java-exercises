package OOP;

public class Dog extends Pet {


   public Dog (String name, String breed, String color) {
      super(name, breed, color);
   }

   public String getName() {
      return name;
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
