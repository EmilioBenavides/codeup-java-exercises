public class ServerNameGenerator {
    public static void main(String[] args) {
        // Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        String[] adjectives = {"Confused", "Hungry", "Thirsty", "Bamboozle", "Bodacious", "Brouhaha", "Canoodle", "Gnarly", "Malarkey", "Nincompoop"};
        String[] nouns = {"Horse", "Car", "Chicken", "Truck", "Texas", "Alaska", "Kentucky", "Delaware", "Mouse", "New York"};

        String adjective = pickRandomString(adjectives);
        String noun = pickRandomString(nouns);
        System.out.println("Here is your server name: \n" + pickRandomString(nouns) + "-" + pickRandomString(adjectives));
    }

        //Create a method that will return a random element from an array of strings.
        //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the
        // combination and display the generated name to the user.
        public static String pickRandomString(String[] stringArray) {
        int index = (int) (Math.random() * stringArray.length);
        return stringArray[index];
        }



}
