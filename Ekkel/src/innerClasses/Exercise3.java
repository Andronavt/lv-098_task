/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Modify Exercise 1 so that Outer has a private String field (initialized by
 * the constructor), and Inner has a toString( ) that displays this field.
 * Create an object of type Inner and display it.
 */
public class Exercise3 {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer o2 = new Outer("OrestO");
		Outer.Inner i1 = o1.makeInner();
		Outer.Inner i2 = o2.makeInner();

		System.out.println(o1);
		System.out.println(o2);
		System.out.println(i1);
		System.out.println(i2);
	}
}
