/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise6 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark(1, 'c');
		dog.bark('d', 2);
	}
}
/*
 * Modify the previous exercise so that two of the overloaded methods have two
 * arguments (of two different types), but in reversed order relative to each
 * other. Verify that this works
 */
