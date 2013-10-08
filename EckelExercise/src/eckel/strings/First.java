package eckel.strings;

/*
 * ex 1 
 * analyze SprinklerSystem.toString(), in reusing/SprinklerSystem.java to discover whether writing the toString(), with and 
 * explicit StringBuilder will save any StringBuilder creations.
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

class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
	return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " "
		+ "valve3 = " + valve3 + " " + "valve4 = " + valve4 + " "
		+ "i = " + i + " " + "f = " + f + " " + "source = " + source;
    }
}

public class First {

    public static void main(String[] args) {
	SprinklerSystem s = new SprinklerSystem();
	System.out.println(s);
    }
}
