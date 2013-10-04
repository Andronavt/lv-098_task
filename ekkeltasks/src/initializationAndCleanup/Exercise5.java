/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Dog dog = new Dog();
	dog.Bark();
	dog.Bark("ayyyy");
	dog.Bark(5);
	dog.Bark(5, "it's working");
	dog.Bark("it's working", 10);

    }

}

class Dog {
    void Bark(String bark) {
	System.out.println(bark);
    }

    void Bark() {
	System.out.println("gauu");
    }

    void Bark(int k) {
	for (int i = 0; i < k; i++)
	    System.out.println("gauu");
    }

    void Bark(int k, String bark) {
	System.out.println("int, String");
	for (int i = 0; i < k; i++)
	    System.out.println(bark);
    }

    void Bark(String bark, int k) {
	System.out.println("String, int");
	for (int i = 0; i < k; i++)
	    System.out.println(bark);
    }
}