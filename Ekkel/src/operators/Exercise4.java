/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise4 {
	public static void main(String[] args) {
		double distance = 10;
		double time = 20;

		System.out.println(velocity(distance, time));
	}

	public static double velocity(double distance, double time) {
		return distance * time;
	}
}
