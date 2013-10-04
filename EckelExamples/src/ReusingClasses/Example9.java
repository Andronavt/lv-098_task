/**
 * 
 */
package ReusingClasses;

import javax.sound.midi.SysexMessage;

/**
 * @author Oleg
 * 
 */
class Component1 {
void dispose(){
    System.out.println("Disposing");
}
}

class Component2 {
    void dispose(){
	    System.out.println("Disposing");
	}
}

class Component3 {
    void dispose(){
	    System.out.println("Disposing");
	}
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root() {
	System.out.println("Class Root");
    }

    void info() {
	System.out.println("Root" + c1.getClass() + c2.getClass()
		+ c3.getClass());
    }
    void dispose(){
	c1.dispose();
	c2.dispose();
	c3.dispose();
	System.out.println("Disposing Root");
    }

}

class Stem extends Root {
    Stem() {
	System.out.println("Stem Class");
    }

    void info() {
	System.out.println("Stem" + c1.getClass() + c2.getClass()
		+ c3.getClass());
    }
    void dispose(){
	System.out.println("Disposing Stem");
	super.dispose();
    }
}

public class Example9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Stem s = new Stem();
	s.info();
	s.dispose();
    }

}
