/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise9 {
	public static void main(String[] args) {
		Stem s = new Stem("Stem");
	}

}

class Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Root(String str) {
		c1 = new Component1("Component1 -> Root");
		c2 = new Component2("Component2 -> Root");
		c3 = new Component3("Component3 -> Root");
		System.out.println(str);
	}

	void dispose() {
		System.out.println("Root -> erasing");
		c1.dispose("Root -> Component1 -> erasing");
		c2.dispose("Root -> Component2 -> erasing");
		c3.dispose("Root -> Component3 -> erasing");
	}
}

class Component1 {
	Component1(String str) {
		System.out.println(str);
	}

	void dispose(String str) {
		System.out.println(str);
	}
}

class Component2 {
	Component2(String str) {
		System.out.println(str);
	}

	void dispose(String str) {
		System.out.println(str);
	}
}

class Component3 {
	Component3(String str) {
		System.out.println(str);
	}

	void dispose(String str) {
		System.out.println(str);
	}
}

class Stem extends Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Stem(String str) {
		super("super");
		c1 = new Component1("Component1 -> Stem");
		c2 = new Component2("Component2 -> Stem");
		c3 = new Component3("Component3 -> Stem");
		System.out.println(str);
	}

	void dispose() {
		System.out.println("Stem -> erasing");
		c1.dispose("Stem -> Component1 -> erasing");
		c2.dispose("Stem -> Component2 -> erasing");
		c3.dispose("Stem -> Component3 -> erasing");
		super.dispose();
	}
}
/*
 * Create a class called Root that contains an instance of each of the classes
 * (that you also create) named Component1, Component2, and Component3. Derive a
 * class Stem from Root that also contains an instance of each “component.” All
 * classes should have default constructors that print a message about that
 * class.
 */