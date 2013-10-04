/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test3 obj = new Test3();
	obj.scrub();
	obj.sterilize();

    }

}

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

}

class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
	append(" Detergent.scrub()");
	super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
	append(" foam()");
    }

}
class Test3 extends Detergent{
    public void scrub() {
	System.out.println("Overrided scrub()");
	super.scrub();
    }
    public void sterilize(){
	System.out.println("New method sterilize()");
    }
}
