/**
 * 
 */
package everythingIsAnObject_1;

/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	DataOnly data = new DataOnly();
	data.i = 10;
	data.d = 25.6;
	data.b = true;
	System.out.println(data);

    }

}

class DataOnly {
    int i;
    double d;
    boolean b;

    public String toString() {
	return "i = " + i + ", d = " + d + ", b = " + b + ".";
    }
}
