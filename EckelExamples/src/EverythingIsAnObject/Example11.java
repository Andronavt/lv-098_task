/**
 * 
 */
package EverythingIsAnObject;

/**
 * @author Oleg
 * 
 */
class AllTheColorsOfTheRainbow {
    int anIntegerOrColor;

    AllTheColorsOfTheRainbow() {
	anIntegerOrColor = 1;
    }

    void ChangeTheColor(int newColor) {
	anIntegerOrColor = newColor;
    }
}

public class Example11 {
    public static void main(String[] args) {
	AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
	System.out.println(rainbow.anIntegerOrColor);
	rainbow.ChangeTheColor(2);
	System.out.println(rainbow.anIntegerOrColor);
	rainbow.ChangeTheColor(3);
	System.out.println(rainbow.anIntegerOrColor);
	rainbow.ChangeTheColor(4);
	System.out.println(rainbow.anIntegerOrColor);
	rainbow.ChangeTheColor(5);
	System.out.println(rainbow.anIntegerOrColor);
	rainbow.ChangeTheColor(6);
	System.out.println(rainbow.anIntegerOrColor);
	rainbow.ChangeTheColor(7);
	System.out.println(rainbow.anIntegerOrColor);
    }
}
