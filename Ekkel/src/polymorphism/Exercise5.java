/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise5 {
	public static void main(String[] args) {
		Cycle c = new Cycle();
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		
		c.ride(c);
		c.ride(uc);
		c.ride(bc);
		c.ride(tc);
		System.out.println();
		
		uc.ride(c);
		uc.ride(uc);
		uc.ride(bc);
		uc.ride(tc);
		
		bc.ride(tc);
		
		tc.ride(bc);
	}
}
/*
 * Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the
 * number of wheels. Modify ride( ) to call wheels( ) and verify that
 * polymorphism works
 */