/**
 * 
 */
package everythingIsAnObject;

/**
 * @author Andrew
 * 
 */
public class Exercise8 {
    public static void main(String[] args) {
	Demonstrate a = new Demonstrate();
	Demonstrate b = new Demonstrate();
	System.out.println(a.i);
	System.out.println(b.i);
	a.i++;
	System.out.println(a.i);
	System.out.println(b.i);
    }
}

class Demonstrate {
    public static int i = 45;
}
