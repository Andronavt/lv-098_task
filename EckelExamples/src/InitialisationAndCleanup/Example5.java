/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 * 
 */
 class Dog {
    void bark(int i) {
	System.out.println("Int");
    }

    void bark(double d) {
	System.out.println("Double");
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

public class Example5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
Dog d= new Dog();
d.bark('a');
d.bark(1.3);
d.bark(1.2f);
d.bark(1);
d.bark(234l);
d.bark(234);

    }

}
