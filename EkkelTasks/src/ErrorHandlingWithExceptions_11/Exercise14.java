/**
 * Exercise 14:   (2) Show that OnOffSwitch.java can fail by throwing a 
 * RuntimeException inside the try block.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}

class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
	try {
	    sw.on();
	    //throw new RuntimeException();
	    f();
	    sw.off();
	    
	} catch (OnOffException1 e) {
	    System.out.println("OnOffException1");
	    sw.off();
	} catch (OnOffException2 e) {
	    System.out.println("OnOffException2");
	    sw.off();
	}
    }
}

class Switch {
    private boolean state = false;

    public boolean read() {
	return state;
    }

    public void on() {
	state = true;
	System.out.println(this);
    }

    public void off() {
	state = false;
	System.out.println(this);
    }

    public String toString() {
	return state ? "on" : "off";
    }
}
class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}