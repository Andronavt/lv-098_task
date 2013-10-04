/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise17 {
	public static void main(String[] args) {
		Frogv2 frog = new Frogv2();
		frog.breath(frog);
	}
}

class Amphibianv2 {
	void swim() {
		System.out.println("Amphibian -> swim");
	}

	void breath(Amphibianv2 a) {
		System.out.println("Amphibian -> breath");
		a.swim();
	}
}

class Frogv2 extends Amphibianv2 {
	void swim() {
		System.out.println("Frog -> swim");
	}

	void breath(Amphibianv2 a) {
		System.out.println("Frog -> breath");
		a.swim();
	}
}
/*
 * Modify Exercise 16 so that Frog overrides the method definitions from the
 * base class (provides new definitions using the same method signatures). Note
 * what happens in main( ).
 */