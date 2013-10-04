/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test4();
	new Test4("Hello!");

    }

}

class Test4 {
    Test4() {
	System.out.println("Created object of class Test4");
    }

    Test4(String s) {
	System.out.println("Created object of class Test4 with String: " + s);
    }
}