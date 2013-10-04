/**
 * 
 */
package everythingIsAnObject;

/**
 * @author Andrew
 * 
 */
public class Exercise4 {
    public static void main(String[] args) {
	DataOnly data = new DataOnly();
	data.i = 47;
	data.d = 1.1;
	data.b = false;
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;

    public DataOnly() {
	System.out.println("Object created!");
    }

    public String toString() {
	return " i = " + i + "\n d = " + d + "\n b = " + b + "\n";
    }
}