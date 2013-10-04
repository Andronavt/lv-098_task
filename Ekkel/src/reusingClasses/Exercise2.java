/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise2 {
	public static void main(String[] args) {
		Detergent d = new Detergent();
		NewDetergent nd = new NewDetergent();

		d.scrub();
		nd.scrub();
		nd.sterilize();

		d = nd;

		d.scrub();
	}
}

class Detergent {
	void scrub() {
		System.out.println("Scrub from Detergent");
	}
}

class NewDetergent extends Detergent {
	void scrub() {
		System.out.println("Scrub from NewDetergent");
	}

	void sterilize() {
		System.out.println("Sterilize from NewDetergent");
	}
}
/*
 * Inherit a new class from class Detergent. Override scrub( ) and add a new
 * method called sterilize( )
 */