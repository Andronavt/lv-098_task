/**
 * 
 */
package com.softserveinc.edu.lms.opearator;

/**
 * @author Maryan
 * 
 */
public class Exercise4 {
    private static final double DISTANCE = 100.0;
    private static final int TIME = 20;
    private static double speed;

    /**
     * @param args
     */
    public static void main(String[] args) {
	speed = Exercise4.countSpeed();
	System.out.println("Speed = " + speed + "km/hour");

    }


    public static double countSpeed() {
	return speed = DISTANCE / TIME;
    }

}
