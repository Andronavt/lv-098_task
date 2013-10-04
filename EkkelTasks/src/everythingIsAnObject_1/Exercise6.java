/**
 * 
 */
package everythingIsAnObject_1;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {

    public static void main(String[] args) {
	String text = "It is Exercise 6";
	System.out.println("Method storege() returns " + storage(text)
		+ ", for this text: " + text);

    }

    public static int storage(String s) {
	return s.length() * 2;
    }

}
