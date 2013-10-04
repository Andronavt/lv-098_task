/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise17 {
	public static void main(String[] args) {
		Cycle[] cycle = {new Bicycle(), new Unicycle(), new Tricycle()};
		
		for(Cycle c : cycle){
			((Bicycle) c).balance();
		}
	}

}
/*
 * Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
 * Unicycle and Bicycle, but not to Tricycle. Create instances of all three
 * types and upcast them to an array of Cycle. Try to call balance( ) on each
 * element of the array and observe the results. Downcast and call balance( )
 * and observe what happens.
 */
