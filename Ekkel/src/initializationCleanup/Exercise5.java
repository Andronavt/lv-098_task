/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise5 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark(1);
		dog.bark(2f);
		dog.bark(3.0);
		dog.bark('d');
	}
}

class Dog {
	public void bark(int i) {
		System.out.println("barking -> int");
	}

	public void bark(float f) {
		System.out.println("howling -> float");
	}

	public void bark(double d) {
		System.out.println("barking -> double");
	}

	public void bark(char c) {
		System.out.println("barking -> char");
	}

	public void bark(char c, int i) {
		System.out.println("char, int");
	}

	public void bark(int i, char c) {
		System.out.println("int, char");
	}
}
/*
 * Create a class called Dog with an overloaded bark( ) method. This method
 * should be overloaded based on various primitive data types, and print
 * different types of barking, howling, etc., depending on which overloaded
 * version is called. Write a main( ) that calls all the different versions.
 */
