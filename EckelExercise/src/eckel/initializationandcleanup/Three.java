package eckel.initializationandcleanup;

/*
 * Create a class with a default constructor that prints a message.Create an object of this class.
 */
public class Three {
    public Three() {
	System.out.println("WIiiiiiii");
    }

    public Three(String message) {
	System.out.println(message);
    }

    public static void main(String[] args) {
	new Three();
	new Three("WiiiWiiwiwiwwi");
    }

}
