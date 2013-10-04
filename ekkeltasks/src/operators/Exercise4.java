/**
 * 
 */
package operators;

/**
 * @author Andrew
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	double distance = 1000;
	int time = 5;
	System.out.println("Speed = " + Speed.getSpeed(distance, time));

    }

}

class Speed {
    public static double getSpeed(double distance, int time) {
	return distance / time;
    }
}
