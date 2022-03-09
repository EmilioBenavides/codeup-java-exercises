package DocRobStudy;

public class MondayWork {
    public static void main(String[] args) {
        String myColor = MondayWork.mapValueToColor(3);
        System.out.println(myColor);
        
    }

    private static String mapValueToColor(int colorVal) {
        switch (colorVal) {
            case 1:
                return "Blue";
            case 2:
                return "Red";
            case 3:
                return "orange";
            case 4:
                return "Yellow";
            case 5:
                return "Violet";
            case 6:
                return "Black";
            case 7:
                return "White";
        }
        return "";
    }


}
//Create a Java class called MondayWork.
//
//Write a static function called mapValueToColor that takes an int parameter called colorVal and returns a string that is the associated color. If no color maps to the given colorVal then return an empty string. The color table is as follows:
//1	Blue
//2 	Red
//3	Orange
//4	Yellow
//5 	Violet
//6	Black
//7	White
//example:
//String myColor = MondayWork.mapValueToColor(3);
//System.out.println(myColor); // prints “Orange”