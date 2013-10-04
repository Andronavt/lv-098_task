/**
 * 
 */
package reusingClasses;

import static staticPack.StaticPrint.print;

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

public class Exercise11 {
	// Change a method:
	Cleanser c = new Cleanser();

	public void append(String a) {
		c.append(a);
	}

	public void dilute() {
		c.append(" dilute()");
	}

	public void apply() {
		c.append(" apply()");
	}

	// public void scrub() {
	// c.append(" scrub()");
	// }

	public String toString() {
		return c.toString();
	}

	public void scrub() {
		c.append(" Detergent.scrub()");
		c.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Exercise11 x = new Exercise11();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
