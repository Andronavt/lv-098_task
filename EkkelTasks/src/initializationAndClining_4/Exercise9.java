/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 * 
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test9 obj = new Test9();

    }

}

class Test9 {
    Test9() {
	this(1);
	System.out.println("First constructor loaded");

    }

    Test9(int i) {
	System.out.println("Second constructor loaded");

    }
}