/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class Component1 {
    Component1(int k) {
	System.out.println("Component1 " + k);

    }

    void dispose() {
	System.out.println("disposing Component1 ");
    }
}

class Component2 {
    Component2(int d) {
	System.out.println("Component2 " + d);
    }

    void dispose() {
	System.out.println("disposing Component2 ");
    }
}

class Component3 {
    Component3(int c) {
	System.out.println("Component2 " + c);
    }

    void dispose() {
	System.out.println("disposing Component3");
    }
}

class Root {
    Component1 a;
    Component2 b;
    Component3 c;

    Root(int d) {
	System.out.println("Root " + d);
	a = new Component1(d);
	b = new Component2(d);
	c = new Component3(d);
    }

    void dispose() {
	System.out.println("disposing Root ");
	a.dispose();
	b.dispose();
	c.dispose();
    }
}

class Stem extends Root {
    Component1 a1;
    Component2 b1;
    Component3 c1;

    Stem(int a) {
	super(a);
	System.out.println("Stem " + a);
	a1 = new Component1(a);
	b1 = new Component2(a);
	c1 = new Component3(a);
    }

    void dispose() {
	System.out.println("disposing Stem ");
	super.dispose();
	a1.dispose();
	b1.dispose();
	c1.dispose();
    }
}

public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Stem(15).dispose();
	

    }

}
