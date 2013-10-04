/**
 * 
 */
package everythingIsAnObject_1;

/**
 * @author Богдан
 *
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	DataOnly2 data = new DataOnly2();
	data.i = 10;
	data.d = 25.6;
	data.b = true;
	System.out.println(data);

    }

}

class DataOnly2 {
    int i;
    double d;
    boolean b;

    public String toString() {
	return "i = " + i + ", d = " + d + ", b = " + b + ".";
    }
}
