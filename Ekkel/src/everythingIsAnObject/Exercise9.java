/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 * 
 */
public class Exercise9 {
    public static void main(String[] args) {
	AutoDemo.demo();
    }
}

class AutoDemo {
    public static void demo() {
	int i;
	Integer I;

	i = 10;
	I = 12;

	System.out.println("i => " + i);
	System.out.println("I => " + I + '\n');

	i = I;
	System.out.println("i = I " + i);

	I = i;
	System.out.println("I = i " + I + '\n');

	Integer I2 = new Integer(5);
	Integer I3 = new Integer(i + 5);
	Integer I4 = new Integer(I + 6);

	System.out.println("I2 => " + I2);
	System.out.println("I3 => " + I3);
	System.out.println("I4 => " + I4);
    }
}
