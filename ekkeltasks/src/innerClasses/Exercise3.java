/**
 * 
 */
package innerClasses;


/**
 * @author Andrew
 * 
 */
class Outer1 {
    private String name;

    Outer1(String name) {
	this.name = name;
    }

    Inner1 getInner() {
	return new Inner1();

    }

    class Inner1 {

	public String toString() {
	    return "hohohoh";
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Outer1 c = new Outer1("Testing");
	Inner1 i = c.getInner();
	System.out.println(i);
    }
}

public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Outer1.main(args);
    }

}
