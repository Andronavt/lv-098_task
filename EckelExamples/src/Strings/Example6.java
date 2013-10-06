/**
 * 
 */
package Strings;

/**
 * @author Oleg
 *
 */
class ToStrClass{
	int intVal=1;
	long longVal=1l;
	float floatVal=1.1f;
	double doubleVal=1.1;
	public String toString(){
		return String.format("i = %d\nl = %d\nf = %.16g\nd = %.16g\n", intVal, longVal, floatVal, doubleVal);
	}
}
public class Example6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new ToStrClass());
	}

}
