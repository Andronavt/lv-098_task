/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise16 {
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.breath(frog);
	}
}

class Amphibian {
	void swim() {
		System.out.println("swim");
	}

	void breath(Amphibian a) {
		System.out.println("breath");
		a.swim();
	}
}

class Frog extends Amphibian {

}
/*
 * Create a class called Amphibian. From this, inherit a class called Frog. Put
 * appropriate methods in the base class. In main( ), create a Frog and upcast
 * it to Amphibian and demonstrate that all the methods still work
 */