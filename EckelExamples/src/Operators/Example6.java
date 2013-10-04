/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */

public class Example6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Dog a = new Dog("spot", "Ruff!");
	Dog b = new Dog("scruffy", "Wurf!");
	Dog c = new Dog();
	Dog d = new Dog();
	c = a;
	b = a;
	a = d;
	System.out.println(a == c);
	System.out.println(a.equals(c));
	System.out.println(a == b);
	System.out.println(a.equals(b));
	System.out.println(a == d);
	System.out.println(a.equals(d));

    }

}
