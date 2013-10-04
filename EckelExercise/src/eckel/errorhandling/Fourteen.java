package eckel.errorhandling;

/*
 * ex 14
 * Show that OnOffSwitch.java can fail by throwing a RuntimeException inside the try block
 */

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

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}

class OnOffSwitch {

    static Integer[] arr = new Integer[1];

    public static void f(int i) throws OnOffException1, OnOffException2 {
    }

}

public class Fourteen {
    private static Switch sw = new Switch();

    public static void main(String[] args) {
	try {
	    sw.on();
	    OnOffSwitch.f(OnOffSwitch.arr[0]);
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
