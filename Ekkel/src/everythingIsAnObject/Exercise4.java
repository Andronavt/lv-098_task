/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 * 
 */
public class Exercise4 {
	public static void main(String[] args) {
		DataOnly data = new DataOnly();

		data.i = 47;
		data.d = 1.1;
		data.b = false;

		System.out.println(data);
	}
}

class DataOnly {
	int i;
	double d;
	boolean b;
}
