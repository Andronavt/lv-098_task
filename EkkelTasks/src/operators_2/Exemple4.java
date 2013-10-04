/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exemple4 {

    /**
     * @param args
     */
    final static float DIST = 100.0F; // distance in metres
    final static float TIME = 15F; // time in seconds

    public static void main(String[] args) {
	System.out.println("Velocity for distance " + DIST + " m and for time "
		+ TIME + " is: " + velocity(DIST, TIME) + " m/s");

    }
    public static float velocity(float distance, float time) {
	return Math.round(distance / time);
    }

}
