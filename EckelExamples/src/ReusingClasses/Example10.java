/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 *
 */
class Root1{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root1(String s) {
	System.out.println("Class Root1"+s);
    }

    void info() {
	System.out.println("Root1" + c1.getClass() + c2.getClass()
		+ c3.getClass());
    }

}

class Stem1 extends Root1 {
    Stem1(String s) {
	super(s);
	System.out.println("Stem1 Class");
    }

    void info() {
	System.out.println("Stem1" + c1.getClass() + c2.getClass()
		+ c3.getClass());
    }
}
public class Example10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Stem1 s= new Stem1("aa");
	s.info();
    }

}
