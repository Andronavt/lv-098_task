/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog5 obj = new Dog5();
	obj.bark();
	obj.bark(1);
	obj.bark(1.0);
	obj.bark(1, 1.0);
	obj.bark(1, 1.0, 1L);

    }

}

class Dog5 {
    void bark() {
	System.out.println("Dog is barking without args");
    }

    void bark(int i) {
	System.out.println("Dog is barking with int");
    }

    void bark(double d) {
	System.out.println("Dog is barking with double");
    }

    void bark(int i, double d) {
	System.out.println("Dog is barking with int and double");
    }

    void bark(int i, double d, long l) {
	System.out.println("Dog is barking with int, double and long");
    }
}
