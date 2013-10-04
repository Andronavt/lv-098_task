/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 *
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog6 obj = new Dog6();
	obj.bark(1.0, 1);
	obj.bark(1, 1.0);

    }

}
class Dog6 {
   
    void bark(int i, double d) {
	System.out.println("Dog is barking with int and double");
    }

    void bark(double d, int i) {
	System.out.println("Dog is barking with double and int");
    }
}