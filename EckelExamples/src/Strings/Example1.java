/**
 * 
 */
package Strings;

import javax.management.ImmutableDescriptor;

/**
 * @author Oleg
 * 
 *         Exercise 1: (2) Analyze SprinklerSystem.toString( ) in
 *         reusing/SprinklerSystem.java to discover whether writing the
 *         toString( ) with an explicit StringBuilder will save any
 *         StringBuilder creations.
 */
class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}
public class Example1 {

	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString() {
		return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " "
				+ "valve3 = " + valve3 + " " + "valve4 = " + valve4 + "\n"
				+ "i = " + i + " " + "f = " + f + " " + "source = " + source;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example1 sprinklers = new Example1();
		System.out.println(sprinklers);

	}

}
