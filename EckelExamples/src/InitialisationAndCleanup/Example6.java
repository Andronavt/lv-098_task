/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */

class DogReversed {
    void bark(int i,double d) {
	System.out.println("Int double");
    }

    void bark(double d,int i) {
	System.out.println("Double int");
    }

    void bark(float f) {
	System.out.println("Float");
    }

    void bark(char c) {
	System.out.println("Char");
    }

    void bark(long l) {
	System.out.println("Long");
    }

    void bark(short s) {
	System.out.println("Short");
    }

}

public class Example6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	DogReversed d= new DogReversed();
	d.bark(1.2, 1);
	d.bark(1, 1.2);

    }

}
