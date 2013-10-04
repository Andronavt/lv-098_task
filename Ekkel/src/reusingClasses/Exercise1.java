/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise1 {
	void show() {

	}

	public static void main(String[] args) {
		Second s = new Second();
		s.init("Oresto");
	}
}

class First {
	String s;

	First(String str) {
		s = str;
	}
}

class Second {
	public First f;

	void init(String str) {
		f = new First(str);
	}
}

/*
 * Create a simple class. Inside a second class, define a reference to an object
 * of the first class. Use lazy initialization to instantiate this object
 */