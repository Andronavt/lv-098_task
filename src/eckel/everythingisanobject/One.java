package eckel.everythingisanobject;

/*
 * Create a class containing an int adn char that are not initialized, and
 * print their values to verify that Java performs defualt initialization.
 */

public class One {
    private int number;
    private char character;

    public static void main(String[] args) {
	One one = new One();
	System.out.println("default int: " + one.number);
	System.out.println("default char: " + one.character);
    }

}
