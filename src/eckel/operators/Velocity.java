package eckel.operators;

/*
 * Write a program that calculates velocity using a constant distance and a constant time.
 */
public class Velocity {
    private static final double TIME = 10; // s
    private static final double DISTANCE = 100; // m

    public double velocity(double time, double distance) {
	return distance / time;
    }

    public static void main(String[] args) {
	System.out.println("velocity: "
		+ new Velocity().velocity(TIME, DISTANCE) + " m/s");
    }

}
