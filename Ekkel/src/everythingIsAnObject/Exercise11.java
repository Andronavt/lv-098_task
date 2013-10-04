/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 *
 */
public class Exercise11 {
    public static void main(String[] args) {
	AllTheColorsOfTheRainbow obj = new AllTheColorsOfTheRainbow();
	obj.changeTheHueOfTheColor(10);
    }
}

class AllTheColorsOfTheRainbow { 
    int anIntegerRepresentingColors; 
    void changeTheHueOfTheColor(int newHue) { 
      System.out.println(newHue); 
    } 
      // ... 
  } 
