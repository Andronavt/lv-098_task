/**
 * 
 */
package everythingIsAnObject_1;

import java.lang.ProcessBuilder.Redirect;

/**
 * @author Богдан
 * 
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
	rainbow.changeTheHueOfTheColor(20);
	System.out.println(rainbow);
    }

}

class AllTheColorsOfTheRainbow {
    int red = 100;
    int orange = 200;
    int yello = 300;
    int green = 400;
    int cyan = 500;
    int blue = 600;
    int violet = 700;

    void changeTheHueOfTheColor(int newHue) {
	red = red + newHue;
	orange = orange + newHue;
	yello = yello + newHue;
	green = green + newHue;
	cyan = cyan + newHue;
	blue = blue + newHue;
	violet = violet + newHue;
    }

    public String toString() {
	return "red = " + red + ", orange = " + orange + ", yello = " + yello
		+ ", green = " + green + ", cyan = " + cyan + ", blue = "
		+ blue + ", voilet = " + violet;
    }

}