package DocRobStudy;

public class Spaceship {
    private String shipName;

    private int hull, shields, armor, speed; //You can put multiple variables as long as they are the same data type

    public Spaceship(String shipName) {  //The constructor
        this.shipName = shipName;
    }

    //Accessors
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getShields() {
        return shields;
    }

    public void setShields(int shields) {
        this.shields =shields;
    }


}

//Create a Spaceship class
//
//Have fields;
// hull, shields, armor, speed
//
// these can all be ints
//
// shipName String
//Make a constructor that takes a shipName parameter
//And have getters and setters for all fields