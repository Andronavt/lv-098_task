/**
 * Exercise 1:   (2) Analyze SprinklerSystem.toString( ) in 
 * reusing/SprinklerSystem.java to discover whether writing the toString( ) with an 
 * explicit StringBuilder will save any StringBuilder creations.
 */
package Strings12;

/**
 * @author Богдан
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	SprinklerSystem.main(args);

    }

}

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

class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
	return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " "
		+ "valve3 = " + valve3 + " " + "valve4 = " + valve4 + "\n"
		+ "i = " + i + " " + "f = " + f + " " + "source = " + source;
    }

    public static void main(String[] args) {
	SprinklerSystem sprinklers = new SprinklerSystem();
	StringBuilder sb = new StringBuilder();
	System.out.println(sprinklers);
    }
}
