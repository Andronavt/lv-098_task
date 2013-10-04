/**
 * 
 */
package everythingIsAnObject;

/**
 * @author Andrew
 * 
 */
public class Exercise11 {

    public static void main(String[] args) {
	new AllTheColorsOfTheRainbow();
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
	this.anIntegerRepresentingColors = newHue;
    }

}